/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.claseinterna;

/**
 *
 * @author carlo
 */
public class EjecrcicioClaseInterna 
{
    public static void main(String[] args) 
    {
        ClaseExterna objetoExterno = new ClaseExterna();
        objetoExterno.setAtributoExterno(10);
        ClaseExterna.ClaseInterna objetoInterno = objetoExterno.new ClaseInterna();
        objetoInterno.setAtributoInterno(20);
        objetoInterno.mostrarAtributosInternosYExternos();
    }
}
