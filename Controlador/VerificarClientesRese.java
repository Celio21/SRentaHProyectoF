/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.ClientesDB;
import Vista.ReservaV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class VerificarClientesRese implements ActionListener{
     ReservaV cl;
    Clientes c;
    ClientesDB lb;

    public VerificarClientesRese( ReservaV cl) {
        this.cl = cl;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        c = lb.buscarCliente(cl.verificarC());

        if (c.getNumeroDoc() == null) {
            cl.inhabilitar();
            JOptionPane.showConfirmDialog(cl, "El cliente no esta registrado no puedes seguir");

        } else {

            JOptionPane.showConfirmDialog(cl, "El cliente esta registrado ");

            
            cl.habilitar();
        }

    }
}
