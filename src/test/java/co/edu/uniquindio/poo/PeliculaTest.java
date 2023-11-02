package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class PeliculaTest {
    private static final Logger LOG = Logger.getLogger(PeliculaTest.class.getName());

    @Test
    public void registarPelicula(){
        LOG.info("Inicia la prueba de registarPelicula");
        Persona actor1 = new Actor("Andrés", "Rodríguez", LocalDate.now().minusYears(20), "Colombia");
        Persona director1 = new Director("Samuel", "Zuluaga", LocalDate.now().minusYears(19), "Colombia");
        Persona guionista1 = new Guionista("Adriana", "Pineda", LocalDate.now().minusYears(19), "Colombia");
        Persona editor1 = new Editor("Katerine", "Gonzalez", LocalDate.now().minusYears(19), "Colombia");
        Pelicula pelicula1 = new Pelicula("Secretos ocultos", "Sinopsis", 2017, Genero.DRAMA, "España");
        Trailer trailer1 = new Trailer(pelicula1);
        pelicula1.registarActor(actor1);
        pelicula1.registarDirector(director1);
        pelicula1.registarGuionista(guionista1);
        pelicula1.agregarTrailer(trailer1);
        trailer1.registrarEditor(editor1);
        assertTrue(pelicula1.getActores().contains(actor1));
        assertTrue(pelicula1.getDirectores().contains(director1));
        assertTrue(pelicula1.getGuionistas().contains(guionista1));
        assertTrue(pelicula1.getTrailers().contains(trailer1));
        assertEquals(1, pelicula1.getActores().size());
        assertEquals(1, pelicula1.getDirectores().size());
        assertEquals(1, pelicula1.getGuionistas().size());
        assertEquals(1, pelicula1.getTrailers().size());
        LOG.info("Finaliza la prueba de registarPelicula");
    }

    @Test
    public void peliculaSinDirector(){
        LOG.info("Inicia la prueba de peliculaSinDirector");
        Persona actor1 = new Actor("Andrés", "Rodríguez", LocalDate.now().minusYears(20), "Colombia");
        Persona guionista1 = new Guionista("Adriana", "Pineda", LocalDate.now().minusYears(19), "Colombia");
        Persona editor1 = new Editor("Katerine", "Gonzalez", LocalDate.now().minusYears(19), "Colombia");
        Pelicula pelicula1 = new Pelicula("Secretos ocultos", "Sinopsis", 2017, Genero.DRAMA, "España");
        Trailer trailer1 = new Trailer(pelicula1);
        pelicula1.registarActor(actor1);
        pelicula1.registarGuionista(guionista1);
        pelicula1.agregarTrailer(trailer1);
        trailer1.registrarEditor(editor1);
        
        LOG.info("Finaliza la prueba de peliculaSinDirector");
    }

    @Test
    public void testObtenerActoresDrama() {

        Pelicula pelicula1 = new Pelicula("Secretos ocultos", "Sinopsis", 2017, Genero.DRAMA, "España");
        Persona actor1 = new Actor("Andrés", "Rodríguez", LocalDate.now().minusYears(20), "Colombia");
        Persona actor2 = new Actor("Adriana", "Pineda", LocalDate.now().minusYears(19), "Colombia");
        Persona actor3 = new Actor("Samuel", "Zuluaga", LocalDate.now().minusYears(20), "Colombia");
        Persona director1 = new Director("Samuel", "Zuluaga", LocalDate.now().minusYears(19), "Colombia");
        Persona guionista1 = new Guionista("Adriana", "Pineda", LocalDate.now().minusYears(19), "Colombia");

        pelicula1.registarActor(actor1);
        pelicula1.registarActor(actor2);
        pelicula1.registarActor(actor3);
        pelicula1.registarDirector(director1);
        pelicula1.registarGuionista(guionista1);

        List<Actor> actoresDrama = pelicula1.obtenerActoresDrama();

        assertFalse(actoresDrama.isEmpty());
        }
    }

