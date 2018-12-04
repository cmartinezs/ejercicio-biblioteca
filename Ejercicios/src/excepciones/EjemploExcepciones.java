/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EjemploExcepciones 
{
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        try
        {
            int numero = lector.nextInt();
            
            System.out.println("El numero es: " +  numero);
        }
        catch (Exception unaExcepcion)
        {
            System.out.println("Error al leer numero: " + unaExcepcion.getMessage());
        }
        finally
        {
            System.out.println("Este mensaje siempre saldrá!");
        }
    }
}
