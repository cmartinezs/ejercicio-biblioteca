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
public class EjercicioCalculoAreaRectangulo 
{
    public static void main(String[] args) 
    {
        System.out.println("Ejercicios 2");
        System.out.println("============");
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el valor de la altura: ");
        int altura = lector.nextInt();
        System.out.println("Ingrese el valor de la base: ");
        int base = lector.nextInt();
        int areaRectangulo = altura * base;
        System.out.println("El área de un rectángulo de altura: " + altura + " y base:" + base + " es: " + areaRectangulo);   
    }
}
