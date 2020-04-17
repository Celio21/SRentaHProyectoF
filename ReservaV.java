/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.OyenteHreservaTraerPrecio;
import Controlador.OyenteReservar;

import Controlador.OyenteVerificarCliente;
import Controlador.OyenteVerificarReserva;
import Controlador.VerificarClientesRese;
import Controlador.VerificarHreserva;
import Modelo.Habitacion;
import Modelo.reserva;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import Modelo.Habitacion;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author USUARIO
 */
public class ReservaV extends JFrame {
//Panel

    JPanel p = new JPanel();
    //Labels

    JLabel codigoRe = new JLabel("Codigo Reser..");
    JLabel numeroh = new JLabel("Habitación");
    JLabel cedula = new JLabel("Cliente");
    JLabel tipore = new JLabel("Tipo Reser..");
    JLabel FechaR = new JLabel("Fecha reserva");
    JLabel FechaI = new JLabel("Fecha Ingre..");
    JLabel FechaS = new JLabel("Fecha Sali..");
    JLabel costo = new JLabel("TOTAL $");
    JLabel Estado = new JLabel("Estado");
    JLabel etiqueta = new JLabel();
JLabel costoh = new JLabel("Valor H          $");
Habitacion h = new Habitacion();
    //Textos
    JTextField codigoRet = new JTextField();
    JTextField numeroht = new JTextField();
    JTextField cedulat = new JTextField();
    JTextField FechaRt = new JTextField();
    JTextField FechaIt = new JTextField();
    JTextField FechaSt = new JTextField();
    JTextField costot = new JTextField();
    JTextField año = new JTextField("2020");
    JTextField año1 = new JTextField("2020");
    JTextField año3 = new JTextField("2020");
     JTextField costoht = new JTextField();
    //Combos
    JComboBox cbTipoReserva = new JComboBox();
    JComboBox cbEstado = new JComboBox();
    JComboBox cbmeses = new JComboBox();
    JComboBox cbmeses2 = new JComboBox();
    JComboBox cbmeses3 = new JComboBox();
    //Botones
    JButton btcl = new JButton("--");

    JButton bth = new JButton("--");
    JButton reserva = new JButton("Guardar");
    JButton nuevo = new JButton("Verificar");
    JButton eliminar = new JButton("Eliminar");
    JButton salir = new JButton("Salir");
    JButton actualizar = new JButton("Actualizar");

