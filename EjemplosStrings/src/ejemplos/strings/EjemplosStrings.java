/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.strings;

/**
 *
 * @author carlo
 */
public class EjemplosStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String saludo = "Hola Mundo";
        String saludo2 = "Hola Mundo";
        String saludo3 = new String("Hola Mundo");
        System.out.println("saludo == saludo2: " + (saludo == saludo2));
        System.out.println("saludo == saludo3: " + (saludo == saludo3));
        System.out.println("saludo.equals(saludo3): " + saludo.equals(saludo3));
        System.out.println("saludo != saludo2: " + (saludo != saludo2));
        System.out.println("saludo != saludo3: " + (saludo != saludo3));
        System.out.println("!saludo.equals(saludo3): " + !saludo.equals(saludo3));
        
        Integer numero = new Integer(0);
        System.out.println("!saludo.equals(numero): " + !saludo.equals(numero));
        
        System.out.println("saludo.charAt(0): " + saludo.charAt(0));
        System.out.println("saludo.charAt(1): " + saludo.charAt(1));
        System.out.println("saludo.charAt(2): " + saludo.charAt(2));
        System.out.println("saludo.charAt(3): " + saludo.charAt(3));
        System.out.println("saludo.replace(\"Hola\", \"Chao\"): " + saludo.replace("Hola", "Chao"));
        System.out.println("saludo: " +  saludo);   
        String despedida = saludo.replace("Hola", "Chao");
        System.out.println("despedida = saludo.replace(\"Hola\", \"Chao\"): " +  despedida);
        System.out.println("saludo: " +  saludo);
        saludo = saludo.replace("Hola Mundo", "Chao");
        System.out.println("saludo = saludo.replace(\"Hola Mundo\", \"Chao\"): " +  saludo);
        System.out.println("Largo de 'saludo': " + saludo.length());
        System.out.println("saludo.concat(\" Mundo\"): " + saludo.concat(" Mundo"));
        System.out.println("saludo.substring(0, 3): " + saludo.substring(0, 3));
        System.out.println("saludo.substring(0, 2): " + saludo.substring(0, 2));
        System.out.println("saludo.substring(1, 2): " + saludo.substring(1, 2));
        System.out.println("saludo.substring(1, 2): " + saludo.substring(3, 3));
        System.out.println("saludo.isEmpty(): " + saludo.isEmpty());
        System.out.println("saludo.indexOf(\"C\"): " + saludo.indexOf("C"));
        System.out.println("saludo.indexOf(\"o\"): " + saludo.indexOf("o"));
        System.out.println("saludo.indexOf(\"c\"): " + saludo.indexOf("c"));
        System.out.println("saludo.startsWith(\"Ch\"): " + saludo.startsWith("Ch"));
        System.out.println("saludo.endsWith(\"Cha\"): " + saludo.endsWith("Cha"));
        System.out.println("saludo.toLowerCase(): " + saludo.toLowerCase());
        System.out.println("saludo.toUpperCase(): " + saludo.toUpperCase());
    }
    
}
