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
public class EstructurasIterativasDoWhile 
{
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        int numero;
        do
        {
            System.out.print("Ingrese un numero: ");        
            numero = lector.nextInt();
        }
        while(numero < 1);
        
        int numeroParaSumar;
        int totalSuma = 0;
        
        int i = 0;
        
        do
        {
            System.out.print("Ingrese un valor para sumar: ");
            numeroParaSumar = lector.nextInt();
            totalSuma = totalSuma + numeroParaSumar;
            System.out.println("Suma parcial: " + totalSuma);
            i++;
        }
        while(i < numero);
        
        System.out.println("Suma final: " + totalSuma);
    }
}
