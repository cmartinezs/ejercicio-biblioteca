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
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import cl.cmartinez.colegio.controlador.Controlador;
import cl.cmartinez.colegio.modelo.entidades.Categoria;
import cl.cmartinez.colegio.modelo.impl.ModeloVentanaPrincipal;
import cl.cmartinez.colegio.vista.impl.VentanaPrincipal;
import cl.cmartinez.colegio.vista.impl.principal.ItemComboBox;

/**
 *
 * @author carlo
 */
public final class ControladorVentanaPrincipal 
	extends Controlador<VentanaPrincipal, ModeloVentanaPrincipal> 
	implements ActionListener, KeyListener, ItemListener
{
    
    
    public ControladorVentanaPrincipal()
    {
        super(new VentanaPrincipal(), new ModeloVentanaPrincipal());
    }
    
    @Override
    public void iniciar()
    {
        cargarCategorias();
        cargarTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       String comando = e.getActionCommand();
       
       if(comando.equals("botonIngresarCategoria"))
       {
           String nombreCategoria = getVentana().getPanelCentral().getPanelSegundo().getCampoTextoNombreCategoria().getText();
           String descripcionCategoria = getVentana().getPanelCentral().getPanelSegundo().getCampoTextoDescripcionCategoria().getText();
           //getModelo().ingresarCategoria(nombreCategoria, descripcionCategoria);
           Categoria categoria = new Categoria();
           categoria.setNombre(nombreCategoria);
           categoria.setDescripcion(descripcionCategoria);
           getModelo().ingresarCategoria(categoria);
           cargarCategorias();
       }
       else if(comando.equals("radioButton"))
       {
           JRadioButton source = (JRadioButton)e.getSource();
           getVentana().getPanelCentral().getPanelTercero().getRadioButtonUno().setSelected(false);
           getVentana().getPanelCentral().getPanelTercero().getRadioButtonDos().setSelected(false);
           getVentana().getPanelCentral().getPanelTercero().getRadioButtonTres().setSelected(false);
           source.setSelected(true);
       }
       else if (comando.equals("botonMostrarSeleccionRadioButtons"))
       {
           Enumeration<AbstractButton> eab = getVentana().getPanelCentral().getPanelTercero().getGrupoRadioButtons().getElements();
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
        JComboBox<ItemComboBox> c = (JComboBox)e.getSource();
        String nombre = c.getName();
    }

    private void cargarCategorias()
    {
        JComboBox<ItemComboBox> comboCategoria = getVentana().getPanelCentral().getPanelSegundo().getComboCategoria();
        comboCategoria.removeAllItems();
        //ArrayList<String> lista = getModeloVentanaPrincipal().obtenerElementosComboCategoria();
        List<Categoria> lista = getModelo().obtenerTodasLasCategorias();
        for(Categoria elemento: lista)
        {
        	ItemComboBox item = new ItemComboBox();
        	item.setNombre(elemento.getNombre());
        	item.setValor(elemento.getId());
            comboCategoria.addItem(item);
        }
    }

    private void cargarTabla()
    {
    	getVentana().getPanelCentral().getPanelCuarto().setDataTablaInsumos(getModelo().obtenerTablaInsumos());
    }
}
