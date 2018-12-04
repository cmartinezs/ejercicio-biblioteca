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
public class EjerciciosSumaDosNumeros 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Ejercicios 1");
        System.out.println("============");
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un valor para 'a': ");
        int a = lector.nextInt();//9876;
        System.out.println("Ingrese un valor para 'b': ");
        int b = lector.nextInt();//6336;
        int suma = a + b;
        System.out.println("La suma entre " + a + " y " + b + " es: " + suma);
    }
    
}
