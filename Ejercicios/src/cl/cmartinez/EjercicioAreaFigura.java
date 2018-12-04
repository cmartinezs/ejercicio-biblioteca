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
public class EjercicioAreaFigura 
{
    public static void main(String[] args) 
    {
        System.out.println("Ejercicios 3");
        System.out.println("============");
        Scanner lector = new Scanner(System.in);
        //Circulo
        System.out.print("Ingrese el valor del radio: ");
        double radio = lector.nextDouble();
        final double pi = 3.14;
        double areaCirculo = pi * radio * radio;
        System.out.println("Area circulo de radio=" + radio + " es: " + areaCirculo);
        double mitadAreaCirculo = areaCirculo / 2;
        //Triangulo
        System.out.print("Ingrese el valor de la hipotenusa: ");
        double hipotenusa = lector.nextDouble();
        double catetoX = Math.sqrt((hipotenusa * hipotenusa) - (radio * radio));
        double areaTriangulo = (radio * catetoX) / 2;
        System.out.println("El área de triangulo de base=" +  radio + ", altura=" + catetoX+" es: " + areaTriangulo);
        
        double areaFigura = mitadAreaCirculo + (areaTriangulo * 2);
        
        System.out.println("El area final de la figura es: " +areaFigura);
    }
}
