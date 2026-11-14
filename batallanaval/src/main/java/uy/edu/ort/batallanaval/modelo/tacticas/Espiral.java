package uy.edu.ort.batallanaval.modelo.tacticas;

import uy.edu.ort.batallanaval.modelo.Celda;
import uy.edu.ort.batallanaval.modelo.Oceano;

public class Espiral extends Tactica {

    public Espiral() {
        super("Espiral");
    }

    @Override
    public Celda elegirDisparo(Oceano oceanoRival) {
        // TEMPORAL: el algoritmo real se implementa en el paso 4
        return oceanoRival.getCeldasSinDisparar().get(0);
    }
}
