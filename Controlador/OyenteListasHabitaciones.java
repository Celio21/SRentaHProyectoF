/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.HabitacionDb;
import Vista.VListaHabitaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mariopalma
 */
public class OyenteListasHabitaciones implements ActionListener{
        VListaHabitaciones vla;
	HabitacionDb abd;
	public OyenteListasHabitaciones(VListaHabitaciones vla){
		this.vla = vla;
	}

   
	
	public void actionPerformed(ActionEvent arg0) {
		
                vla.actualizarEstudiante(abd.cargar());
	}
    
}
