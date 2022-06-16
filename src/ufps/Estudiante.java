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
public class Estudiante extends Persona{
    
    private Carrera carrera;
    private String semestre;
    private Integer creditosCursados;
    

    public Estudiante() {
    }

    
    public Estudiante(Carrera carrera, String semestre, Integer creditosCursados, String codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
        this.carrera = carrera;
        this.semestre = semestre;
        this.creditosCursados = creditosCursados;
    }

    

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Integer getCreditosCursados() {
        return creditosCursados;
    }

    public void setCreditosCursados(Integer creditosCursados) {
        this.creditosCursados = creditosCursados;
    }

//    public boolean matricularPG(Integer creditosNecesarios){
//    
//    creditosNecesarios=((creditosCursados*90)/100);
//    if(creditosCursados>=creditosNecesarios){
//        System.out.println("Estudiante "+nombre+" ya puedes matricular Proyecto de Grado");
//        return true;
//    }else if (creditosCursados<creditosNecesarios){
//        System.out.println("No cuntas con los suficientes creditos para matricuar proyecto de grado");
//    }
//    return false;
//    }
    
    public boolean matricularPG(){
    Integer creditosNecesarios;
    creditosNecesarios=((carrera.getCreditos()*90)/100);
    if(creditosCursados>=creditosNecesarios){
        System.out.println("Estudiante "+nombre+" ya puedes matricular Proyecto de Grado");
        return true;
    }else if (creditosCursados<creditosNecesarios){
        System.out.println("Estudiante "+nombre+" No cuentas con los suficientes creditos para matricuar proyecto de grado");
    }
    return false;
    }
    
    
}
