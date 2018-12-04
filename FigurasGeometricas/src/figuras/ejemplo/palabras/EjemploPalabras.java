/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.ejemplo.palabras;

/**
 *
 * @author carlo
 */
public class EjemploPalabras {
    public static void main(String[] args)
    {
        String palabra = "Hola";
        String palabra2 = new String(" "); // " ";
        String palabra3 = new String("Mundo"); // "Mundo";
        String palabra4 = "aáqwertyuiop´+asdfghjklñ{}zxcvbnm,.-"; 
        System.out.println(palabra);
        System.out.println(palabra2);
        System.out.println(palabra3);
        System.out.println(palabra + palabra2 + palabra3);
        System.out.println(palabra4);
    }
}
