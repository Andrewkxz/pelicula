package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Actor extends Persona implements Participante{
    public Collection<Pelicula> peliculasParticipadas;

    public Actor(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.peliculasParticipadas = new LinkedList<>();
    }

    public Collection<Pelicula> getPeliculasParticipadas() {
        return peliculasParticipadas.stream()
                .filter(pelicula -> pelicula.getParticipantes().contains(this))
                .collect(Collectors.toList());
    }

    public boolean participaDrama (Pelicula pelicula){
        return pelicula.getGenero() == Genero.DRAMA && pelicula.getActores().contains(this);

    }
    @Override
    public String getNombreCompleto() {
        return getNombre() + " " + getApellido();
    }
}
