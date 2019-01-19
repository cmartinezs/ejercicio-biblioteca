/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.controlador.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import cl.cmartinez.colegio.controlador.Controlador;
import cl.cmartinez.colegio.modelo.impl.ModeloVentanaPrincipal;
import cl.cmartinez.colegio.vista.impl.VentanaPrincipal;

/**
 *
 * @author carlo
 */
public final class ControladorVentanaPrincipal extends Controlador implements ActionListener, KeyListener, ItemListener
{
    
    
    public ControladorVentanaPrincipal(VentanaPrincipal ventana, ModeloVentanaPrincipal modelo)
    {
        super(ventana, modelo);
    }
    
    @Override
    public void iniciarControlador()
    {
        getVentanaPrincipal().getBotonGuardar().addActionListener(this);
        getVentanaPrincipal().getBotonGuardarTodo().addActionListener(this);
        getVentanaPrincipal().getPanelCentral().getPanelSegundo().getBotonIngresarCategoria().addActionListener(this);
        getVentanaPrincipal().getPanelCentral().getPanelTercero().getRadioButtonUno().addActionListener(this);
        getVentanaPrincipal().getPanelCentral().getPanelTercero().getRadioButtonDos().addActionListener(this);
        getVentanaPrincipal().getPanelCentral().getPanelTercero().getRadioButtonTres().addActionListener(this);
        getVentanaPrincipal().getPanelCentral().getPanelTercero().getBotonMostrarSeleccionRadioButtons().addActionListener(this);
        JComboBox<String> comboCategoria = getVentanaPrincipal().getPanelCentral().getPanelSegundo().getComboCategoria();
        comboCategoria.addItemListener(this);
        cargarCategorias();
        cargarTabla();
        
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
       String comando = e.getActionCommand();
       
       if(comando.equals("botonIngresarCategoria"))
       {
           String nombreCategoria = getVentanaPrincipal().getPanelCentral().getPanelSegundo().getCampoTextoNombreCategoria().getText();
           String descripcionCategoria = getVentanaPrincipal().getPanelCentral().getPanelSegundo().getCampoTextoDescripcionCategoria().getText();
           getModeloVentanaPrincipal().ingresarCategoria(nombreCategoria, descripcionCategoria);
           cargarCategorias();
       }
       else if(comando.equals("radioButton"))
       {
           JRadioButton source = (JRadioButton)e.getSource();
           getVentanaPrincipal().getPanelCentral().getPanelTercero().getRadioButtonUno().setSelected(false);
           getVentanaPrincipal().getPanelCentral().getPanelTercero().getRadioButtonDos().setSelected(false);
           getVentanaPrincipal().getPanelCentral().getPanelTercero().getRadioButtonTres().setSelected(false);
           source.setSelected(true);
       }
       else if (comando.equals("botonMostrarSeleccionRadioButtons"))
       {
           Enumeration<AbstractButton> eab = getVentanaPrincipal().getPanelCentral().getPanelTercero().getGrupoRadioButtons().getElements();
           AbstractButton ab = null;
           while(eab.hasMoreElements())
           {
               ab = eab.nextElement();
               if(ab.isSelected())
               {
                   break;
               }
           }
           
           String texto;
           
           if(ab == null)
           {
               texto = "No hay selección";
           }
           else
           {
               texto = "Selección: \"" + ab.getText() + "\"";
           }
           
           JOptionPane.showMessageDialog(null, texto);
       }
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

    private void cargarCategorias()
    {
        JComboBox<String> comboCategoria = getVentanaPrincipal().getPanelCentral().getPanelSegundo().getComboCategoria();
        comboCategoria.removeAllItems();
        ArrayList<String> lista = getModeloVentanaPrincipal().obtenerElementosComboCategoria();
        for(String elemento: lista)
        {
            comboCategoria.addItem(elemento);
        }
    }

    private void cargarTabla()
    {
        getVentanaPrincipal().getPanelCentral().getPanelCuarto().setDataTablaInsumos(getModeloVentanaPrincipal().obtenerTablaInsumos());
    }
}
