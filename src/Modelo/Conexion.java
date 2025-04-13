package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

/*
 * Juan Esteban Pereira
 * Alejandro Gonzalez
 * Miguel Ángel Pineda
 */

public class Conexion {
    
    Connection conexion;
    String usuario ="postgres";
    String password="miguelpine.";
     
      public  Conexion() { 
        try {
            try { 
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
          
            this.conexion = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Proyecto_POE",
                    usuario, password);
 
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    }
      
    public void ejecutar(String sql){
 
        try { 
            PreparedStatement stm = this.conexion.prepareStatement(sql);
            stm.execute();
        } catch (SQLException ex) {
           System.out.println(ex);
        }
    }  
    
    public ResultSet ejecutarConsulta(String sql){
         try { 
            PreparedStatement stm = this.conexion.prepareStatement(sql);
            return stm.executeQuery();
        } catch (SQLException ex) {
           System.out.println(ex);
        }
         return null;   
    } 
}