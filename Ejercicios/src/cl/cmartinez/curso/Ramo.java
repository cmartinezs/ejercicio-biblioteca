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
public class Ramo 
{
    private final String nombre;
    private final double notaFinal;

    public Ramo(String nombreNuevo, double notaFinalNueva) 
    {
        nombre = nombreNuevo;
        notaFinal = notaFinalNueva;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}
