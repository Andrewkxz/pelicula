package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Pelicula{
    private final String titulo;
    private final String sinopsis;
    private final int anio;
    private final Genero genero;
    private final String pais;

    public String getTitulo() {
        return titulo;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public int getAnio() {
        return anio;
    }
    public Genero getGenero() {
        return genero;
    }
    public String getPais() {
        return pais;
    }
    private Collection<Persona> directores;
    private Collection<Persona> guionistas;
    private Collection<Persona> actores;
    private Collection<Persona> productores;
    private Collection <Trailer> trailers;
    private Collection <Participante> participantes;

    public Pelicula(String titulo, String sinopsis, int anio, Genero genero, String pais) {
        assert titulo != null && !titulo.isBlank():"El nombre de la pelicula es requerido";
        assert sinopsis != null && !sinopsis.isBlank():"La sinopsis de la pelicula es requerida";
        assert anio > 0:"El año de la pelicula es requerido";
        assert genero != null :"El genero de la pelicula es requerido";
        assert pais != null && !pais.isBlank():"El pais de la pelicula es requerido";
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.anio = anio;
        this.genero = genero;
        this.pais = pais;

        this.actores = new LinkedList<>();
        this.directores = new LinkedList<>();
        this.productores = new LinkedList<>();
        this.guionistas = new LinkedList<>();
        this.trailers = new LinkedList<>();
        this.participantes = new LinkedList<>();

        assert directores.isEmpty() || guionistas.isEmpty() : "Se requiere al menos un director y un guionista";
    }

    public void registrarParticipante(Participante participante){
        participantes.add(participante);
    }
    
    public Collection<Persona> getActores() {
        return actores;
    }
    public Collection<Participante> getParticipantes() {
        return participantes;
    }
    public Optional<Participante> buscarParticipante(Participante participante){
        Predicate<Participante> nombreCompleto = j->j.getNombreCompleto().equals(participante.getNombreCompleto());
        return participantes.stream()
                      .filter(persona -> persona instanceof Participante)
                      .map(persona -> (Participante) persona)
                      .filter(nombreCompleto)
                      .findAny();
    }

    public void registarActor(Persona actor){
        validarActorExiste(actor);
        actores.add(actor);
    }

    private void validarActorExiste(Persona actor){
        boolean existeActor = buscarActor(actor).isPresent();
        assert !existeActor : "El actor ya existe";
    }

    public List<Actor> obtenerActoresDrama(){
        return actores.stream()
                      .filter(actor -> actor instanceof Actor)
                      .map(actor -> (Actor) actor)
                      .filter(actor -> actor.participaDrama(this))
                      .collect(Collectors.toList());
    }

    public Optional<Actor> buscarActor(Persona actor){
        Predicate<Actor> nombreIgual = j->j.getNombre().equals(actor.getNombre());
        Predicate<Actor> apellidoIgual = j->j.getApellido().equals(actor.getApellido());
        return actores.stream()
                      .filter(persona -> persona instanceof Actor)
                      .map(persona -> (Actor) persona)
                      .filter(nombreIgual.and(apellidoIgual))
                      .findAny();
    }

    public void registarDirector(Persona director){
        directores.add(director);
    }

    public Collection<Persona> getDirectores() {
        return directores;
    }
    public Collection<Persona> getGuionistas() {
        return guionistas;
    }
    public Collection<Persona> getProductores() {
        return productores;
    }
    public Collection<Trailer> getTrailers() {
        return trailers;
    }
    public void registarProductor(Productor productor){
        productores.add(productor);
    }

    public void registarGuionista(Persona guionista){
        guionistas.add(guionista);
    }

    public void agregarTrailer(Trailer trailer) {
        trailers.add(trailer);
    }

}



