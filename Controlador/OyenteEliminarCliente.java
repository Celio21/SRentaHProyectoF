/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClientesDB;
import Vista.vClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class OyenteEliminarCliente implements ActionListener{
    //llamanos las clases 
    vClientes vtnest;
    ClientesDB cest;

    public OyenteEliminarCliente(vClientes vtnest) {

        this.vtnest = vtnest;

    }

    public void actionPerformed(ActionEvent e) {
        
//enviamos un mensaje de confirmacion 
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Datos", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resp == JOptionPane.YES_OPTION) {
        cest.eliminarCliente(vtnest.EliminarC());
        JOptionPane.showMessageDialog(null, "El cliente a sido borrado de la base de datos");
        vtnest.limpiarCampos();

         } else if (resp == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Se cancelo la eliminacion");

        }
    }
}
