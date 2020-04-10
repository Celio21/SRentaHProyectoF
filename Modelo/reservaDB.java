/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class reservaDB {
  private static ArrayList<String> listaNombres;
    private static ArrayList<reserva> listaAlumno;
    public static void guardarReserva(reserva rs) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into reserva values('"
                    + rs.getIdReserva()
                    + "','" + rs.getIdhabitacion()
                    + "','" + rs.getIdcliente()
                    + "','" + rs.getTipo_reserva()
                    + "','" + rs.getFecha_reserva()
                    + "','" + rs.getFecha_ingresa()
                    + "','" + rs.getFecha_salida()
                    + "','" + rs.getCosto_alojamiento()
                    + "','" + rs.getEstado()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
    }
 public static void editarHabitacion(reserva rs) {
        //metimos este método a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
              Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("update reserva set "
                   + rs.getIdReserva()
                    + "','" + rs.getIdhabitacion()
                    + "','" + rs.getIdcliente()
                    + "','" + rs.getTipo_reserva()
                    + "','" + rs.getFecha_reserva()
                    + "','" + rs.getFecha_ingresa()
                    + "','" + rs.getFecha_salida()
                    + "','" + rs.getCosto_alojamiento()
                    + "','" + rs.getEstado()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }
  public static void eliminar(String Numero) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int delete = sentencia.executeUpdate("delete from reserva where idreserva = '" + Numero + "'");

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }

    }
    public static reserva buscarReserva(String numero) {
        //meter este método a la base de datos
       reserva rs = new reserva();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
//            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from reserva where idreserva ='" + numero + "'");

            while (necesario.next()) {
                  String doc = necesario.getString("idreserva");
                String nd = necesario.getString("NumeroH");
                String nom = necesario.getString("cedula");
                String ap = necesario.getString("tiporeserva");
                String est = necesario.getString("fechareserva");
                String enf = necesario.getString("fechaingreso");
                String fs = necesario.getString("fechasalida");//costoalojamiento
                String ca = necesario.getString("costoalojamiento");
                String es = necesario.getString("estado");
            

               rs.setIdReserva(doc);
                rs.setIdhabitacion(nd);
                rs.setIdcliente(nom);
                rs.setTipo_reserva(ap);
                rs.setFecha_reserva(est);
                rs.setFecha_ingresa(enf);
                rs.setFecha_salida(fs);
                rs.setCosto_alojamiento(ca);
                rs.setEstado(es);
                

            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return rs;

    }
    public static ArrayList cargar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from reserva");
            reserva rs ;

            listaAlumno = new ArrayList<>();
            while (necesario.next()) {

                  String doc = necesario.getString("idreserva");
                String nd = necesario.getString("NumeroH");
                String nom = necesario.getString("cedula");
                String ap = necesario.getString("tiporeserva");
                String est = necesario.getString("fechareserva");
                String enf = necesario.getString("fechaingreso");
                String fs = necesario.getString("fechasalida");//costoalojamiento
                String ca = necesario.getString("costoalojamiento");
                String es = necesario.getString("estado");

                rs= new reserva();
                rs.setIdReserva(doc);
                rs.setIdhabitacion(nd);
                rs.setIdcliente(nom);
                rs.setTipo_reserva(ap);
                rs.setFecha_reserva(est);
                rs.setFecha_ingresa(enf);
                rs.setFecha_salida(fs);
                rs.setCosto_alojamiento(ca);
                rs.setEstado(es);

                listaAlumno.add(rs);
            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + "vales verga");
        }
        return listaAlumno;

    }
}
