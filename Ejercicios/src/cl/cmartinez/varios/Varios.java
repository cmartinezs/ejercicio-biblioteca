/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.varios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Varios 
{
    public static void main(String[] args) 
    {
        //Uso for-each
        /*String[] saludos = new String[] { "Hola", "Chao", "Bienvenido", "Adiós", "Yuju" };
        
        for(String saludo: saludos)
        {
            String respuesta;
            
            switch (saludo)
            {
                case "Hola": respuesta = "Qué tal?"; break;
                case "Chao": respuesta = "Bye!"; break;
                case "Bienvenido": respuesta = "Muchas gracias!"; break;
                case "Adiós": respuesta = "Hasta pronto!"; break;
                default: respuesta = "nada"; break;
            }
            
            System.out.println("Me dijeron '" + saludo +"', yo respondo '" + respuesta + "'.");
        }
        
        for(int i = 0; i < 10; i++)
        {
            i = i++;
            System.out.println("Hola mundo: i = " + i);
        }*/
    	
    	boolean keepGoing = true;
    	
    	int count = 0;
    	
    	int x= 3;
    	
    	while(count++ < 3)
    	{
    		int y = (1 + 2 * count) % 3;
    		
    		switch(y)
    		{
    			default:
    			case 0: x -= 1; break;
    			case 1: x += 5; break;
    		}
    	}
    	
    	System.out.println(x);
    }
}
