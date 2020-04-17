/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.OyenteCrearCliente;
import Controlador.OyenteCrearHabitación;
import Controlador.OyenteEditarCliente;
import Controlador.OyenteEliminarCliente;
import Controlador.OyenteNuevoC;
import Controlador.OyenteVerificarCliente;
import Modelo.Clientes;
import Modelo.Habitacion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
public class vClientes extends JFrame {

    JPanel p = new JPanel();

    //Labels
    JLabel tipodoc = new JLabel("Tipo de doc");
    JLabel numero = new JLabel("Numero de id");
    JLabel nombres = new JLabel("Nombres");
    JLabel apellidos = new JLabel("Apellidos");
    JLabel estadoc = new JLabel("Estado Civil");
    JLabel fecha = new JLabel("Fecha Nacimiento");
    JLabel enfermedades = new JLabel("Atenciones");
    JLabel etiqueta = new JLabel();
    //combos
    JComboBox cbtipod = new JComboBox();
    //Checbox
    JComboBox cbsexo = new JComboBox();
    JComboBox cbmeses = new JComboBox();

    //Texfiel
    JTextField numerot = new JTextField();
    JTextField nombre = new JTextField();
    JTextField apellido = new JTextField();
    JTextField fechat = new JTextField();
    JTextField años = new JTextField();
    JTextArea enfermedadest = new JTextArea();
    //Buscar 
    JButton verificar = new JButton("Verificar");
    JButton guardar = new JButton("Guardar");
    JButton eliminar = new JButton("Eliminar");
    JButton actualizar = new JButton("actualizar");
    JButton cancelar = new JButton("Cancelar");
    JButton nuevo = new JButton("Nuevo");

    public vClientes() {
//Agregamos todos los componentes al panel y a estos les ponemos imagenes
        setTitle("Registro de clientes ");
        setVisible(true);
        setDefaultLookAndFeelDecorated(true);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocation(0, 0);
        p.setBorder(javax.swing.BorderFactory.createTitledBorder("ISTL"));
        getContentPane().add(p);

        p.setBackground(Color.WHITE);
        p.setLayout(null);

        etiqueta.setText("Clientes");
        etiqueta.setBounds(200, 1, 300, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.black);
        etiqueta.setFont(new Font("cooper black", 0, 40));
        p.add(etiqueta);

        tipodoc.setBounds(25, 60, 80, 20);
        p.add(tipodoc);

        String[] cx = {"DNI", "D.extrangeria", "RUC", "Pasaporte"};
        cbtipod = new JComboBox(cx);

        cbtipod.setBounds(130, 60, 80, 20);
        p.add(cbtipod);

        numero.setBounds(25, 100, 80, 20);
        p.add(numero);

        numerot.setBounds(130, 100, 120, 20);
        p.add(numerot);
        verificar.addActionListener(new OyenteVerificarCliente(this));
        verificar.setBounds(280, 100, 150, 30);
        verificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscar.png")));

        p.add(verificar);
        nuevo.setBounds(400, 100, 150, 30);
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/nuevo.GIF")));
        nuevo.addActionListener(new OyenteNuevoC(this));

        p.add(nuevo);

        nombres.setBounds(25, 140, 120, 20);
        p.add(nombres);

        nombre.setBounds(130, 140, 150, 20);
        p.add(nombre);

        apellidos.setBounds(300, 140, 150, 20);
        p.add(apellidos);
        apellido.setBounds(380, 140, 150, 20);
        p.add(apellido);

        estadoc.setBounds(25, 180, 150, 20);
        p.add(estadoc);

        String[] cd = {"Soltero", "Casado", "Otro.."};
        cbsexo = new JComboBox(cd);
        cbsexo.setBounds(130, 180, 80, 20);
        p.add(cbsexo);

        fecha.setBounds(25, 230, 100, 20);
        p.add(fecha);

        fechat.setBounds(130, 230, 20, 20);
        p.add(fechat);
        String[] m = {"Enero", "Febrero", "Marzo", "Abril", "Junio", "Julio", "Agosto", "Septiembre", "Octumbre", "Noviembre", "Diciembre"};
        cbmeses = new JComboBox(m);
        cbmeses.setBounds(160, 230, 100, 20);
        p.add(cbmeses);
        años.setBounds(280, 230, 60, 20);
        p.add(años);

        enfermedades.setBounds(25, 290, 100, 20);
        p.add(enfermedades);

        enfermedadest.setBounds(130, 290, 200, 100);
        enfermedadest.setBackground(Color.cyan);
        p.add(enfermedadest);

        guardar.setBounds(100, 500, 150, 30);
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/guardar.png")));
        p.add(guardar);
        guardar.addActionListener(new OyenteCrearCliente(this));

        actualizar.setBounds(250, 500, 150, 30);
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Herramientas.png")));
        actualizar.addActionListener(new OyenteEditarCliente(this));
        p.add(actualizar);

        eliminar.setBounds(400, 500, 150, 30);
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminar.png")));
        eliminar.addActionListener(new OyenteEliminarCliente(this));
        p.add(eliminar);

        cancelar.setBounds(550, 500, 150, 30);
       // cancelar.setBackground(Color.gray);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salir.gif")));
        cancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cancelar) {
                    dispose();
                }
            }
        });
        p.add(cancelar);
    }

    public Clientes GuardarClientes() {
        if (numerot.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresarel numero de indentificación");
            numerot.requestFocus();

        }
        if (nombre.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el nombre");
            numerot.requestFocus();

        }
        if (apellido.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el apellido");
            apellido.requestFocus();

        }
        if (fechat.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar la fecha de nacimiento");
            fechat.requestFocus();

        }
        int seleccionado = cbtipod.getSelectedIndex();
        int seleccionado1 = cbtipod.getSelectedIndex();
        int otro = cbsexo.getSelectedIndex();

        Clientes c = new Clientes();

        c.setDocIdentidad((String) cbtipod.getItemAt(seleccionado));
        c.setNumeroDoc(numerot.getText());
        c.setNombre(nombre.getText());
        c.setApellidos(apellido.getText());

        c.setEstadoCivil((String) cbsexo.getItemAt(otro));
        //Concatenamos para que nos guarde una fecha con el dia el iten seleccionado en el combo y el año que ya esta puesto
        c.setFechaNacimiento(fechat.getText() + cbmeses.getItemAt(seleccionado1) + años.getText());
        c.setEnfermedades(enfermedadest.getText());

        return c;

    }