    public ReservaV() {
        setTitle("Resevaciones");
        setVisible(true);
        setDefaultLookAndFeelDecorated(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocation(0, 0);

        getContentPane().add(p);
        //Es un borde con titulo
        p.setBorder(javax.swing.BorderFactory.createTitledBorder("ISTL"));
        p.setBackground(Color.WHITE);
        p.setLayout(null);
        etiqueta.setText("Hacer reservas");
        etiqueta.setBounds(200, 1, 300, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.black);
        etiqueta.setFont(new Font("cooper black", 0, 40));
        p.add(etiqueta);

        codigoRe.setBounds(25, 60, 80, 20);
        p.add(codigoRe);
        codigoRet.setBounds(130, 60, 150, 20);
        p.add(codigoRet);

        nuevo.setBounds(300, 60, 120, 30);
          nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscar.png")));
        
        nuevo.addActionListener(new OyenteVerificarReserva(this));
        p.add(nuevo);

        numeroh.setBounds(25, 100, 80, 20);

        p.add(numeroh);

        numeroht.setBounds(130, 100, 80, 20);

        p.add(numeroht);
        bth.setBounds(215, 100, 30, 20);
        bth.addActionListener(new VerificarHreserva(this));
        bth.addActionListener(new OyenteHreservaTraerPrecio(this));
        p.add(bth);

        cedula.setBounds(300, 100, 120, 20);
        p.add(cedula);
        btcl.setBounds(510, 100, 30, 20);
        btcl.addActionListener(new VerificarClientesRese(this));
        p.add(btcl);
        cedulat.setBounds(350, 100, 150, 20);
        p.add(cedulat);
        tipore.setBounds(25, 140, 80, 20);

        p.add(tipore);

        String[] cx = {"Reserva", "Alquiler"};
        cbTipoReserva = new JComboBox(cx);
        cbTipoReserva.setBounds(130, 140, 100, 20);
        p.add(cbTipoReserva);
        FechaR.setBounds(25, 180, 120, 20);
        p.add(FechaR);
        FechaRt.setBounds(130, 180, 20, 20);
        p.add(FechaRt);
        String[] m2 = {"Enero", "Febrero", "Marzo", "Abril", "Junio", "Julio", "Agosto", "Septiembre", "Octumbre", "Noviembre", "Diciembre"};
        cbmeses2 = new JComboBox(m2);
        cbmeses2.setBounds(160, 180, 100, 20);
        p.add(cbmeses2);
       // año1.setBounds(280, 180, 60, 20);
        //p.add(año1);
        FechaI.setBounds(25, 220, 120, 20);
        p.add(FechaI);

        FechaIt.setBounds(130, 220, 120, 20);
        FechaIt.setText(FechaActual());
        p.add(FechaIt);
        //String[] m = {"Enero", "Febrero", "Marzo", "Abril", "Junio", "Julio", "Agosto", "Septiembre", "Octumbre", "Noviembre", "Diciembre"};
        //cbmeses = new JComboBox(m);
        //cbmeses.setBounds(160, 220, 100, 20);
       // p.add(cbmeses);
        //año.setBounds(280, 220, 60, 20);
        p.add(año);

        FechaS.setBounds(25, 280, 120, 20);
        p.add(FechaS);

        FechaSt.setBounds(130, 280, 20, 20);
        p.add(FechaSt);

        String[] m3 = {"Enero", "Febrero", "Marzo", "Abril", "Junio", "Julio", "Agosto", "Septiembre", "Octumbre", "Noviembre", "Diciembre"};
        cbmeses3 = new JComboBox(m2);
        cbmeses3.setBounds(160, 280, 100, 20);
        p.add(cbmeses3);
         año3.setBounds(280, 280, 60, 20);
        p.add(año3);

        costo.setBounds(300, 320, 120, 20);
        p.add(costo);
        costot.setBounds(350, 320, 120, 20);
        p.add(costot);
        costoh.setBounds(25, 320, 120, 20);
        p.add(costoh);
        costoht.setBounds(130, 320, 120, 20);
        p.add(costoht);

        Estado.setBounds(25, 360, 120, 20);
        p.add(Estado);

        String[] cd = {"Alquilada", "Pagada", "Cancelada"};
        cbEstado = new JComboBox(cd);
        cbEstado.setBounds(130, 360, 100, 20);
        p.add(cbEstado);
        reserva.setBounds(80, 450, 150, 30);
        reserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/guardar.png")));
        reserva.addActionListener(new OyenteReservar(this));
        p.add(reserva);

        eliminar.setBounds(350, 450, 150, 30);
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminar.png"))); 
        p.add(eliminar);
         
        actualizar.setBounds(200, 450, 150, 30);
         actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Herramientas.png")));
        p.add(actualizar);

        salir.setBounds(500, 450, 150, 30);
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salir.gif"))); 
        salir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == salir) {
                    dispose();

                }
            }
        });
        p.add(salir);
    }

    public reserva HacerReserva() {
        if (codigoRet.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar Numero de Reserva");
            codigoRet.requestFocus();

        }
        if (numeroht.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el numero de la Habitación que sera Rentada");
            numeroht.requestFocus();

        }
        if (cedulat.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar las Cedula del cliente");
            cedulat.requestFocus();

        }
        if (FechaRt.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar la Fecha de reserva");
            FechaRt.requestFocus();
        }
        if (FechaIt.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar la fecha que el cliente ocupo la habitación");
            FechaIt.requestFocus();

        }
        if (FechaSt.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar la fecha en que se desocupara la habitación ");
            FechaSt.requestFocus();

        

        }
        int seleccionado = cbEstado.getSelectedIndex();
        int otro = cbTipoReserva.getSelectedIndex();
        int mesd = cbmeses.getSelectedIndex();
        int mesd2 = cbmeses2.getSelectedIndex();
        int mesd3 = cbmeses2.getSelectedIndex();
        reserva r = new reserva();
        r.setEstado((String) cbEstado.getItemAt(seleccionado));
        r.setTipo_reserva((String) cbTipoReserva.getItemAt(otro));
        r.setIdReserva(codigoRet.getText());
        r.setIdhabitacion(numeroht.getText());
        r.setIdcliente(cedulat.getText());
        r.setFecha_reserva(FechaRt.getText() + cbmeses2.getItemAt(mesd2) + año1.getText());
        //cbmeses.getItemAt(mesd)+
        //r.setFecha_ingresa(Integer.parseInt(FechaIt.getText())+Integer.parseInt(año.getText()));
        r.setFecha_ingresa(FechaIt.getText() + cbmeses.getItemAt(mesd) + año.getText());
        r.setFecha_salida(FechaSt.getText()+cbmeses3.getItemAt(mesd3)+año3.getText());
        r.setCosto_alojamiento(costot.getText());
        
        

        return r;

    }

    public void inhabilitar() {
        FechaIt.setEditable(false);
        cbTipoReserva.setEnabled(false);
        cbEstado.setEnabled(false);

        FechaRt.setEditable(false);
        FechaSt.setEditable(false);
        costot.setEditable(false);
        nuevo.setEnabled(true);
        eliminar.setEnabled(false);
        reserva.setEnabled(false);
        actualizar.setEnabled(false);
          costoht.setEditable(false);
costot.setEditable(false);
    }

    public void InhabilitarCliente() {
        cedulat.setEditable(false);
        btcl.setEnabled(false);
        año.setEditable(false);
        año1.setEditable(false);
        año3.setEditable(false);
        costoht.setEditable(false);
    }

    public void habilitar() {
        FechaIt.setEditable(true);
        cbTipoReserva.setEnabled(true);
        cbEstado.setEnabled(true);

        FechaRt.setEditable(true);
        FechaSt.setEditable(true);
        costot.setEditable(true);
        nuevo.setEnabled(true);
        eliminar.setEnabled(true);
        reserva.setEnabled(true);
        actualizar.setEnabled(true);
    }

    public void habilitarCliente() {
        cedulat.setEditable(true);
        btcl.setEnabled(true);
    }

    public void ihabilitarHabita() {
        numeroht.setEditable(false);
        bth.setEnabled(false);
      
    }

    public void habilitarHabita() {
        numeroht.setEditable(true);
        bth.setEnabled(true);
        
    }

    public void LimpiarCampos() {
        FechaIt.setText(null);

        cedulat.setText(null);

        FechaRt.setText(null);
        FechaSt.setText(null);
        costot.setText(null);

    }

    public String verificarR(reserva r) {
        
        return codigoRet.getText();
        

    }
    public void CargarCosto(){
        costoht.setText("80");
    }

    public String EliminarR(reserva r) {

        return codigoRet.getText();

    }

    public void CargarCampos(reserva rs) {
         
        numeroht.setText(rs.getIdhabitacion());
        //FechaIt.setText(Integer.toString(rs.getFecha_ingresa()));
        FechaIt.setText(rs.getFecha_ingresa());
        
        
        cedulat.setText(rs.getIdcliente());

        FechaRt.setText(rs.getFecha_reserva());
        FechaSt.setText(rs.getFecha_salida());
        cbmeses.setSelectedItem(rs.getFecha_salida());
        costot.setText(rs.getCosto_alojamiento());
        // costoht.setText(Integer.toString(h.getPrecioDiario()));
       // costoht.setText(Integer.toString(h.getPrecioDiario()));
    }

    public String verificarH() {
        return numeroht.getText();
       
    }

    public String verificarC() {
        return cedulat.getText();
    }
    public void cargarPrecio( ){
        
         costoht.setText(Integer.toString(h.getPrecioDiario()));
    }
    public void PrecioTotal(){
        costot.setText("400");
    }
        public static String FechaActual(){
            Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fecha);
            
        }
    

    public static void main(String[] args) {
        ReservaV n = new ReservaV();
    }
    
}
