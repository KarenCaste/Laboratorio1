/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Karen
 */
public class logica {
    
     public String Nombre;
    public String fechaNacimiento;
    public String edad;
    int hora = LocalDateTime.now().getHour();

    public logica() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String name) {
        this.Nombre = name;
    }

    public String getFechaNacimiento() {

        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento1 = LocalDate.parse(this.fechaNacimiento, formatter);
        Period year = Period.between(fechaNacimiento1, LocalDate.now());
        this.edad =  String.valueOf(year.getYears());
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
}
