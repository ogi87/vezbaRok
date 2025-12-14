/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Ognjen
 */
public class Pisac {
    
    private Long pisacID;
    private String email;
    private String sifra;
    private String ime;
    private String prezime;
    
    public Pisac() {
        
    }
    
    public Pisac(Long pisacID, String email, String sifra, String ime, String prezime) {
        this.pisacID = pisacID;
        this.email = email;
        this.sifra = sifra;
        this.ime = ime;
        this.prezime = prezime;
    }

   

    public Long getPisacID() {
        return pisacID;
    }

    public void setPisacID(Long pisacID) {
        this.pisacID = pisacID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Pisac{" + "pisacID=" + pisacID + ", email=" + email + ", sifra=" + sifra + ", ime=" + ime + ", prezime=" + prezime + '}';
    }
    
    
    
}
