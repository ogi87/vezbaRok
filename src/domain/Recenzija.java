/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Ognjen
 */
public class Recenzija {
    
    public Long recenzijaID;
    public Knjiga knjigaID;
    public Pisac autorRecenzijeID;
    private int ocena;
    private String komentar;
    
    public Recenzija() {

       }
    
    public Recenzija(Long recenzijaID, Knjiga knjigaID, Pisac autorRecenzijeID, int ocena, String komentar) {
        this.recenzijaID = recenzijaID;
        this.knjigaID = knjigaID;
        this.autorRecenzijeID = autorRecenzijeID;
        this.ocena = ocena;
        this.komentar = komentar;
    }

   

    public Long getRecenzijaID() {
        return recenzijaID;
    }

    public void setRecenzijaID(Long recenzijaID) {
        this.recenzijaID = recenzijaID;
    }

    public Knjiga getKnjigaID() {
        return knjigaID;
    }

    public void setKnjigaID(Knjiga knjigaID) {
        this.knjigaID = knjigaID;
    }

    public Pisac getAutorRecenzijeID() {
        return autorRecenzijeID;
    }

    public void setAutorRecenzijeID(Pisac autorRecenzijeID) {
        this.autorRecenzijeID = autorRecenzijeID;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    @Override
    public String toString() {
        return "Recenzija{" + "recenzijaID=" + recenzijaID + ", knjigaID=" + knjigaID + ", autorRecenzijeID=" + autorRecenzijeID + ", ocena=" + ocena + ", komentar=" + komentar + '}';
    }
    
    
    
}
