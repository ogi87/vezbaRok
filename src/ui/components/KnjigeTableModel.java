/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.components;

import domain.Knjiga;
import domain.Pisac;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import logic.Controller;

/**
 *
 * @author Ognjen
 */
public class KnjigeTableModel extends AbstractTableModel{
    private Pisac pisac;
    private List<Knjiga> knjige = new ArrayList<>();
    private String[] kolone = {"Naziv", "DatumIzdanja", "Tiraz"};
    
    public KnjigeTableModel(Pisac pisac){
        this.pisac = pisac;
    }
    
    public Knjiga getKnjiga(int rowIndex){
        if(rowIndex >= 0 && rowIndex < knjige.size()){
            return knjige.get(rowIndex);
        }
        return null;
    }
    
    public void ucitajKnjige() throws Exception{
        knjige = Controller.getinstance().ucitajKnjige(pisac);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return knjige.size();
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
        
      switch(columnIndex){
          case 0:
              return knjige.get(rowIndex).getNaziv();
          case 1:
              return knjige.get(rowIndex).getDatumIzdavanja();
          case 2:
              return knjige.get(rowIndex).getTiraz();
          default:
              return "N/A";
          
          
      }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    
    
}
