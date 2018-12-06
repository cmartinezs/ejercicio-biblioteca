/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.biblioteca;

import cl.cmartinez.biblioteca.basededatos.BasePublicaciones;
import cl.cmartinez.biblioteca.publicaciones.Prestable;
import cl.cmartinez.biblioteca.publicaciones.Publicacion;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Biblioteca 
{
    static Publicacion[] publicaciones;
    static Scanner lector = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        BasePublicaciones base = new BasePublicaciones();
        publicaciones = base.getPublicaciones();
        
        int opcion = 0;
        
        do 
        {            
            opcion = mostrarMenuPrincipal();
            
            switch (opcion) 
            {
                case 1:
                    prestarPublicacion();
                    break;
                case 2:
                    devolverPublicacion();
                    break;
                case 3:
                    mostrarPublicaciones();
                    break;
                default:
                    break;
            }
        } 
        while (opcion != 4);
        
        System.out.println("Cerrando sistema de biblioteca...");
    }

    private static int mostrarMenuPrincipal() 
    {
        int opcion;
        boolean rangoValido;
        do
        {
            System.out.println("Biblioteca");
            System.out.println("==========");
            System.out.println("1. Solicitar préstamo de una publicación");
            System.out.println("2. Realizar devolución de publicación");
            System.out.println("3. Estado de publicaciones");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("Seleccione opción: ");
        
            opcion = leerEntero();
            rangoValido = validarRango(1, 4, opcion);
            
            if(!rangoValido)
            {
                System.out.println("Opción no válida!");
                opcion = 0;
            }
        }
        while(!rangoValido);
        return opcion;
    }

    private static void devolverPublicacion() {
        int opcion;
        boolean rangoValido;
        do
        {
            opcion = seleccionarOpcion("Ingrese la publicacion que desea devolver: ");
            rangoValido = validarRango(0, publicaciones.length - 1, opcion);
        }
        while (!rangoValido);
        boolean devuelto = devolver(opcion);
        if (devuelto)
        {
            System.out.print("Se ha devuelto ");
        }
        else
        {
            System.out.print("No se ha devuelto ");
        }
        publicaciones[opcion].mostrarDatos();
    }

    private static void prestarPublicacion() {
        int opcion;
        boolean rangoValido;
        do
        {
            opcion = seleccionarOpcion("Ingrese la publicacion que desea pedir prestada: ");
            rangoValido = validarRango(0, publicaciones.length - 1, opcion);
            if(!rangoValido)
            {
                System.out.println("Selección no válida!");
                opcion = 0;
            }
        }
        while (!rangoValido);
        boolean prestado = pedirPrestado(opcion);
        if (prestado)
        {
            System.out.print("Se ha prestado ");
        }
        else
        {
            System.out.print("No se ha prestado ");
        }
        publicaciones[opcion].mostrarDatos();
    }

    private static int leerEntero() 
    {
        int opcion = 0;
        
        try
        {
            opcion = lector.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Error: Se ha ingresado una letra!");
        }
        return opcion;
    }
    
    private static void mostrarPublicaciones()
    {
        for (int i = 0; i < publicaciones.length; i++) 
        {
            Publicacion publicacion = publicaciones[i];
            System.out.print(i + ".- ");
            publicacion.mostrarDatos();
        }
    }

    private static boolean validarRango(int desde, int hasta, int valor) 
    {
        return valor >= desde && valor <= hasta;
    }
    
    private static int seleccionarOpcion(String mensaje)
    {
        mostrarPublicaciones();
        System.out.print(mensaje);
        return leerEntero();
    }

    private static boolean pedirPrestado(int indice) 
    {
        boolean prestado;
        Publicacion publicacion = publicaciones[indice];
        
        if(publicacion instanceof Prestable)
        {
            Prestable publicacionPrestable = (Prestable) publicacion;
            prestado = publicacionPrestable.prestar();
        }
        else
        {
            System.out.print("La publicación no es 'prestable': ");
            publicacion.mostrarDatos();
            prestado = false;
        }
        
        return prestado;
    }

    private static boolean devolver(int indice) 
    {
        boolean devuelto;
        Publicacion publicacion = publicaciones[indice];
        
        if(publicacion instanceof Prestable)
        {
            Prestable publicacionPrestable = (Prestable) publicacion;
            devuelto = publicacionPrestable.devolver();
        }
        else
        {
            System.out.print("La publicación no es 'prestable': ");
            publicacion.mostrarDatos();
            devuelto = false;
        }
        
        return devuelto;
    }
}
