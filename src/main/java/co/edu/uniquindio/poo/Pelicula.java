package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Pelicula extends Trailer{
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

    /**private final Collection<Actor> actores;
    private final Collection<Director> directores;
    private final Collection<Productor> productores;
    private final Collection<Guionista> guionistas;
    private final Collection<Trailer> trailers;**/

    public Pelicula(String titulo, String sinopsis, int anio, Genero genero, String pais) {
        assert titulo != null && titulo.isBlank():"El nombre es requerido";
        assert sinopsis != null && sinopsis.isBlank():"La sinopsis es requerida";
        assert anio != 0 && anio < 0:"El año es requerido";
        assert genero != null :"El nombre es requerido";
        assert pais != null && pais.isBlank():"El nombre es requerido";
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.anio = anio;
        this.genero = genero;
        this.pais = pais;

        /**this.actores = new LinkedList<>();
        this.directores = new LinkedList<>();
        this.productores = new LinkedList<>();
        this.guionistas = new LinkedList<>();
        this.trailers = new LinkedList<>();**/
    }
    

}
