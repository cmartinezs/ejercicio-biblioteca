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
public class Curso 
{
    String nombre;
    Alumno[] alumnos;
    int proximoIndice = 0;

    public Curso(String nombre, int tamanioCurso) {
        this.nombre = nombre;
        alumnos = new Alumno[tamanioCurso];
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno[] getAlumnos() 
    {
        return alumnos;
    }
    
    public boolean sePuedeAgregarAlumno()
    {
        return proximoIndice <= alumnos.length;
    }
    
    public boolean agregarAlumno(String nombreAlumno, String apellidoPaterno, String apellidoMaterno, int cantidadRamos)
    {
        Alumno nuevoAlumno = new Alumno(nombreAlumno, apellidoPaterno, apellidoMaterno, cantidadRamos);
        return agregarAlumno(nuevoAlumno);
    }
    
    public boolean agregarAlumno(Alumno alumnoNuevo)
    {
        if(proximoIndice >= alumnos.length)
        {
            return false;
        }
        else
        {
            alumnos[proximoIndice] = alumnoNuevo;
            proximoIndice++;
            return true;
        }
    }
    
   /*public double calcularPromedio()
    {
        double sumaPromedios = 0;
        int cantPromedios = 0;
        
        for (int i = 0; i < alumnos.length; i++) 
        {
            if(alumnos[i] != null)
            {
                sumaPromedios += alumnos[i].calcularPromedio();
            }
        }
        
        return sumaPromedios / cantPromedios;
    }*/
}
