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
public class EstructurasDeControl {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int x = lector.nextInt();
        if(x == 10)
        {
            System.out.println("X es igual a 10");
        }
        
        if(x < 20)
        {
            System.out.println("X es menor a 20");
        }
        else
        {
            System.out.println("X no es menor a 20");
        }
        
        if(x == 30)
        {
            System.out.println("X es igual a 30");
        }
        else if(x > 35)
        {
            System.out.println("X es mayor a 35");
        }
        else if(x < 25)
        {
            System.out.println("X es menor a 25");
        }
        else
        {
            System.out.println("X tiene otro valor");
        }
    }
    
}
