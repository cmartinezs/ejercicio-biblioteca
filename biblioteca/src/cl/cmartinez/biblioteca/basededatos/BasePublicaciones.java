/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.biblioteca.basededatos;

import cl.cmartinez.biblioteca.publicaciones.Libro;
import cl.cmartinez.biblioteca.publicaciones.Publicacion;
import cl.cmartinez.biblioteca.publicaciones.Revista;
import cl.cmartinez.biblioteca.publicaciones.Tesis;

/**
 *
 * @author carlo
 */
public class BasePublicaciones 
{
    Publicacion[] publicaciones;
    
    public BasePublicaciones ()
    {
        publicaciones = new Publicacion[3];
        
        Libro libro = new Libro();
        libro.setAutor("Autor 1");
        libro.setFecha("14-12-1985");
        libro.setTitulo("Titulo libro 1");
        libro.setIsbn("AAA-000001");
        publicaciones[0] = libro;
        
        Revista revista = new Revista();
        revista.setAutor("Autor 2");
        revista.setFecha("14-12-1985");
        revista.setTitulo("Titulo revista 2");
        revista.setNroPublicacion(10);
        publicaciones[1] = revista;
        
        Tesis tesis = new Tesis();
        tesis.setAutor("Autor 3");
        tesis.setFecha("14-12-1985");
        tesis.setTitulo("Titulo tesis 3");
        tesis.setNota(5.5);
        tesis.setProfesor("Profesor 1");
        publicaciones[2] = tesis;
    }

    public Publicacion[] getPublicaciones() 
    {
        return publicaciones;
    }

    public void setPublicaciones(Publicacion[] publicaciones) 
    {
        this.publicaciones = publicaciones;
    }
}
