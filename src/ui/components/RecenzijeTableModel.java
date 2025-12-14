/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.components;

import domain.Knjiga;
import domain.Recenzija;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import logic.Controller;

/**
 *
 * @author Ognjen
 */
public class RecenzijeTableModel extends AbstractTableModel{
    
    private Knjiga knjiga;
    private List<Recenzija> recenzije = new ArrayList<>();
    private String[] kolone = {"Ocena", "Komentar", "Autor Recenzije"};
    
    public RecenzijeTableModel(Knjiga knjiga){
        this.knjiga = knjiga;
    }
    
    public void ucitajRecenzije() throws Exception{
        recenzije = Controller.getinstance().ucitajRecenzijeZaKnjigu(knjiga);
        fireTableDataChanged();
    }
    
    
    @Override
    public int getRowCount() {
       return recenzije.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }
    
    @Override
    public String getColumnName(int column){
        return kolone[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Recenzija r = recenzije.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return r.getOcena();
            case 1:
                return r.getKomentar();
            case 2:
                return r.getAutorRecenzijeID().getIme() + " " + r.getAutorRecenzijeID().getPrezime();
            default:
                return "N/A";
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    
}
