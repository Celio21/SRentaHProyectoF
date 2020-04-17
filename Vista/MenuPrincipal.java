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
import java.awt.event.MouseEvent;
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
    private JMenu INICIO;
    private JMenu registros;
    private JMenu Rentar;
    private JMenu salir;
    private JMenu consultas;
    private JMenuItem Habitaciones;
    private JMenuItem Clientes;
    private JMenuItem Rentarhab;
    private JMenuItem tablaclien;
    private JMenuItem tablahab;
    private JMenuItem tablareser;

    public MenuPrincipal() {

        setLayout(null);
//Todo en la barra donde estaran ubicados los menus como inicio que no tiene ninguna accion 
        todo = new JMenuBar();
        setJMenuBar(todo);
        //No tiene acction
        INICIO = new JMenu("Inicio");
        //Se llama a la imagen que esta ubicada en la carpeta de imagenes
        INICIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Inicio.png")));
        INICIO.setEnabled(false);
        //agregamos a las barrra de menus el menu de inicio 
        todo.add(INICIO);

        //El menu reguistrar tendras los menuInten que son de Habitaciones
        registros = new JMenu("Registrar");
         Habitaciones = new JMenuItem("Habitaciones");
        Habitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/habitaciones.png")));
        Habitaciones.addActionListener(this);
        registros.add(Habitaciones);
       //Clientes
        
        Clientes = new JMenuItem("Clientes");
        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/clientes.png")));
         Clientes.addActionListener(this);
       // registros.addActionListener(this);
        registros.add(Clientes);
          registros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Archivo.png")));
        todo.add(registros);

       

        

       

        Rentar = new JMenu("Servicios");
      

        Rentar.addActionListener(this);
        todo.add(Rentar);
        Rentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/reservas-consumos.png")));
        Rentarhab = new JMenuItem("RENTAR");
        Rentarhab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Reservas.png")));
        Rentarhab.addActionListener(this);
        Rentar.add(Rentarhab);

        consultas = new JMenu("Consultas");
        consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Consultas.png")));
        tablahab = new JMenuItem("Habitaciones");
        tablahab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/habitaciones.png")));
        tablaclien = new JMenuItem("Clientes");
        tablaclien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/clientes.png")));
        tablareser = new JMenuItem("Ver reservaciones");

        tablareser.addActionListener(this);
        tablareser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Reservas.png")));
        tablaclien.addActionListener(this);
        tablahab.addActionListener(this);
        consultas.add(tablahab);
        consultas.add(tablaclien);
        consultas.add(tablareser);

        todo.add(consultas);
         salir= new JMenu("Salir");
         //Se implemento una Accion la cual se ejecutara para cuando de clic en el menu de salir llame al metodode accion dispose 
         salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
//Metodo para salir desde el Menu
            private void salirMouseClicked(MouseEvent evt) {
               dispose();
            }
        });
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Salir.png")));
        todo.add(salir);
      

            
          
                
                
            
        

    }
//Aqui es donde se les da accion a los MenuIntem si pulsa alguno de estos llamara a la ventana indicada
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
    //metodo Main aqui estamos haciendo que sea visible le damos un tamañaño

    public static void main(String[] args) {
        MenuPrincipal rh = new MenuPrincipal();
rh.setTitle("Hoteles Vilcabamba");
        rh.setBounds(WIDTH, WIDTH, 2000, 1000);
        rh.setVisible(true);
        rh.setLocationRelativeTo(null);

    }

}
