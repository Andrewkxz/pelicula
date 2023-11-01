package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Persona {
    private final String nombre;
    private final String apellido;
    private final LocalDate fechaNacimiento;
    private final String nacionalidad;
   
    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
}