/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db;
import domain.Knjiga;
import domain.Pisac;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ognjen
 */
public class DatabaseBroker {
    
    private Connection c;
    public void connect() throws SQLException{
       
        try {
            String url = "jdbc:mysql://localhost:3306/pisac";
            String user = "root";
            String password = "";
            c = DriverManager.getConnection(url, user, password);
            System.out.println("Povezan sa bazom");
            
        } catch (SQLException ex) {
            System.out.println("Doslo je do greske pri povezivanju sa bazom");
            ex.printStackTrace();
        } 
    }
    
    public void disconnect() throws SQLException{
        try{
            if(c != null && !c.isClosed()){
            c.close();
            System.out.println("Konekcija sa bazom je raskinuta");
        }
        }catch(SQLException ex){
            System.out.println("Greska! Konekcija nije uspesno raskinuta");
            ex.printStackTrace();
        }
    }
    
    public Pisac login(String email, String sifra) throws Exception{

        String query = "SELECT pisacID, email, ime, prezime FROM pisac " +
                        "WHERE email = ? AND sifra = ?";
        PreparedStatement ps = c.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2, sifra);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Pisac p = new Pisac();
            p.setPisacID(rs.getLong("pisacID"));
            p.setEmail(rs.getString("email"));
            p.setIme(rs.getString("ime"));
            p.setPrezime(rs.getString("prezime"));
            return p;
        } else{
            throw new Exception("Pogresan email ili sifra");
        }
       
    }
    
    public List<Knjiga> vratiListuKnjiga(Pisac pisac) throws SQLException{
        
        List<Knjiga> knjige = new ArrayList<>();
        String query = "SELECT k.knjigaID, k.naziv, k.datumIzdavanja, k.tiraz\n" +
                       "FROM knjiga k JOIN pisac p ON k.autorID = p.pisacID\n" +
                       "WHERE k.autorID = ?";
        PreparedStatement ps = c.prepareStatement(query);
        ps.setLong(1, pisac.getPisacID());
        
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Knjiga k = new Knjiga();
            k.setKnjigaID(rs.getLong("knjigaID"));
            k.setNaziv(rs.getString("naziv"));
            k.setDatumIzdavanja(rs.getDate("datumIzdavanja").toLocalDate());
            k.setTiraz(rs.getInt("tiraz"));
            knjige.add(k);
        }

        return knjige;
    }
    
    
}
