/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.curso.herencia;

/**
 *
 * @author carlo
 */
public class Gato implements Comunicacion
{

    @Override
    public void saludo() 
    {
        System.out.println("Miau!");
    }
    
}
