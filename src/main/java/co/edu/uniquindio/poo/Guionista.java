package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Guionista extends Persona implements Participante{

    public Guionista(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        
    }

    @Override
    public void participaComo() {
        System.out.println("Guionista");
    }
    
}
