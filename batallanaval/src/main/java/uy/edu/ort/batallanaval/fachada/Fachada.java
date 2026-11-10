package uy.edu.ort.batallanaval.fachada;

import java.util.ArrayList;

import uy.edu.ort.batallanaval.modelo.TipoBarco;
import uy.edu.ort.batallanaval.modelo.tacticas.Tactica;
import uy.edu.ort.batallanaval.observador.Observable;
import uy.edu.ort.batallanaval.servicios.ServicioConfiguracion;

public class Fachada extends Observable {

    private static Fachada instancia;

    private ServicioConfiguracion sConfiguracion;

    private Fachada() {
        sConfiguracion = new ServicioConfiguracion();
    }

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    // ---------- Configuración ----------

    public void agregar(TipoBarco tipo) {
        sConfiguracion.agregar(tipo);
    }

    public ArrayList<TipoBarco> getTiposBarco() {
        return sConfiguracion.getTiposBarco();
    }

    public void agregar(Tactica tactica) {
        sConfiguracion.agregar(tactica);
    }

    public ArrayList<Tactica> getTacticas() {
        return sConfiguracion.getTacticas();
    }
}
