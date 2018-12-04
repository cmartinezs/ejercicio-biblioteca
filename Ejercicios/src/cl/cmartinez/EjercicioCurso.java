/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez;

import cl.cmartinez.curso.Alumno;
import cl.cmartinez.curso.Ramo;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EjercicioCurso 
{
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantAlumnos = lector.nextInt();
        Alumno[] alumnos = new Alumno[cantAlumnos];
        for(int i = 0; i < cantAlumnos; i++) {
            System.out.println("Ingrese datos del alumno " + (i + 1) + ": ");
            System.out.print("Nombre: ");
            String nombre = lector.next();
            System.out.print("Apellido Paterno: ");
            String apellidoPaterno = lector.next();
            System.out.print("Apellido Materno: ");
            String apellidoMaterno = lector.next();
            System.out.print("Nota final: ");
            double notaFinal = lector.nextDouble();
            Alumno nuevoAlumno = new Alumno(nombre, apellidoPaterno, apellidoMaterno, notaFinal);
            alumnos[i] = nuevoAlumno;
        }
        double sumaNota = 0;
        for (int i = 0; i < cantAlumnos; i++) {
            Alumno alumno = alumnos[i];
            System.out.println("Alumno " + (i + 1) + ": " + alumno.getNombreCompleto() + 
                    ", tiene nota final " + alumno.getNotaFinal());
            sumaNota = sumaNota + alumno.getNotaFinal();
        }
        System.out.println("Promedio del curso: " + (sumaNota / cantAlumnos));
    }
}
