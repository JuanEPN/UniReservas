package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Juan Esteban Pereira
 * Alejandro Gonzalez
 * Miguel Ángel Pineda
 */

public class Login {
    
    public String usuario() throws SQLException {
    String sql = "select usuario from login";
    Conexion c = new Conexion();
    ResultSet rs = c.ejecutarConsulta(sql);
    StringBuilder usuarios = new StringBuilder();
    try {
        while (rs.next()) {
            String usuario = rs.getString("usuario");
            usuarios.append(usuario);
        }
    } catch (SQLException e) {}
    
    
    return usuarios.toString();
    }
    
    public String contraseña() throws SQLException {
    String sql = "select contraseña from login";
    Conexion c = new Conexion();
    ResultSet rs = c.ejecutarConsulta(sql);
    StringBuilder contraseñas = new StringBuilder();
    try {
        while (rs.next()) {
            String contraseña = rs.getString("contraseña");
            contraseñas.append(contraseña);
        }
    } catch (SQLException e) {}
    
    return contraseñas.toString();
    }
}