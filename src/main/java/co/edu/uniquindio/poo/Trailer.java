package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Trailer {
    private Collection<Persona> editores;
    private Pelicula pelicula;

    public Trailer(Pelicula pelicula) {
        this.editores = new LinkedList<>();
        this.pelicula = pelicula;
    }

    public Collection<Persona> getEditores() {
        return editores;
    }

    public void registrarEditor(Persona editor){
        editores.add((Editor) editor);
    }
    
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }    
}
