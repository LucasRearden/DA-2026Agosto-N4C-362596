package uy.edu.ort.batallanaval.modelo.tacticas;

// Strategy: cada táctica decide a qué celda dispara la máquina.
// El método abstracto para elegir el disparo se agrega en el paso de las tácticas.
public abstract class Tactica {

    private String nombre;

    public Tactica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
