/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.reservaDB;
import Vista.ReservaV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class OyenteEliminarReserva implements ActionListener{
      //llamanos las clases 
    ReservaV vt;
    reservaDB ce;

    public OyenteEliminarReserva( ReservaV vt) {

        this.vt = vt;

    }

    public void actionPerformed(ActionEvent e) {
        
//enviamos un mensaje de confirmacion 
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Datos", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resp == JOptionPane.YES_OPTION) {
        ce.eliminar(vt.EliminarR(null));
        JOptionPane.showMessageDialog(null, "La reserva a sido eliminada de la base de datos");
        vt.LimpiarCampos();

         } else if (resp == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Se cancelo la eliminacion");

        }
    }
}