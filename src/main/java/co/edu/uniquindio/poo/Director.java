package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Director extends Persona implements Participante{

    public Director(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        
    }

    @Override
    public void participaComo() {
        System.out.println("Director");
    }
    
}