//verificar la cedula
    public String verificarC() {
        return numerot.getText();

    }
//Eliminar mediante la cedula
    public String EliminarC() {
        return numerot.getText();

    }
//cargamos los campos seleccionados
    public void cargarCampos(Clientes cl) {
        nombre.setText(cl.getNombre());
        apellido.setText(cl.getApellidos());

        enfermedadest.setText(cl.getEnfermedades());
        fechat.setText(cl.getFechaNacimiento());

    }
//Para que todos los campos regresen a su estado normal 
    public void limpiarCampos() {
        nombre.setText(null);

        apellido.setText(null);
        enfermedadest.setText(null);
        fechat.setText(null);
    }
//Para que todos los campos no esten inhabilitados
    public void inhabilitar() {
        cbtipod.setEnabled(false);
        //Checbox
        cbsexo.setEnabled(false);

        //Texfiel
        numerot.setEditable(true);
        nombre.setEditable(false);
        apellido.setEditable(false);
        fechat.setEditable(false);
        enfermedadest.setEditable(false);
        //Buscar 
        verificar.setEnabled(true);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
        actualizar.setEnabled(false);
        cancelar.setEnabled(false);
    }

    public void habilitar() {
        cbtipod.setEnabled(true);
        //Checbox
        cbsexo.setEnabled(true);

        //Texfiel
        numerot.setEditable(true);
        nombre.setEditable(true);
        apellido.setEditable(true);
        fechat.setEditable(true);
        enfermedadest.setEditable(true);
        //Buscar 
        verificar.setEnabled(true);
        guardar.setEnabled(true);
        eliminar.setEnabled(true);
        actualizar.setEnabled(true);
        cancelar.setEnabled(true);
    }

    public static void main(String[] args) {
        vClientes cl = new vClientes();

    }
}
