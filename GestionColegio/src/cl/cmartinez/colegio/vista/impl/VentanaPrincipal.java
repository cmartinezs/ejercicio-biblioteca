/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.vista.impl;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import cl.cmartinez.colegio.vista.Ventana;
import cl.cmartinez.colegio.vista.impl.principal.PanelPestanas;

/**
 *
 * @author carlo
 */
public final class VentanaPrincipal extends Ventana
{
	private PanelPestanas panelCentral;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelEste;
    private JPanel panelOeste;

    private JToolBar barraDeHerramientas;
    private JToolBar barraMenu;
    private JButton botonGuardar;
    private JButton botonGuardarTodo;
    private JButton botonFuncion;
    private JButton botonEste;

    public VentanaPrincipal()
    {
        super("Sistema de Gestión de Colegios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(getPanelCentral(), BorderLayout.CENTER);
        cp.add(getPanelNorte(), BorderLayout.NORTH);
        cp.add(getPanelSur(), BorderLayout.SOUTH);
        cp.add(getPanelEste(), BorderLayout.EAST);
        cp.add(getPanelOeste(), BorderLayout.WEST);
    }
    
    public PanelPestanas getPanelCentral ()
    {
    	if(panelCentral == null) 
    	{
    		panelCentral = new PanelPestanas();
    	}
    	return panelCentral;
    }

    public JPanel getPanelNorte()
    {
        if (panelNorte == null)
        {
            GridLayout gl = new GridLayout(1, 1);
            gl.setHgap(5);
            gl.setVgap(5);
            panelNorte = new JPanel();
            panelNorte.setLayout(gl);
            panelNorte.setSize(getContentPane().getWidth(), 200);
            panelNorte.setLocation(0, 0);
            panelNorte.add(getBarraDeHerramientas());
        }
        return panelNorte;
    }

    public JPanel getPanelSur()
    {
        if (panelSur == null)
        {
            panelSur = new JPanel();
            panelSur.add(new JButton("South"));
        }
        return panelSur;
    }

    public JPanel getPanelEste()
    {
        if (panelEste == null)
        {
            panelEste = new JPanel();
            panelEste.setLocation(0, 0);
            panelEste.setSize(300, getContentPane().getHeight() - getPanelNorte().getHeight() - getPanelSur().getHeight());
            panelEste.add(getBotonEste());
        }
        return panelEste;
    }
    
    public JButton getBotonEste()
    {
        if (botonEste == null)
        {
        	botonEste = new JButton();
        	botonEste.setName("botonEste");
        	botonEste.setActionCommand("botonEste");
        	botonEste.setText("East");
        	botonEste.setSize(50, 30);
        }
        return botonEste;
    }

    public JPanel getPanelOeste()
    {
        if (panelOeste == null)
        {
            panelOeste = new JPanel();
            panelOeste.setLayout(new FlowLayout());
            panelOeste.setSize(300, getContentPane().getHeight() - getPanelNorte().getHeight() - getPanelSur().getHeight());
            panelOeste.setLocation(0, 0);
            panelOeste.add(getBotonFuncion());
        }
        return panelOeste;
    }

    public JToolBar getBarraMenu()
    {
        if (barraMenu == null)
        {
            barraMenu = new JToolBar("barraMenu");
            barraMenu.setBounds(0, 0, getPanelOeste().getWidth(), getPanelOeste().getHeight());
            barraMenu.add(getBotonFuncion());
        }
        return barraMenu;
    }

    public JToolBar getBarraDeHerramientas()
    {
        if (barraDeHerramientas == null)
        {
            barraDeHerramientas = new JToolBar("barraPrincipal");
            barraDeHerramientas.setBounds(0, 0, getPanelNorte().getWidth(), getPanelNorte().getHeight());
            barraDeHerramientas.add(getBotonGuardar());
            barraDeHerramientas.add(getBotonGuardarTodo());
        }
        return barraDeHerramientas;
    }

    public JButton getBotonGuardar()
    {
        if (botonGuardar == null)
        {
            botonGuardar = new JButton();
            botonGuardar.setName("botonGuardar");
            botonGuardar.setActionCommand("botonGuardar");
            botonGuardar.setText("");
            botonGuardar.setToolTipText("Guardar");
            botonGuardar.setIcon(new ImageIcon("resources/imagenes/diskette.png"));
            botonGuardar.setSize(32, 32);
            botonGuardar.setLocation(0, 0);
        }
        return botonGuardar;
    }

    public JButton getBotonGuardarTodo()
    {
        if (botonGuardarTodo == null)
        {
            botonGuardarTodo = new JButton();
            botonGuardarTodo.setName("botonGuardarTodo");
            botonGuardarTodo.setActionCommand("botonGuardarTodo");
            botonGuardarTodo.setText("");
            botonGuardarTodo.setToolTipText("Guardar Todo");
            botonGuardarTodo.setIcon(new ImageIcon("resources/imagenes/disk_multiple.png"));
            botonGuardarTodo.setSize(32, 32);
            botonGuardarTodo.setLocation(32, 0);
        }
        return botonGuardarTodo;
    }

    public JButton getBotonFuncion()
    {
        if (botonFuncion == null)
        {
            botonFuncion = new JButton();
            botonFuncion.setName("botonFuncion");
            botonFuncion.setActionCommand("botonFuncion");
            botonFuncion.setText("Agregar pestaña");
            botonFuncion.setSize(50, 30);
        }
        return botonFuncion;
    }
}
