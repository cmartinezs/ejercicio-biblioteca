/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.vista;

import cl.cmartinez.colegio.vista.panels.BackgroundPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

/**
 *
 * @author carlo
 */
public final class VentanaPrincipal extends JFrame
{

    private JLabel etiquetaBienvenida;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelEste;
    private JPanel panelOeste;
    private JTabbedPane panelDePestanas;
    private JPanel panelInicio;
    
    private JToolBar barraDeHerramientas;
    private JButton botonGuardar;
    private JButton botonGuardarTodo;
    
    private static final Font FUENTE_PESTANA = new Font("Verdana", Font.BOLD, 12);

    public VentanaPrincipal()
    {
        super("Sistema de Gestión de Colegios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(getPanelDePestanas(), BorderLayout.CENTER);
        cp.add(getPanelNorte(), BorderLayout.NORTH);
        cp.add(getPanelSur(), BorderLayout.SOUTH);
        cp.add(getPanelEste(), BorderLayout.EAST);
        cp.add(getPanelOeste(), BorderLayout.WEST);
    }

    public JLabel getEtiquetaBienvenida()
    {
        if (etiquetaBienvenida == null)
        {
            etiquetaBienvenida = new JLabel("Bienvenido!");
            etiquetaBienvenida.setBounds(30, 30, 200, 30);
        }
        return etiquetaBienvenida;
    }

    public JPanel getPanelInicio()
    {
        if (panelInicio == null)
        {
            try
            {
                Image bgImagen = ImageIO.read(new File("resources/imagenes/bg/wp2224998.jpg"));
                panelInicio = new BackgroundPanel(bgImagen, BackgroundPanel.SCALED);

            }
            catch (IOException ex)
            {
                panelInicio = new JPanel();
            }

            panelInicio.add(getEtiquetaBienvenida());
        }
        return panelInicio;
    }

    public JTabbedPane getPanelDePestanas()
    {
        if (panelDePestanas == null)
        {
            panelDePestanas = new JTabbedPane();
            panelDePestanas.add(getPanelInicio(), 0);
            panelDePestanas.setName("panelDePestanas");
            panelDePestanas.setTitleAt(0, "Inicio");
            panelDePestanas.setIconAt(0, new ImageIcon("resources/imagenes/home_page.png"));
            panelDePestanas.setFont(FUENTE_PESTANA);
        }
        return panelDePestanas;
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
        }
        return panelSur;
    }

    public JPanel getPanelEste()
    {
        if (panelEste == null)
        {
            panelEste = new JPanel();
        }
        return panelEste;
    }

    public JPanel getPanelOeste()
    {
        if (panelOeste == null)
        {
            panelOeste = new JPanel();
        }
        return panelOeste;
    }

    public JToolBar getBarraDeHerramientas()
    {
        if(barraDeHerramientas == null)
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
        if(botonGuardar == null)
        {
            botonGuardar = new JButton();
            botonGuardar.setName("botonGuardar");
            botonGuardar.setActionCommand("botonGuardar");
            botonGuardar.setText("");
            botonGuardar.setToolTipText("Guardar");
            botonGuardar.setIcon(new ImageIcon("resources/imagenes/diskette.png"));
            //botonGuardar.addActionListener(this);
            botonGuardar.setSize(32, 32);
            botonGuardar.setLocation(0, 0);
        }
        return botonGuardar;
    }

    public JButton getBotonGuardarTodo()
    {
        if(botonGuardarTodo == null)
        {
            botonGuardarTodo = new JButton();
            botonGuardarTodo.setName("botonGuardarTodo");
            botonGuardarTodo.setActionCommand("botonGuardarTodo");
            botonGuardarTodo.setText("");
            botonGuardarTodo.setToolTipText("Guardar Todo");
            botonGuardarTodo.setIcon(new ImageIcon("resources/imagenes/disk_multiple.png"));
            //botonGuardar.addActionListener(this);
            botonGuardarTodo.setSize(32, 32);
            botonGuardarTodo.setLocation(32, 0);
        }
        return botonGuardarTodo;
    }
    
}
