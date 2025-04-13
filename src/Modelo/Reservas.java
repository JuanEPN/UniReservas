package Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

/*
 * Juan Esteban Pereira
 * Alejandro Gonzalez
 * Miguel Ángel Pineda
 */

public class Reservas {
    String documentoR, nombreR, fechaR, horaR1, horaR2, estadoR, espacioR;

    public Reservas() {}

    public Reservas(String documentoR, String nombreR, String fechaR, String horaR1, String horaR2, String estadoR, String espacioR) {
        this.documentoR = documentoR;
        this.nombreR = nombreR;
        this.fechaR = fechaR;
        this.horaR1 = horaR1;
        this.horaR2 = horaR2;
        this.estadoR = estadoR;
        this.espacioR = espacioR;
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
    
    public void registrarReserva(){
    Conexion c = new Conexion();
    c.ejecutar("insert into reservas (documento, nombre, fecha, h_inicio, h_final, estado, n_espacio) values('"+documentoR+"','"+nombreR+"','"+fechaR+"','"+horaR1+"','"+horaR2+"','"+estadoR+"','"+espacioR+"');");
    }
    
    public void eliminarReserva(String nombreR){
    Conexion c = new Conexion();
    c.ejecutar("delete from reservas where nombre='"+ nombreR +"'");
    }
    
    public void actualizarReserva(String nombreR){
    Conexion c = new Conexion();
    c.ejecutar("update reservas set documento='" + this.documentoR + "', nombre='" + this.nombreR + "', fecha='" + this.fechaR + "', h_inicio='" + horaR1 + "', h_final='" + horaR2 + "', estado='" + this.estadoR + "', n_espacio='" + this.espacioR + "' where nombre='" + nombreR +"'");
    }
    
    public String consultarNombresEspacios() throws SQLException {
    String sql = "select nombre from espacios where estado = 'Activo'";
    Conexion c = new Conexion();
    ResultSet rs = c.ejecutarConsulta(sql);
    StringBuilder nombres = new StringBuilder();
    try {
        while (rs.next()) {
            String nombreEspacio = rs.getString("nombre");
            nombres.append(nombreEspacio).append(", ");
        }
    } catch (SQLException e) {}
    
    if (nombres.length() > 0) {
        nombres.delete(nombres.length() - 2, nombres.length());
    }
    return nombres.toString();
    }
    
    public ArrayList<Reservas> consultarReservasTodos() throws SQLException{
    String sql = "select * from reservas";
    ArrayList<Reservas> Reserva = new ArrayList<>();
    Conexion c = new Conexion();
    ResultSet rs = c.ejecutarConsulta(sql);
    try{
        while(rs.next()){
            Reservas r = new Reservas();
            r.setDocumentoR(rs.getString("documento"));
            r.setNombreR(rs.getString("nombre"));
            r.setFechaR(rs.getString("fecha"));
            r.setHoraR1(rs.getString("h_inicio"));
            r.setHoraR2(rs.getString("h_final"));
            r.setEstadoR(rs.getString("estado"));
            r.setEspacioR(rs.getString("n_espacio"));
     
            Reserva.add(r);
        }
    }catch(java.sql.SQLException e){}
    return Reserva; 
    }
}