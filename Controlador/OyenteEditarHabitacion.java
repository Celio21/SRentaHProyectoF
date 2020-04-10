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
public class OyenteEditarHabitacion implements ActionListener{
     Vilcabamba vntest;
    Habitacion est;
    HabitacionDb cnnest;

    public  OyenteEditarHabitacion(Vilcabamba vntest) {
        this.vntest = vntest;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        vntest.inhabilitar();
        est = vntest.GuardatHabitacion();
        cnnest.editarHabitacion(est);
        JOptionPane.showMessageDialog(null, "Se a editado con exito");
        vntest.LimpiarCampos();

    }
}

   