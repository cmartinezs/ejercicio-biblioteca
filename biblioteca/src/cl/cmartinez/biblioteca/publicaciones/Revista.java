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
public class Revista extends Publicacion
{
    private int nroPublicacion;

    public int getNroPublicacion() {
        return nroPublicacion;
    }

    public void setNroPublicacion(int nroPublicacion) {
        this.nroPublicacion = nroPublicacion;
    }

    @Override
    public String getTipoPublicacion() 
    {
        return "Revista";
    }

    @Override
    public void mostrarDatosEspecificos() 
    {
        System.out.println("nro. publ.: " + nroPublicacion + "");
    }
}
