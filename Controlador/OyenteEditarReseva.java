/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.reserva;
import Modelo.reservaDB;
import Vista.ReservaV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class OyenteEditarReseva implements ActionListener{
      ReservaV vntest;
    reserva est;
    reservaDB cnnest;

    public  OyenteEditarReseva(ReservaV vntest) {
        this.vntest = vntest;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        vntest.inhabilitar();
        est = vntest.HacerReserva();
        cnnest.editarHabitacion(est);
        JOptionPane.showMessageDialog(null, "Se a editado con exito");
        vntest.LimpiarCampos();

    }
}

   
    

