/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author estudiante
 */
public class gestionUFPS {
    
    
    
    public static void main(String[] args) {
        
        Carrera IngSistemas =new Carrera("115", "Ingeniera de Sistemas", 164);
        Carrera IngElectronica=new Carrera("113", "Ingeniera Electronica", 161);
        Carrera Comunicacion =new Carrera("111", "Comunicacion Social", 100);

        Docente docente=new Docente("Director",1500000.35, 1.60, 60.3,"1155476", "Claudia", "GOmez");
        Docente docente1=new Docente("Profesor",1250000.35, 1.76, 88.0,"11619458", "Boris", "Zapata");
        Docente docente2=new Docente("Decano",2250000.35, 1.73, 100.0, "11619458","Milton", "Herrera");
        docente.calcularINC();
        docente1.calcularINC();
        docente2.calcularINC();
        
        System.out.println("-----------------------------------------------------------------------");
        
        
        Estudiante est1=new Estudiante (IngSistemas, "Octavo", 150, "1151976", "Manuel", "Fernando");
        Estudiante est2=new Estudiante (IngElectronica, "Noveno", 143, "1131956", "Gerson", "Melson");
        Estudiante est3=new Estudiante (Comunicacion, "Sexto", 89, "1111988", "Segismundo", "Calvo");
        est1.matricularPG();
        est2.matricularPG();
        est3.matricularPG();
        System.out.println("-----------------------------------------------------------------------");
        
        Administrativo adm1=new Administrativo("2001-03-01");
        adm1.antiguedad();
        
        System.out.println("-----------------------------------------------------------------------");
        docente.setSalario(5250000.0);
        docente1.setSalario(4000000.0);
        docente2.setSalario(3150000.0);
        
        
    }
}
