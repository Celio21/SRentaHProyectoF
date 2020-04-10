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
public class OyenteVerificarHabitacion implements ActionListener{
Vilcabamba v ;
HabitacionDb db;
Habitacion h;
 public OyenteVerificarHabitacion(Vilcabamba v) {
        this.v = v;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
h=db.buscarHabitacion(v.verificarH(h));
        
    
    if (h.getNumero()==null) {
        JOptionPane.showConfirmDialog(v, "Esta Habitación no existe");
        v.LimpiarCampos();
        v.habilitar();
        
    }
            
    
    else{
        v.CargarCampos(h);
        
       v.habilitar();
        JOptionPane.showConfirmDialog(v, "La habitacion si existe");
        
    }

    }
}