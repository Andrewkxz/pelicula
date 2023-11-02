package co.edu.uniquindio.poo;

import java.util.Collection;

public class Productora {
    private String nombre;
    private Collection<Pelicula> peliculas;
    public Productora(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public Collection<Pelicula> getPeliculas() {
        return peliculas;
    }
}
