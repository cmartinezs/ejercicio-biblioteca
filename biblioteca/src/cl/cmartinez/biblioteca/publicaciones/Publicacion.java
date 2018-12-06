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
public abstract class Publicacion 
{
    protected String autor;
    protected String titulo;
    protected String fecha;
    protected boolean prestado;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    public void mostrarDatos()
    {
        String tipoPublicacion = getTipoPublicacion();
        System.out.print(tipoPublicacion + " '" + titulo + "', " + autor + ", " + fecha + "");
        mostrarDatosEspecificos();
        System.out.print(", " + (prestado ? "prestado" : "disponible") + "\n");
    }
    
    public abstract String getTipoPublicacion();
    
    public abstract void mostrarDatosEspecificos();
}
