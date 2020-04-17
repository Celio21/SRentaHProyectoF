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

    vClientes cl;//Para llamar los metodos de la ventana de clientes que esta en vista
    Clientes c;//Para llamar los doatos
    ClientesDB lb;//Hacer las consultas de la base de datos

    public OyenteCrearCliente(vClientes v) {
        //Para que el metodo sea compatible con la ventana de 
        this.cl = v;
        cl.inhabilitar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c = cl.GuardarClientes();//Se obtiene los datos que nosotros ingresamos
        lb.guardarClientes(c);//Guardamos los datos en la base de datos llamando al metodo que esta en modelo
        JOptionPane.showConfirmDialog(cl, "El cliente a sido agregado con exito");
        
        

    }

}
