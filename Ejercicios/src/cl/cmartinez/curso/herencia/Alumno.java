/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.curso.herencia;

/**
 *
 * @author carlo
 */
public class Alumno extends Persona implements Comunicacion
{
    private double notaFinal;
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    public void mostrarDatos()
    {
        System.out.println("Soy un alumno, mi nombre es " 
                + getNombre() + ", mi edad es " + getEdad() 
                + " y mi nota final es " + notaFinal);
    }
    @Override
    public void saludo() 
    {
        System.out.println("Hola! :D");
    }
}
