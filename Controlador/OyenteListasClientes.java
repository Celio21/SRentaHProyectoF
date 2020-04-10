/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.ClientesDB;
import Vista.VListaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mariopalma
 */
public class OyenteListasClientes implements ActionListener{
        VListaCliente vla;
	ClientesDB abd;
	public OyenteListasClientes(VListaCliente vla){
		this.vla = vla;
	}

   
	
	public void actionPerformed(ActionEvent arg0) {
		
                vla.actualizarEstudiante(abd.cargar());
	}
    
}
