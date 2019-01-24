/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.vista;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 *
 * @author carlo
 */
public abstract class Ventana extends JFrame
{
    public Ventana (String nombre)
    {
        super(nombre);
    }
    
    public abstract void agregarKeyListener(KeyListener listener);
    
    public abstract void agregarActionListener(ActionListener listener);
    
    public abstract void agregarItemListener(ItemListener listener);
}
