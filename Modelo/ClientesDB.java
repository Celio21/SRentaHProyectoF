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
public class ClientesDB {

    private static ArrayList<String> listaNombres;
    private static ArrayList<Clientes> listaAlumno;
   
    public  static  void guardarClientes(Clientes cl) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into clientes values('"
                    + cl.getDocIdentidad()
                    + "','" + cl.getNumeroDoc()
                    + "','" + cl.getNombre()
                    + "','" + cl.getApellidos()
                    + "','" + cl.getEstadoCivil()
                    + "','" + cl.getFechaNacimiento()
                    
                    + "','" + cl.getEnfermedades()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
    }
   public static Clientes buscarCliente(String cedula) {
        //meter este método a la base de datos
        Clientes clien = new Clientes();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
//            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from clientes where Documento ='" + cedula + "'");

            while (necesario.next()) {
                String doc = necesario.getString("Doc.Indentificacion");
                String nd = necesario.getString("Documento");
                String nom = necesario.getString("Nombres");
                String ap = necesario.getString("Apellidos");
                String est = necesario.getString("Estado Civil");
                String enf = necesario.getString("Enfermedades");
            

                clien.setDocIdentidad(doc);
                clien.setNumeroDoc(nd);
                clien.setNombre(nom);
                clien.setApellidos(ap);
                clien.setEstadoCivil(est);
                clien.setEnfermedades(enf);
                

            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return clien;

    }
   public static void editarCliente(Clientes cl) {
        //metimos este método a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
              Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("update clientes set "
                   + cl.getDocIdentidad()
                    + "','" + cl.getNumeroDoc()
                    + "','" + cl.getNombre()
                    + "','" + cl.getApellidos()
                    + "','" + cl.getEstadoCivil()
                    + "','" + cl.getFechaNacimiento()
                    
                    + "','" + cl.getEnfermedades()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }
    public static void eliminarCliente(String Nro_de_ID) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from clientes where Documento = '" + Nro_de_ID + "'");

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }
  public static ArrayList cargar(){
			
            try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pfinal", "root", "root");
				System.out.print("Conexion establecida!");
				Statement sentencia = conexion.createStatement();
				ResultSet necesario = sentencia.executeQuery("select * from clientes");
                               Clientes clien;
				 
				 listaAlumno = new ArrayList<>();
				while(necesario.next()){
					
                                        String doc = necesario.getString("Doc.Indentificacion");
                String nd = necesario.getString("Documento");
                String nom = necesario.getString("Nombres");
                String ap = necesario.getString("Apellidos");
                String est = necesario.getString("Estado Civil");
                String enf = necesario.getString("Enfermedades");
                                       
                                        clien=new Clientes();
                                        
					  clien.setDocIdentidad(doc);
                clien.setNumeroDoc(nd);
                clien.setNombre(nom);
                clien.setApellidos(ap);
                clien.setEstadoCivil(est);
                clien.setEnfermedades(enf);
					 
					listaAlumno.add(clien);
				}
				sentencia.close();
				conexion.close();
				
			}catch(Exception ex){
				System.out.print("Error en la conexion"+"vales verga");
			}
			return listaAlumno;
			
	}
}
