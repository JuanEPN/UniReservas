package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Reservas;
import Vista.Vista_Reservas;

/*
 * Juan Esteban Pereira
 * Alejandro Gonzalez
 * Miguel Ángel Pineda
 */

public class GestionReservas {
    Vista_Reservas Reservas;

    public GestionReservas() {}
    
    public void registrarReservas(){
        Reservas r = new Reservas();
        
        r.setDocumentoR(this.Reservas.getDocumentoR());
        r.setNombreR(this.Reservas.getNombreR());
        //r.setFechaR(this.Reservas.getFechaR());
        r.setHoraR1(this.Reservas.getHoraR1());
        r.setHoraR2(this.Reservas.getHoraR2());
        r.setEstadoR(this.Reservas.getEstadoR());
        r.setEspacioR(this.Reservas.getEspacioR());
        
        r.registrarReserva();
        consultarReservas();
    }
    
    public void actualizarReservas (String nombreR){
        Reservas r = new Reservas();
        
        r.setDocumentoR(this.Reservas.getDocumentoR());
        r.setNombreR(this.Reservas.getNombreR());
        //r.setFechaR(this.Reservas.getFechaR());
        r.setHoraR1(this.Reservas.getHoraR1());
        r.setHoraR2(this.Reservas.getHoraR2());
        r.setEstadoR(this.Reservas.getEstadoR());
        r.setEspacioR(this.Reservas.getEspacioR());
        
        r.actualizarReserva(nombreR);
        consultarReservas();
    }
    
    public void consultarReservas(){
        try {
            Reservas.limpiarTablaR();
            Reservas r = new Reservas();
            ArrayList<Reservas> Reserva = r.consultarReservasTodos();
  
            for(Reservas prod: Reserva){
                String datos[]={prod.getDocumentoR(), prod.getNombreR(), prod.getFechaR(), prod.getHoraR1(), prod.getHoraR2(), prod.getEstadoR(), prod.getEspacioR()};
                Reservas.agregarFilaR(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionEspacios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarReservas(String nombreR){
        Reservas r = new Reservas();
        r.eliminarReserva(nombreR);
        consultarReservas();
    }
      
    public Vista_Reservas getGestionReserva(){
        return Reservas;
    }
    
    public void setGestionReserva (Vista_Reservas Reservas){
        this.Reservas = Reservas;
    }
}