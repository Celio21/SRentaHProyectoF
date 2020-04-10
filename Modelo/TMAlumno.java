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
public class TMAlumno  implements TableModel{
    private List <reserva> la;
    
    public TMAlumno (List<reserva> Lista){
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
                titulo="Codigo";
                break;
            }
             case 1:{
                titulo="Habitacion";
                break;
            }
              case 2:{
                titulo="Cliente";
                break;
            }
               case 3:{
                titulo="Tipo";
                break;
            }
                case 4:{
                titulo="FechaReserva";
                break;
            }
                 case 5:{
                titulo="FechaSalida";
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
        reserva e= la.get(rowIndex);
        String valor=null;
        
        switch(columnIndex){
            case 0:{
               valor=e.getIdReserva();
                break;
            }
             case 1:{
                valor=e.getIdhabitacion();
                break;
            }
              case 2:{
                valor=e.getIdcliente();
                break;
            }
               case 3:{
               valor=e.getTipo_reserva();
                break;
            }
                case 4:{
                valor=e.getFecha_reserva();
                break;
            }
                 case 5:{
                valor=e.getFecha_salida();
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
