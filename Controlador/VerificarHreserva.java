/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Habitacion;
import Modelo.HabitacionDb;
import Vista.ReservaV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class VerificarHreserva implements ActionListener{
   ReservaV v ;
HabitacionDb db;
Habitacion h;
 public VerificarHreserva( ReservaV v) {
        this.v = v;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
 h = db.buscarHabitacion(v.verificarH());
        
    
    if (h.getNumero()==null) {
        JOptionPane.showConfirmDialog(v, "La Habitación no esta registrada");
        v.LimpiarCampos();
        v.inhabilitar();
        
    }
            
    
    else{
        
        
       
        JOptionPane.showConfirmDialog(v, "La habitacion si esta registrada");
        v.inhabilitar();
        v.habilitarHabita();
        v.habilitarCliente();
    }

    }
}