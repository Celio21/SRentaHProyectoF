/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.reserva;
import Modelo.reservaDB;
import Vista.ReservaV ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class OyenteVerificarReserva implements ActionListener {
ReservaV v ;
reservaDB db;
reserva h;
 public OyenteVerificarReserva(ReservaV v) {
        this.v = v;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
h=db.buscarReserva(v.verificarR(h));
        
    
    if (h.getIdReserva()==null) {
        JOptionPane.showConfirmDialog(v, "No hay nada");
        v.habilitarHabita();
        
    }
            
    
    else{
        
        
       
        JOptionPane.showConfirmDialog(v, "Ya esta registrado");
        v.habilitar();
        v.habilitarCliente();
        v.CargarCampos(h);
    }

    }
}