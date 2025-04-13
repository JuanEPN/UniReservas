package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Espacios;
import Modelo.Reservas;
import Vista.Vista_Reservas;
import javax.swing.JComboBox;

/*
 * Juan Esteban Pereira
 * Alejandro Gonzalez
 * Miguel Ángel Pineda
 */

public class GestionEspacios {
    Vista_Reservas Espacios;

    public GestionEspacios(){}
    
    public void registrarEspacios(){
        Espacios e = new Espacios();
        
        e.setNombreE(this.Espacios.getNombreE());
        e.setDescripcionE(this.Espacios.getDescripcionE());
        e.setTipoE(this.Espacios.getTipoE());
        e.setEstadoE(this.Espacios.getEstadoE());
        
        e.registrarEspacio();
        consultarEspacios();
    }
    
    public void actualizarEspacios (String nombre){
        Espacios e = new Espacios();
        
        e.setNombreE(this.Espacios.getNombreE());
        e.setDescripcionE(this.Espacios.getDescripcionE());
        e.setTipoE(this.Espacios.getTipoE());
        e.setEstadoE(this.Espacios.getEstadoE());
        
        e.actualizarEspacio(nombre);
        consultarEspacios();
    }
    
    public void consultarEspacios(){
        try {
            Espacios.limpiarTablaE();
            Espacios e = new Espacios();
            ArrayList<Espacios> Espacio = e.consultarEspaciosTodos();
  
            for(Espacios prod: Espacio){
                String datos[]={prod.getNombreE(),prod.getDescripcionE(),prod.getTipoE(),prod.getEstadoE()};
                Espacios.agregarFilaE(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionEspacios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarEspacios(String nombre){
        Espacios e = new Espacios();
        
        e.eliminarEspacio(nombre);
        consultarEspacios();
    }
    
    public void EspaciosActivos(JComboBox<String> txtEspacioR){
        Reservas r = new Reservas();
        
        try {
            String EspaciosActivos = r.consultarNombresEspacios();
            String[] nombres = EspaciosActivos.split(", ");
            for (String nombre : nombres) {
                txtEspacioR.addItem(nombre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionEspacios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    public Vista_Reservas getGestionEspacio(){
        return Espacios;
    }
    
    public void setGestionEspacio (Vista_Reservas Espacios){
        this.Espacios = Espacios;
    }
}