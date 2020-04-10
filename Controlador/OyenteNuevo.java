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

/**
 *
 * @author USUARIO
 */
public class OyenteNuevo implements ActionListener{
Vilcabamba v ;
HabitacionDb db;
Habitacion h;
public OyenteNuevo(Vilcabamba v){
    this.v=v;
}

    @Override
    public void actionPerformed(ActionEvent e) {
      v.LimpiarCampos();
      v.habilitar();
    }
}
