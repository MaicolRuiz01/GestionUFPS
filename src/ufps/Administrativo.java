/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps;

import java.time.LocalDate;
import java.time.Period;
import static java.time.temporal.ChronoUnit.YEARS;

/**
 *
 * @author estudiante
 */
public class Administrativo {
    
    private String anioIngreso;

//    public Administrativo() {
//    }

    public Administrativo(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    
    public void antiguedad(){
        
       LocalDate fechaIngreso=LocalDate.parse(anioIngreso);
        
        LocalDate fechaActual = LocalDate.now();

    long numeroAnios = YEARS.between(fechaIngreso, fechaActual);
            

    System.out.println(String.format("Los años de Antiguedad son %d",numeroAnios));
    
    }
    
}
