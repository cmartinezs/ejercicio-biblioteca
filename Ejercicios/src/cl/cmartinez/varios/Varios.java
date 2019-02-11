/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.varios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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
    	
    	/*boolean keepGoing = true;
    	
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
    	
    	System.out.println(x);*/
    	
    	List<String> listaStrings = Arrays.asList("Hola", "HolaMundo", "Lista", "HStrings");

    	for(int i = 0; i < listaStrings.size(); i++)
    	{
    		System.out.println("Elemento " + i + ": " + listaStrings.get(i));
    	}
    	int i = 0;
    	for(String elemento: listaStrings)
    	{
    		System.out.println("Elemento " + i + ": " + elemento);
    		i++;
    	}
    	
    	listaStrings.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Elemento: " + t);
			}
		});
    	
    	listaStrings.forEach(t -> System.out.println("Elemento: " + t));
    	
    	Optional<String> optional = listaStrings.stream().filter(t -> t.startsWith("H")).findFirst();
    	if(optional.isPresent())
    	{
    		System.out.println("Hay un primer elemento");
    	}
    	else
    	{
    		System.out.println("No hay un primer elemento");
    	}
    	
    	optional.ifPresent(t -> System.out.println("Elemento encontrado: " + t));
    }
}
