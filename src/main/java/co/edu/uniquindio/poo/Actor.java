package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Actor extends Persona implements Participante{

    public Actor(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        
    }

    @Override
    public void participaComo() {
        System.out.println("Actor");
    }
    
}
