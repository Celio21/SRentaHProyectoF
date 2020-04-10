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

/**
 *
 * @author USUARIO
 */
public class OyenteNuevoC implements ActionListener{
    
    vClientes cl;
    Clientes c;
    ClientesDB lb;

    public OyenteNuevoC(vClientes v) {
        this.cl = v;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       cl.limpiarCampos();
       cl.habilitar();
    }
}
