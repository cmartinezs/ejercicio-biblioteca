/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.controlador.impl;

import cl.cmartinez.colegio.controlador.Controlador;
import cl.cmartinez.colegio.modelo.Modelo;
import cl.cmartinez.colegio.modelo.impl.ModeloVentanaPrincipal;
import cl.cmartinez.colegio.vista.impl.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author carlo
 */
public final class ControladorVentanaPrincipal extends Controlador implements ActionListener, KeyListener, ItemListener
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
        JComboBox<String> comboCategoria = getVentanaPrincipal().getComboCategoria();
        comboCategoria.addItemListener(this);
        ArrayList<String> lista = getModeloVentanaPrincipal().obtenerElementosComboCategoria();
        
        for(String elemento: lista)
        {
            comboCategoria.addItem(elemento);
        }
        
        /*for(int i = 0; i < lista.size(); i++)
        {
            String elemento = lista.get(i);
        }*/
    }
    
    public VentanaPrincipal getVentanaPrincipal()
    {
        return (VentanaPrincipal) getVentana();
    }
    
    public ModeloVentanaPrincipal getModeloVentanaPrincipal()
    {
        return (ModeloVentanaPrincipal) getModelo();
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

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        JComboBox c = (JComboBox)e.getSource();
        String nombre = c.getName();
    }
}
