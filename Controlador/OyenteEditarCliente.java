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
public class OyenteEditarCliente  implements ActionListener{
  vClientes vntest;
    Clientes est;
    ClientesDB cnnest;

    public OyenteEditarCliente(vClientes vntest) {
        this.vntest = vntest;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        vntest.inhabilitar();
        est = vntest.GuardarClientes();
        cnnest.editarCliente(est);
        JOptionPane.showMessageDialog(null, "Se a editado con exito");
        vntest.limpiarCampos();

    }
}

   
