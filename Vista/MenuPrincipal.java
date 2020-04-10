/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class MenuPrincipal extends JFrame implements ActionListener {


    private JMenuBar todo;
    private JMenu registros;
    private JMenu Rentar;
    private JMenu salir;
    private JMenuItem Habitaciones;
    private JMenuItem Clientes;
    private JMenuItem Rentarhab;
    private JMenuItem tablaclien;
    private JMenuItem tablahab;
    private JMenuItem tablareser;
  

    public MenuPrincipal() {
    
       
      
       
        setLayout(null);
       
        todo = new JMenuBar();
        setJMenuBar(todo);
        registros = new JMenu("Registrar");
        todo.add(registros);
        

        Habitaciones = new JMenuItem("Habitaciones");
        Habitaciones.addActionListener(this);
        registros.add(Habitaciones);

        Clientes = new JMenuItem("Clientes");
        registros.addActionListener(this);
        registros.add(Clientes);
        Clientes.addActionListener(this);

        Rentar = new JMenu("Servicios");
        Rentar.addActionListener(this);
        todo.add(Rentar);

        Rentarhab = new JMenuItem("RENTAR");
        Rentarhab.addActionListener(this);
        Rentar.add(Rentarhab);

        salir = new JMenu("Consultas");
        tablahab = new JMenuItem("Habitaciones");
        tablaclien = new JMenuItem("Clientes");
        tablareser = new JMenuItem("Ver reservaciones");
        tablareser.addActionListener(this);

        tablaclien.addActionListener(this);
        tablahab.addActionListener(this);
        salir.add(tablahab);
        salir.add(tablaclien);
        salir.add(tablareser);

        todo.add(salir);
        salir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == salir) {
                    dispose();
                }
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Habitaciones) {

            Vilcabamba hola = new Vilcabamba();

        }
        if (e.getSource() == Clientes) {

            vClientes cl = new vClientes();

        }

        if (e.getSource() == Rentarhab) {
            ReservaV rv = new ReservaV();

        }
        if (e.getSource() == tablahab) {
            VListaHabitaciones ñk = new VListaHabitaciones();
        }
        if (e.getSource() == tablaclien) {
            VListaCliente lc = new VListaCliente();

        }
        if (e.getSource() == tablareser) {
            VListareservas lo = new VListareservas();

        }
    }

    public static void main(String[] args) {
        MenuPrincipal rh = new MenuPrincipal();

        rh.setBounds(WIDTH, WIDTH, 2000, 1000);
        rh.setVisible(true);
        rh.setLocationRelativeTo(null);
        
    }

}
