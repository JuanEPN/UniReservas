package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Juan Esteban Pereira
 * Alejandro Gonzalez
 * Miguel Ángel Pineda
 */

public class Busquedas {
    String documentoR, nombreR, fechaR, horaR1, horaR2, estadoR, espacioR, nombreEspacio;

    public Busquedas() {}

    public Busquedas(String documentoR, String nombreR, String fechaR, String horaR1, String horaR2, String estadoR, String espacioR, String nombreEspacio) {
        this.documentoR = documentoR;
        this.nombreR = nombreR;
        this.fechaR = fechaR;
        this.horaR1 = horaR1;
        this.horaR2 = horaR2;
        this.estadoR = estadoR;
        this.espacioR = espacioR;
        this.nombreEspacio = nombreEspacio;
    }

    public String getNombreEspacio() {
        return nombreEspacio;
    }

    public void setNombreEspacio(String nombreEspacio) {
        this.nombreEspacio = nombreEspacio;
    }
    
    public String getDocumentoR() {
        return documentoR;
    }

    public void setDocumentoR(String documentoR) {
        this.documentoR = documentoR;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public String getHoraR1() {
        return horaR1;
    }

    public void setHoraR1(String horaR1) {
        this.horaR1 = horaR1;
    }

    public String getHoraR2() {
        return horaR2;
    }

    public void setHoraR2(String horaR2) {
        this.horaR2 = horaR2;
    }

    public String getEstadoR() {
        return estadoR;
    }

    public void setEstadoR(String estadoR) {
        this.estadoR = estadoR;
    }

    public String getEspacioR() {
        return espacioR;
    }

    public void setEspacioR(String espacioR) {
        this.espacioR = espacioR;
    }
    
    public ArrayList<Busquedas> consultarBusqueda() throws SQLException{
    String sql = "select * from reservas where n_espacio = '"+ nombreEspacio +"'";
    ArrayList<Busquedas> Busqueda = new ArrayList<>();
    Conexion c = new Conexion();
    ResultSet rs = c.ejecutarConsulta(sql);
    try{
        while(rs.next()){
            Busquedas b = new Busquedas();
            b.setDocumentoR(rs.getString("documento"));
            b.setNombreR(rs.getString("nombre"));
            b.setFechaR(rs.getString("fecha"));
            b.setHoraR1(rs.getString("h_inicio"));
            b.setHoraR2(rs.getString("h_final"));
            b.setEstadoR(rs.getString("estado"));
            b.setEspacioR(rs.getString("n_espacio"));
     
            Busqueda.add(b);
        }
    }catch(java.sql.SQLException e){}
    return Busqueda ; 
    }
}