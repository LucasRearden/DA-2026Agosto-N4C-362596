package uy.edu.ort.batallanaval.utils;

import uy.edu.ort.batallanaval.fachada.Fachada;
import uy.edu.ort.batallanaval.modelo.TipoBarco;
import uy.edu.ort.batallanaval.modelo.tacticas.CazaYAtaque;
import uy.edu.ort.batallanaval.modelo.tacticas.Espiral;
import uy.edu.ort.batallanaval.modelo.tacticas.Secuencial;

public class DatosDePrueba {

    public void cargarDatosDePrueba() {
        Fachada f = Fachada.getInstancia();

        f.agregar(new TipoBarco("Portaaviones", 5));
        f.agregar(new TipoBarco("Acorazado", 4));
        f.agregar(new TipoBarco("Crucero", 3));
        f.agregar(new TipoBarco("Submarino", 2));
        f.agregar(new TipoBarco("Destructor", 1));

        f.agregar(new Secuencial());
        f.agregar(new Espiral());
        f.agregar(new CazaYAtaque());

        // Las batallas precargadas (una por estado) se agregan en el paso 3

        System.out.println("Precarga: " + f.getTiposBarco().size() + " tipos de barco, "
                + f.getTacticas().size() + " tácticas");
    }
}
