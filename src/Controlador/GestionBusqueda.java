package Controlador;

import Modelo.Busquedas;
import Vista.Vista_Reservas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Juan Esteban Pereira
 * Alejandro Gonzalez
 * Miguel Ángel Pineda
 */

public class GestionBusqueda {
    Vista_Reservas vr;

    public GestionBusqueda() {}
    
    public void BuscarReservas(){
        Busquedas b = new Busquedas();
        b.setNombreEspacio(this.vr.getEspacioR());
        consultarBusqueda();
    }
    
    public void consultarBusqueda(){
        try {
            vr.limpiarTablaR();
            Busquedas b = new Busquedas();
            ArrayList<Busquedas> Busqueda = b.consultarBusqueda();
  
            for(Busquedas prod: Busqueda){
                String datos[]={prod.getDocumentoR(), prod.getNombreR(), prod.getFechaR(), prod.getHoraR1(), prod.getHoraR2(), prod.getEstadoR(), prod.getEspacioR()};
                vr.agregarFilaR(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionEspacios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    public Vista_Reservas getVr() {
        return vr;
    }

    public void setVr(Vista_Reservas vr) {
        this.vr = vr;
    }  
}