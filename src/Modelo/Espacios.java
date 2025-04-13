package Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

/*
 * Juan Esteban Pereira
 * Alejandro Gonzalez
 * Miguel Ángel Pineda
 */

public class Espacios {
    String nombreE,descripcionE, tipoE, estadoE;

    public Espacios() {}

    public Espacios(String nombreE, String descripcionE, String tipoE, String estadoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.tipoE = tipoE;
        this.estadoE = estadoE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getTipoE() {
        return tipoE;
    }

    public void setTipoE(String tipoE) {
        this.tipoE = tipoE;
    }

    public String getEstadoE() {
        return estadoE;
    }

    public void setEstadoE(String estadoE) {
        this.estadoE = estadoE;
    }
    
    public void registrarEspacio(){
    Conexion c = new Conexion();
    c.ejecutar("insert into espacios (nombre, descripcion, tipo, estado) values('"+nombreE+"','"+descripcionE+"','"+tipoE+"','"+estadoE+"');");
    }
    
    public void eliminarEspacio(String nombre){
    Conexion c = new Conexion();
    c.ejecutar("delete from espacios where nombre='"+ nombre +"'");
    }
    
    public void actualizarEspacio(String nombre){
    Conexion c = new Conexion();
    c.ejecutar("update espacios set nombre='" + this.nombreE + "', descripcion='" + this.descripcionE + "', tipo='" + this.tipoE + "', estado='" + this.estadoE + "' where nombre='" + nombre +"'");
    }
    
    public ArrayList<Espacios> consultarEspaciosTodos() throws SQLException{
    String sql = "select * from espacios";
    ArrayList<Espacios> Espacio = new ArrayList<>();
    Conexion c = new Conexion();
    ResultSet rs = c.ejecutarConsulta(sql);
    try{
        while(rs.next()){
            Espacios e = new Espacios();
            e.setNombreE(rs.getString("nombre"));
            e.setDescripcionE(rs.getString("descripcion"));
            e.setTipoE(rs.getString("tipo"));
            e.setEstadoE(rs.getString("estado"));
     
            Espacio.add(e);
        }
    }catch(java.sql.SQLException e){}
    return Espacio; 
    }
}