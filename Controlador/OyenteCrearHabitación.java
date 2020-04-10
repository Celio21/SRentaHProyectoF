/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Habitacion;
import Modelo.HabitacionDb;
import Vista.Vilcabamba;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class OyenteCrearHabitación implements ActionListener{
  Vilcabamba v ;
HabitacionDb db;
Habitacion h;
public OyenteCrearHabitación(Vilcabamba r){
  this.v=r;
   v.inhabilitar();
}
    @Override
    public void actionPerformed(ActionEvent e) {
     
       h =v.GuardatHabitacion();
       v.inhabilitar();
       db.guardarHabitacion(h);
       
        JOptionPane.showConfirmDialog(v, "Se agregado con exito la habitación");
       
       
       
    }
    
}
