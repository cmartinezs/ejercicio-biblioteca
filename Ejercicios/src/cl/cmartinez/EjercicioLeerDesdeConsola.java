/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EjercicioLeerDesdeConsola 
{
    public static void main(String[] args) 
    {
        Scanner escanerDeTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese un texto: ");
        String leido = escanerDeTeclado.next();
        System.out.println("El texto ingresado es: " + leido);
        
        System.out.print("Ingrese otro texto: ");
        leido = escanerDeTeclado.next();
        System.out.println("El otro texto ingresado es: " + leido);
        
        System.out.print("Ingrese un número: ");
        int numeroLeido = escanerDeTeclado.nextInt();
        System.out.println("El número ingresado es: " + numeroLeido);
    }
}
