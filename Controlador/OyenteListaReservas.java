/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.reservaDB;
import Vista.VListareservas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mariopalma
 */
public class OyenteListaReservas implements ActionListener{
        VListareservas vla;
	reservaDB abd;
	public OyenteListaReservas(VListareservas vla){
		this.vla = vla;
	}

   
	
	public void actionPerformed(ActionEvent arg0) {
		
                vla.actualizarEstudiante(abd.cargar());
	}
    
}
