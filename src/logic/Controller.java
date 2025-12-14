/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import domain.Knjiga;
import domain.Pisac;
import java.sql.SQLException;
import java.util.List;
import repository.db.DatabaseBroker;

/**
 *
 * @author Ognjen
 */
public class Controller {
    
    private DatabaseBroker dbbr;
    private static Controller instance;
    
    public Controller(){
        dbbr = new DatabaseBroker();
    }
    
    public static Controller getinstance(){
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }
    
    public Pisac ulogujPisac(String email, String sifra) throws Exception{
        dbbr.connect();
        try{
            return dbbr.login(email, sifra);
        }finally{
            dbbr.disconnect();
        }
    }
    
    public List<Knjiga> ucitajKnjige(Pisac pisac) throws Exception{
        dbbr.connect();
        try{
            return dbbr.vratiListuKnjiga(pisac);
        }finally{
            dbbr.disconnect();
        }
    }
    
    
}
