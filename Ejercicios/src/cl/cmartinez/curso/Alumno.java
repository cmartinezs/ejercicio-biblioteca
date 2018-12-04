/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.curso;

/**
 *
 * @author carlo
 */
public class Alumno 
{
    private final String nombre;
    private final String apellidoPaterno;
    private final String apellidoMaterno;
    private final double notaFinal;

    public Alumno(String nuevoNombre, String nuevoAP, String nuevoAM, double notaFinal) 
    {
        this.nombre = nuevoNombre;
        this.apellidoPaterno = nuevoAP;
        this.apellidoMaterno = nuevoAM;
        this.notaFinal = notaFinal;
    }
    
    public String getNombreCompleto()
    {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}
