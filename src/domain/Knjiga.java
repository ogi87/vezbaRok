/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDate;

/**
 *
 * @author Ognjen
 */
public class Knjiga {
    
    private Long knjigaID;
    private String naziv;
    private LocalDate datumIzdavanja;
    private int tiraz;
    private Pisac autorID;
    
    public Knjiga() {

    }
    
    public Knjiga(Long knjigaID, String naziv, LocalDate datumIzdavanja, int tiraz, Pisac autorID) {
        this.knjigaID = knjigaID;
        this.naziv = naziv;
        this.datumIzdavanja = datumIzdavanja;
        this.tiraz = tiraz;
        this.autorID = autorID;
    }

    

    public Long getKnjigaID() {
        return knjigaID;
    }

    public void setKnjigaID(Long knjigaID) {
        this.knjigaID = knjigaID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public LocalDate getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(LocalDate datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public int getTiraz() {
        return tiraz;
    }

    public void setTiraz(int tiraz) {
        this.tiraz = tiraz;
    }

    public Pisac getAutorID() {
        return autorID;
    }

    public void setAutorID(Pisac autorID) {
        this.autorID = autorID;
    }

    @Override
    public String toString() {
        return "Knjiga{" + "knjigaID=" + knjigaID + ", naziv=" + naziv + ", datumIzdavanja=" + datumIzdavanja + ", tiraz=" + tiraz + ", autorID=" + autorID + '}';
    }
    
    
}
