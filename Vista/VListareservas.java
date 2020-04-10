/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.OyenteListaReservas;
import Controlador.OyenteListasHabitaciones;
import Modelo.TMAlumno;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class VListareservas extends JFrame{
    private TMAlumno modeloDatos;
    JTable tablaResultados;
    private JLabel jlistas;
    
    public VListareservas(){
        
        
        super("Todas las reservas");
        setLocation (500,50);
        setSize(450,450);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        this.agregarComponentes();
        setVisible(true);
		
    }
    private void agregarComponentes() {
        jlistas=new JLabel("LISTAS DE RESERVAS");
        // establece objeto JButton para enviar las consultas
        JButton botonConsultar = new JButton( "Consultas" );
        botonConsultar.addActionListener(new OyenteListaReservas(this));
        // crea objeto Box para manejar la colocación de areaConsulta y
        // botonEnviar en la GUI
        Box boxNorte = Box.createHorizontalBox();
        boxNorte.add( jlistas );
        boxNorte.add( botonConsultar );
        // crea delegado de JTable para modeloTabla
        //JTable tablaResultados = new JTable( modeloTabla );
        
        tablaResultados = new JTable( );
        add( boxNorte, BorderLayout.NORTH );
        add( new JScrollPane( tablaResultados ), BorderLayout.CENTER );
    }
    public void actualizarEstudiante(ArrayList lis){
                
                 modeloDatos= new TMAlumno(lis);
                 tablaResultados.setModel(modeloDatos);
   
                
	}
    public static void main(String[] args) {
        VListareservas lo = new VListareservas();
    }
}
