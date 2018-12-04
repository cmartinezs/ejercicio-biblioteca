/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.estructuras;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EstructurasIterativas 
{
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        
        int numero = lector.nextInt();
        int numeroParaSumar;
        int totalSuma = 0;
        
        for(int i = 0; i < numero; i++)
        {
            System.out.print("Ingrese un valor para sumar: ");
            numeroParaSumar = lector.nextInt();
            totalSuma = totalSuma + numeroParaSumar;
            System.out.println("Suma parcial: " + totalSuma);
        }
        System.out.println("Suma final: " + totalSuma);
    }
}
