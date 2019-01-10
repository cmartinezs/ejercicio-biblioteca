/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.controlador.impl;

import cl.cmartinez.colegio.controlador.Controlador;
import cl.cmartinez.colegio.modelo.Modelo;
import cl.cmartinez.colegio.vista.impl.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author carlo
 */
public final class ControladorVentanaPrincipal extends Controlador implements ActionListener, KeyListener
{
    public ControladorVentanaPrincipal(VentanaPrincipal ventana, Modelo modelo)
    {
        super(ventana, modelo);
    }
    
    @Override
    public void iniciarControlador()
    {
        getVentanaPrincipal().getBotonGuardar().addActionListener(this);
        getVentanaPrincipal().getBotonGuardarTodo().addActionListener(this);
    }
    
    public VentanaPrincipal getVentanaPrincipal()
    {
        return (VentanaPrincipal) getVentana();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
