/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbank;

/**
 *
 * @author victt
 */
public class cAlumno {
    

    private int codigo;
    private String nombres;
    private int rut;
    private Double fondo;
    private int estado;

    
    public Double calcular_promedio(){
        return ((fondo*0.6));
    }
    public int getCodigo(){return codigo;}
    public void setCodigo(int codigo){this.codigo = codigo;}
    public int getRut(){return rut;}
    public void setRut(int rut){this.rut = rut;}
    public String getNombres(){return nombres;}
    public void setNombres(String nombres){this.nombres = nombres;}
    public Double getFondo(){return fondo;}
    public void setFondo(Double fondo){this.fondo = fondo;}
    public int getEstado(){return estado;}
    public void setEstado(int estado){this.estado = estado;}
}