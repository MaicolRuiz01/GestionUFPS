/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps;

/**
 *
 * @author estudiante
 */
public class Docente extends Persona {

    private String profesionj;
    private double salario;
    private double estatura;
    private double peso;

    public Docente() {
    }

    public Docente(String profesionj, double salario, double estatura, double peso, String codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
        this.profesionj = profesionj;
        this.salario = salario;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getProfesionj() {
        return profesionj;
    }

    public void setProfesionj(String profesionj) {
        this.profesionj = profesionj;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        
        this.salario = salario;
        System.out.println("El salario del docente "+nombre+" ahora es de "+salario);
        System.out.println(toString());
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void calcularINC() {

        Double IMC = (peso / (estatura * estatura));
        System.out.println(IMC);

        if (IMC < 18.5) {
            System.out.println("COmposicion corporal es inferior a la normal");
        }
        else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Composicion corporal Normal");
        }
        else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Composicion corporal es superior a la Normal");
        }
        if (IMC >= 30.0) {
            System.out.println("Obesidad");
        }

    }

    @Override
    public String toString() {
        return "Docente{" + "profesionj=" + profesionj + ", salario=" + salario + ", estatura=" + estatura + ", peso=" + peso + '}';
    }
    
    

}
