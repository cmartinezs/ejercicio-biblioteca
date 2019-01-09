/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez;

import java.util.HashMap;

/**
 *
 * @author carlo
 */
public class EjemploCollections
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> mapa = new HashMap();
        mapa.put("clave1", 1);
        mapa.put("clave2", 2);
        mapa.put("clave3", 3);
        System.out.println("Mapa: " + mapa);
        
        Integer valor2 = mapa.get("clave2");
        System.out.println("Valor clave2: " + valor2);
        System.out.println("Existe clave5: " + mapa.containsKey("clave5"));
        System.out.println("Existe clave1: " + mapa.containsKey("clave1"));
        
    }
}
