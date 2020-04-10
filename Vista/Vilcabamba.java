/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.OyenteCrearHabitación;
import Controlador.OyenteEditarHabitacion;
import Controlador.OyenteEliminarHabitacion;
import Controlador.OyenteNuevo;
import Controlador.OyenteVerificarHabitacion;
import Modelo.Habitacion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author USUARIO
 */
public class Vilcabamba extends JFrame {

    //Panel
    JPanel p = new JPanel();
//Solo labels

    JLabel Numero = new JLabel("Numero");
    JLabel piso = new JLabel("Piso");
    JLabel descripcion = new JLabel("Descripción");
    JLabel caracteristicas = new JLabel("Servicios");
    JLabel precio = new JLabel("Precio Diario");
    JLabel estado = new JLabel("Estado");
    JLabel tipo = new JLabel("Tipo Habitación");
    JLabel etiqueta = new JLabel();

    //Solo Text
    JTextField Numerot = new JTextField();

    JTextArea descripciont = new JTextArea();
    JTextArea caracteristicast = new JTextArea();
    JTextField preciot = new JTextField();

    //Combos
    JComboBox cbpiso = new JComboBox();
    JComboBox cbestado = new JComboBox();
    JComboBox cbtipo = new JComboBox();
    //Botones 
    JButton guardar = new JButton("Guardar");
    JButton verificar = new JButton("verificar");
    JButton eliminar = new JButton("Eliminar");
    JButton actualizar = new JButton("Actualizar");
    JButton cancelar = new JButton("Cancelar");
    JButton nuevo = new JButton("Nuevo");

    public Vilcabamba() {
        setTitle("Habitaciones");
        setVisible(true);
        setDefaultLookAndFeelDecorated(true);
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocation(0, 0);

        getContentPane().add(p);
        p.setBackground(Color.WHITE);
        p.setLayout(null);

        etiqueta.setText("Habitaciones");
        etiqueta.setBounds(200, 1, 300, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.black);
        etiqueta.setFont(new Font("cooper black", 0, 40));
        p.add(etiqueta);

        Numero.setBounds(25, 60, 80, 20);
        p.add(Numero);
        Numerot.setBounds(130, 60, 150, 20);
        p.add(Numerot);

        verificar.setBounds(300, 60, 100, 20);
         verificar.addActionListener(new OyenteVerificarHabitacion(this));
       
        p.add(verificar);
        nuevo.setBounds(450, 60, 100, 20);
         nuevo.addActionListener(new OyenteNuevo(this));
       
        p.add(nuevo);

        piso.setBounds(25, 100, 80, 20);
        p.add(piso);

        String[] cx = {"1", "2", "3", "4", "5", "6"};
        cbpiso = new JComboBox(cx);
        cbpiso.setBounds(130, 100, 50, 20);

        p.add(cbpiso);

        descripcion.setBounds(25, 140, 80, 20);
        p.add(descripcion);

        descripciont.setBounds(130, 140, 200, 100);
        descripciont.setBackground(Color.cyan);
        p.add(descripciont);

        caracteristicas.setBounds(25, 250, 100, 20);
        p.add(caracteristicas);

        caracteristicast.setBounds(130, 250, 200, 100);
        caracteristicast.setBackground(Color.cyan);

        p.add(caracteristicast);

        precio.setBounds(25, 380, 80, 20);
        p.add(precio);

        preciot.setBounds(130, 380, 150, 20);
        p.add(preciot);

        estado.setBounds(25, 430, 80, 20);
        p.add(estado);

        String[] cd = {"Bueno", "Malo", "Mantenimiento"};
        cbestado = new JComboBox(cd);
        cbestado.setBounds(130, 430, 150, 20);
        p.add(cbestado);

        tipo.setBounds(25, 480, 150, 20);
        p.add(tipo);

        String[] tipo = {"Personal", "Matrimonial", "Familiar"};
        cbtipo = new JComboBox(tipo);
        cbtipo.setBounds(130, 480, 150, 20);
        p.add(cbtipo);

        guardar.setBounds(80, 550, 80, 20);
        p.add(guardar);
        guardar.addActionListener(new OyenteCrearHabitación(this));

        actualizar.setBounds(200, 550, 120, 20);
        actualizar.addActionListener(new OyenteEditarHabitacion(this));
        p.add(actualizar);
        eliminar.setBounds(350, 550, 120, 20);
        eliminar.addActionListener(new OyenteEliminarHabitacion(this));
        eliminar.addActionListener(new OyenteEliminarHabitacion(this));
        p.add(eliminar);

        cancelar.setBounds(480, 550, 120, 20);
        cancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==cancelar) {
                    dispose();
                }
            }
        });
        p.add(cancelar);
    
    }
    
        
        
    


    public Habitacion GuardatHabitacion() {
        if (Numerot.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Número de Habitación");
            Numerot.requestFocus();

        }
        if (descripciont.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar la descrición de la habitación");
            descripciont.requestFocus();

        }
        if (caracteristicast.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar las caracteristicas");
            caracteristicast.requestFocus();

        }
        if (preciot.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el precio diario");
            preciot.requestFocus();

        }
        int seleccionado = cbpiso.getSelectedIndex();
        int otro = cbestado.getSelectedIndex();
         int otro1 = cbtipo.getSelectedIndex();

        Habitacion h = new Habitacion();
        h.setNumero(Numerot.getText());
        h.setPiso((String) cbpiso.getItemAt(seleccionado));
        
        h.setDescripcion(descripciont.getText());

        h.setCaracteristicas(caracteristicast.getText());
        h.setPrecioDiario(preciot.getText());

       
        
        h.setEstado((String) cbestado.getItemAt(otro));


        h.setTipo_habitacion((String) cbtipo.getItemAt(otro1));

        return h;
        
    }
   public  void inhabilitar(){
        Numerot.setEditable(true);
        cbestado.setEnabled(false);
        cbpiso.setEnabled(false);
        cbtipo.setEnabled(false);
        descripciont.setEditable(false);
        caracteristicast.setEditable(false);
        preciot.setEditable(false);
        actualizar.setEnabled(false);
        eliminar.setEnabled(false);
        guardar.setEnabled(false);
        
    }
    public void habilitar(){
         Numerot.setEditable(true);
        cbestado.setEnabled(true);
        cbpiso.setEnabled(true);
        cbtipo.setEnabled(true);
        descripciont.setEditable(true);
        caracteristicast.setEditable(true);
        preciot.setEditable(true);
        actualizar.setEnabled(true);
        eliminar.setEnabled(true);
        
         guardar.setEnabled(true);
    }
    public void CargarCampos(Habitacion h){
        
         descripciont.setText(h.getDescripcion());
           caracteristicast.setText(h.getCaracteristicas());
           preciot.setText(h.getPrecioDiario());
    }
     public String verificarH(Habitacion h){
          
           
             
         return Numerot.getText();
    
         
     }
      public String EliminarH(Habitacion h){
          
           
             
         return Numerot.getText();
    
         
     }

     public void LimpiarCampos (){
         
      descripciont.setText(null);
      caracteristicast.setText(null);
      preciot.setText(null);
     }
    
    

    public static void main(String[] args) {
        Vilcabamba r = new Vilcabamba();
    
    }
}
