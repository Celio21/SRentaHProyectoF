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
//Traemos el precio de la habitacion y lo llamamos desde la ventana reserva
public class OyenteHreservaTraerPrecio implements ActionListener{
   ReservaV v ;
HabitacionDb db;
Habitacion h;
 public OyenteHreservaTraerPrecio( ReservaV v) {
        this.v = v;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
 h = db.buscarHabitacionCosto(v.verificarH());
 
        v.cargarPrecio(); 
    
    }
}