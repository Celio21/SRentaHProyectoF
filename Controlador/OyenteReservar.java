/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.reserva;
import Modelo.reservaDB;
import Vista.ReservaV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class OyenteReservar implements ActionListener{
    ReservaV v ;
reservaDB db;
reserva h;
public OyenteReservar(ReservaV r){
    this.v=r;
   v.inhabilitar();
   v.InhabilitarCliente();
   v.ihabilitarHabita();
}

    @Override
    public void actionPerformed(ActionEvent e) {
         h =v.HacerReserva();
          db.guardarReserva(h);
          JOptionPane.showConfirmDialog(v," La reserva se hizo con exito");
          v.LimpiarCampos();
    }
}

