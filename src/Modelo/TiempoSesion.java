package Modelo;
import Vista.Vista_Reservas;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Juan Esteban Pereira
 * Alejandro Gonzalez
 * Miguel Ángel Pineda
 */

public class TiempoSesion extends Thread{
    Vista_Reservas r;
    int i = 0;

    public TiempoSesion(Vista_Reservas r) {
        this.r = r;
    }
    @Override
    public void run() {
        while (i >= 0){
            r.actualizarTiempo(i);
            i++;
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TiempoSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}