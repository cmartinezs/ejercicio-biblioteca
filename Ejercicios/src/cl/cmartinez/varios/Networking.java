/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.varios;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class Networking
{
    public static void main(String[] args)
    {
        List<Integer> lista = new LinkedList<Integer>();
        lista.add(4);
        lista.add(2);
        lista.add(5);
        
        int r = 1;
        
        doStuff(r);
        System.out.println(lista.get(r));
    }
    
    static int doStuff(int x)
    {
        return ++x;
    }
}
