/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.ClientesDB;
import Vista.vClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class OyenteVerificarCliente implements ActionListener {

    vClientes cl;
    Clientes c;
    ClientesDB lb;

    public OyenteVerificarCliente(vClientes cl) {
        this.cl = cl;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        c = lb.buscarCliente(cl.verificarC());

        if (c.getNumeroDoc() == null) {
            cl.habilitar();
            cl.limpiarCampos();
            JOptionPane.showConfirmDialog(cl, "No hay nada");

        } else {

            JOptionPane.showConfirmDialog(cl, "Ya esta registrado");

            cl.cargarCampos(c);
            cl.habilitar();
        }

    }
}
