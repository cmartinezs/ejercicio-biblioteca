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
public class Libro extends Publicacion
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
        System.out.println("isbn: " + isbn + "");
    }
}
