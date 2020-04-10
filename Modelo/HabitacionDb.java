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
public class HabitacionDb {

    //public static  ArrayList<String> listNombres;

    private static ArrayList<String> listaNombres;
    private static ArrayList<Habitacion> listaAlumno;

    public static void guardarHabitacion(Habitacion hb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into habitacion values('"
                    + hb.getNumero()
                    + "','" + hb.getPiso()
                    + "','" + hb.getDescripcion()
                    + "','" + hb.getCaracteristicas()
                    + "','" + hb.getPrecioDiario()
                    + "','" + hb.getEstado()
                    + "','" + hb.getTipo_habitacion()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }

    }

    public static Habitacion buscarHabitacion(String Numero) {
        //meter este método a la base de datos
        Habitacion ab = new Habitacion();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
//            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from habitacion where Numero ='" + Numero + "'");

            while (necesario.next()) {
                String nu = necesario.getString("Numero");
                String pi = necesario.getString("Piso");
                String des = necesario.getString("Descripción");
                String car = necesario.getString("Caracteristicas");
                String pre = necesario.getString("PrecioDiario");
                String es = necesario.getString("Estado");
                String tip = necesario.getString("TipoHabitación");

                ab.setNumero(nu);
                ab.setPiso(pi);
                ab.setDescripcion(des);
                ab.setCaracteristicas(car);
                ab.setPrecioDiario(pre);
                ab.setEstado(es);
                ab.setTipo_habitacion(tip);

            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }

        return ab;
    }
     public static void editarHabitacion(Habitacion hb) {
        //metimos este método a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
              Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("update habitacion set "
                   + hb.getNumero()
                    + "','" + hb.getPiso()
                    + "','" + hb.getDescripcion()
                    + "','" + hb.getCaracteristicas()
                    + "','" + hb.getPrecioDiario()
                    + "','" + hb.getEstado()
                    + "','" + hb.getTipo_habitacion()
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
            int delete = sentencia.executeUpdate("delete from habitacion where Numero = '" + Numero + "'");

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }

    }

    public static ArrayList cargar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from habitacion");
            Habitacion ab;

            listaAlumno = new ArrayList<>();
            while (necesario.next()) {

                String nu = necesario.getString("Numero");
                String pi = necesario.getString("Piso");
                String des = necesario.getString("Descripción");
                String car = necesario.getString("Caracteristicas");
                String pre = necesario.getString("PrecioDiario");
                String es = necesario.getString("Estado");
                String tip = necesario.getString("TipoHabitación");

                ab = new Habitacion();

                ab.setNumero(nu);
                ab.setPiso(pi);
                ab.setDescripcion(des);
                ab.setCaracteristicas(car);
                ab.setPrecioDiario(pre);
                ab.setEstado(es);
                ab.setTipo_habitacion(tip);

                listaAlumno.add(ab);
            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return listaAlumno;

    }
}
