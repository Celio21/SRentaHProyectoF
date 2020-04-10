/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

/**
 *
 * @author mariopalma
 */
public class THabitacion  implements TableModel{
    private List <Habitacion> la;
    
    public THabitacion (List<Habitacion> Lista){
        la=Lista;
    }
    @Override
    public int getRowCount() {
        return la.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        
        String titulo=null;
        switch(columnIndex){
            case 0:{
                titulo="Numero";
                break;
            }
             case 1:{
                titulo="Piso";
                break;
            }
              case 2:{
                titulo="Descripcion";
                break;
            }
               case 3:{
                titulo="Caracteristicas";
                break;
            }
                case 4:{
                titulo="Precio Diario";
                break;
            }
                 case 5:{
                titulo="Estado";
                break;
            }
                  case 6:{
                titulo="Tipo Habitacio";
                break;
                  }
                
        }
        return titulo;
      
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Habitacion e= la.get(rowIndex);
        String valor=null;
        
        switch(columnIndex){
            case 0:{
               valor=e.getNumero();
                break;
            }
             case 1:{
                valor=e.getPiso();
                break;
            }
              case 2:{
                valor=e.getDescripcion();
                break;
            }
               case 3:{
               valor=e.getCaracteristicas();
                break;
            }
                case 4:{
                valor=e.getPrecioDiario();
                break;
            }
                 case 5:{
                valor=e.getEstado();
                break;
            }
                case 6:{
                valor=e.getTipo_habitacion();
                break;
                }
        }
        return valor;
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       //sirve si en caso modifica de la tabla
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
    
}
