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
public class OyenteCrearCliente implements ActionListener {

    vClientes cl;
    Clientes c;
    ClientesDB lb;

    public OyenteCrearCliente(vClientes v) {
        this.cl = v;
        cl.inhabilitar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c = cl.GuardarClientes();
        lb.guardarClientes(c);
        JOptionPane.showConfirmDialog(cl, "El cliente a sido agregado con exito");
        
        

    }

}
