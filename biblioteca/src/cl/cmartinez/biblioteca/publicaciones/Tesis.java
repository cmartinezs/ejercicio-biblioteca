/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.biblioteca.publicaciones;

/**
 *
 * @author carlo
 */
public class Tesis extends Publicacion
{
    private double nota;
    private String profesor;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public String getTipoPublicacion() 
    {
        return "Tesis";
    }

    @Override
    public void mostrarDatosEspecificos() 
    {        
        System.out.println("nota: " + nota + "");
        System.out.println("profesor: " + profesor + "");
    }
}
