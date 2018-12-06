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
public class Libro extends Publicacion implements Prestable
{
    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getTipoPublicacion() 
    {
        return "Libro";
    }

    @Override
    public void mostrarDatosEspecificos() 
    {
        System.out.print(", " + isbn + "");
    }

    @Override
    public boolean prestar() 
    {
        boolean sePudoPrestar = false;
        
        if (!prestado) 
        {
            prestado = true;
            sePudoPrestar = true;
        }
        
        return sePudoPrestar;
    }

    @Override
    public boolean devolver() 
    {
        boolean sePudoDevolver = false;
        
        if (prestado) 
        {
            prestado = false;
            sePudoDevolver = true;
        }
        
        return sePudoDevolver;
    }
}
