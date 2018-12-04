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
public class EjemploHerencia {
    public static void main(String[] args) 
    {
        Persona persona = new Alumno();
        persona.setEdad(22);
        persona.setNombre("Jorge");
        
        Alumno alumno = new Alumno();
        alumno.setEdad(25);
        alumno.setNombre("Pedro");
        alumno.setNotaFinal(5.5);
        
        Persona otraPersona = new Funcionario();
        otraPersona.setNombre("Lucho");
        otraPersona.setEdad(45);
        
        Persona[] personas = new Persona[3];
        personas[0] = persona;
        personas[1] = alumno;
        personas[2] = otraPersona;
        
        for(int i = 0; i < 3; i++)
        {
            personas[i].mostrarDatos();
        }
        
        Comunicacion[] arregloComunicacion = new Comunicacion[3];
        Alumno alumnoNuevo = new Alumno();
        alumnoNuevo.setEdad(20);
        alumnoNuevo.setNombre("Manuel");
        alumnoNuevo.setNotaFinal(4.5);
        arregloComunicacion[0] = alumnoNuevo;
        arregloComunicacion[1] = new Perro();
        arregloComunicacion[2] = new Gato();
        
        for(int i = 0; i < arregloComunicacion.length; i++)
        {
            arregloComunicacion[i].saludo();
        }
    }
}