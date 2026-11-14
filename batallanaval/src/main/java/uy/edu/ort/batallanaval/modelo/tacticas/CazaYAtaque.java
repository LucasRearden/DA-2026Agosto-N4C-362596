package uy.edu.ort.batallanaval.modelo.tacticas;

import uy.edu.ort.batallanaval.modelo.Celda;
import uy.edu.ort.batallanaval.modelo.Oceano;

public class CazaYAtaque extends Tactica {

    public CazaYAtaque() {
        super("Caza y ataque");
    }

    @Override
    public Celda elegirDisparo(Oceano oceanoRival) {
        // TEMPORAL: el algoritmo real se implementa en el paso 4
        return oceanoRival.getCeldasSinDisparar().get(0);
    }
}
