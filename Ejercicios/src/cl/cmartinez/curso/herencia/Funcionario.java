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
public class Funcionario extends Persona
{
    @Override
    public void mostrarDatos() 
    {
        System.out.println("Soy un funcionario!");
    }
}
