/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.vista.impl;

import cl.cmartinez.colegio.vista.Ventana;
import cl.cmartinez.colegio.vista.panels.BackgroundPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ScrollPaneLayout;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public final class VentanaPrincipal extends Ventana
{

    private JLabel etiquetaBienvenida;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelEste;
    private JPanel panelOeste;
    private JTabbedPane panelDePestanas;
    private JPanel panelInicio;
    private JPanel panelSegundo;
    private JPanel panelTercero;
    private JPanel panelDentroDeScroll;
    private JScrollPane panelScroll;
    private JScrollPane tablaInsumosScroll;
    private JTable tablaInsumos;
    private JComboBox<String> comboCategoria;

    private JToolBar barraDeHerramientas;
    private JToolBar barraMenu;
    private JButton botonGuardar;
    private JButton botonGuardarTodo;
    private JButton botonFuncion;

    private JTextField campoTextoNombreCategoria;
    private JTextField campoTextoDescripcionCategoria;
    private JButton botonIngresarCategoria;
    private JButton botonMostrarSeleccionRadioButtons;
    private JRadioButton radioButtonUno;
    private JRadioButton radioButtonDos;
    private JRadioButton radioButtonTres;
    
    private JTextField campoIdInsumo;
    private JTextField campoCodigoInsumo;
    private JTextField campoNombreInsumo;
    private JTextField campoDescripcionInsumo;
    private JTextField campoIdCategoriaInsumo;

    private ButtonGroup grupoRadioButtons;
    
    List<List<String>> listaInsumos;

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
        cp.add(new JButton("South"), BorderLayout.SOUTH);
        cp.add(new JButton("East"), BorderLayout.EAST);
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

            panelInicio.setLayout(null);
            panelInicio.add(getEtiquetaBienvenida());
        }
        return panelInicio;
    }

    public JPanel getPanelSegundo()
    {
        if (panelSegundo == null)
        {
            try
            {
                Image bgImagen = ImageIO.read(new File("resources/imagenes/bg/wp2224998.jpg"));
                panelSegundo = new BackgroundPanel(bgImagen, BackgroundPanel.SCALED);

            }
            catch (IOException ex)
            {
                panelSegundo = new JPanel();
            }

            panelSegundo.setLayout(null);
            panelSegundo.add(getCampoTextoNombreCategoria());
            panelSegundo.add(getCampoTextoDescripcionCategoria());
            panelSegundo.add(getBotonIngresarCategoria());
            panelSegundo.add(getComboCategoria());
        }
        return panelSegundo;
    }

    public JPanel getPanelTercero()
    {
        if (panelTercero == null)
        {
            try
            {
                Image bgImagen = ImageIO.read(new File("resources/imagenes/bg/wp2224998.jpg"));
                panelTercero = new BackgroundPanel(bgImagen, BackgroundPanel.SCALED);

            }
            catch (IOException ex)
            {
                panelTercero = new JPanel();
            }

            panelTercero.setLayout(null);
            panelTercero.add(getRadioButtonUno());
            panelTercero.add(getRadioButtonDos());
            panelTercero.add(getRadioButtonTres());
            panelTercero.add(getBotonMostrarSeleccionRadioButtons());
        }
        return panelTercero;
    }

    public JScrollPane getPanelScroll()
    {
        if (panelScroll == null)
        {
            panelScroll = new JScrollPane(getPanelDentroDeScroll());
            panelScroll.setLayout(new ScrollPaneLayout());
            panelScroll.setBounds(0, 0, 400, 600);
            panelScroll.setBorder(BorderFactory.createLineBorder(Color.yellow));
        }
        return panelScroll;
    }

    public JPanel getPanelDentroDeScroll()
    {
        if (panelDentroDeScroll == null)
        {
            //try
            //{
            //    Image bgImagen = ImageIO.read(new File("resources/imagenes/bg/wp2224998.jpg"));
            //    panelDentroDeScroll = new BackgroundPanel(bgImagen, BackgroundPanel.SCALED);

            //}
            //catch (IOException ex)
            //{
            panelDentroDeScroll = new JPanel();
            //}

            panelDentroDeScroll.setLayout(new GridLayout());
            panelDentroDeScroll.setBounds(0, 0, 400, 2000);

            JPanel pivote = new JPanel();
            pivote.setLayout(null);
            pivote.setBounds(0, 0, 400, 2000);
            pivote.add(getRadioButtonUno());
            pivote.add(getRadioButtonDos());
            pivote.add(getRadioButtonTres());
            pivote.add(getBotonMostrarSeleccionRadioButtons());

            panelDentroDeScroll.add(pivote);
        }
        return panelDentroDeScroll;
    }

    public JTabbedPane getPanelDePestanas()
    {
        if (panelDePestanas == null)
        {
            panelDePestanas = new JTabbedPane();
            panelDePestanas.add(getPanelInicio(), 0);
            panelDePestanas.add(getPanelSegundo(), 1);
            panelDePestanas.add(getPanelTercero(), 2);
            JPanel pivote = new JPanel();
            pivote.setLayout(null);
            pivote.add(getTablaInsumosScroll());
            pivote.add(getCampoIdInsumo());
            pivote.add(getCampoCodigoInsumo());
            pivote.add(getCampoNombreInsumo());
            pivote.add(getCampoDescripcionInsumo());
            pivote.add(getCampoIdCategoriaInsumo());
            panelDePestanas.add(pivote, 3);
            panelDePestanas.setName("panelDePestanas");
            panelDePestanas.setTitleAt(0, "Inicio");
            panelDePestanas.setTitleAt(1, "Segundo");
            panelDePestanas.setTitleAt(2, "Tercero");
            panelDePestanas.setTitleAt(3, "Tabla Scroll");
            panelDePestanas.setIconAt(0, new ImageIcon("resources/imagenes/home_page.png"));
            panelDePestanas.setIconAt(1, new ImageIcon("resources/imagenes/user_green.png"));
            panelDePestanas.setIconAt(2, new ImageIcon("resources/imagenes/user_silhouette.png"));
            panelDePestanas.setIconAt(3, new ImageIcon("resources/imagenes/key_solid.png"));
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

    public JComboBox<String> getComboCategoria()
    {
        if (comboCategoria == null)
        {
            comboCategoria = new JComboBox();
            comboCategoria.setBounds(300, 80, 200, 30);
        }
        return comboCategoria;
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

    public JTextField getCampoTextoNombreCategoria()
    {
        if (campoTextoNombreCategoria == null)
        {
            campoTextoNombreCategoria = new JTextField();
            campoTextoNombreCategoria.setBounds(50, 80, 200, 30);
        }
        return campoTextoNombreCategoria;
    }

    public JTextField getCampoTextoDescripcionCategoria()
    {
        if (campoTextoDescripcionCategoria == null)
        {
            campoTextoDescripcionCategoria = new JTextField();
            campoTextoDescripcionCategoria.setBounds(50, 120, 200, 30);
        }
        return campoTextoDescripcionCategoria;
    }

    public JButton getBotonIngresarCategoria()
    {
        if (botonIngresarCategoria == null)
        {
            botonIngresarCategoria = new JButton();
            botonIngresarCategoria.setText("Ingresar Categoria");
            botonIngresarCategoria.setName("botonIngresarCategoria");
            botonIngresarCategoria.setActionCommand("botonIngresarCategoria");
            botonIngresarCategoria.setBounds(50, 160, 200, 30);
        }
        return botonIngresarCategoria;
    }

    public JButton getBotonMostrarSeleccionRadioButtons()
    {
        if (botonMostrarSeleccionRadioButtons == null)
        {
            botonMostrarSeleccionRadioButtons = new JButton();
            botonMostrarSeleccionRadioButtons.setText("Mostrar selección");
            botonMostrarSeleccionRadioButtons.setName("botonMostrarSeleccionRadioButtons");
            botonMostrarSeleccionRadioButtons.setActionCommand("botonMostrarSeleccionRadioButtons");
            botonMostrarSeleccionRadioButtons.setBounds(50, 150, 200, 30);
        }
        return botonMostrarSeleccionRadioButtons;
    }

    public ButtonGroup getGrupoRadioButtons()
    {
        if (grupoRadioButtons == null)
        {
            grupoRadioButtons = new ButtonGroup();
            grupoRadioButtons.add(getRadioButtonUno());
            grupoRadioButtons.add(getRadioButtonDos());
            grupoRadioButtons.add(getRadioButtonTres());
        }
        return grupoRadioButtons;
    }

    public JRadioButton getRadioButtonUno()
    {
        if (radioButtonUno == null)
        {
            radioButtonUno = new JRadioButton("Eleccion 1");
            radioButtonUno.setName("radioButton");
            radioButtonUno.setActionCommand("radioButton");
            radioButtonUno.setBounds(50, 50, 200, 30);
            radioButtonUno.setSelected(false);
        }
        return radioButtonUno;
    }

    public JRadioButton getRadioButtonDos()
    {
        if (radioButtonDos == null)
        {
            radioButtonDos = new JRadioButton("Eleccion 2");
            radioButtonDos.setName("radioButton");
            radioButtonDos.setActionCommand("radioButton");
            radioButtonDos.setBounds(50, 80, 200, 30);
            radioButtonDos.setSelected(false);
        }
        return radioButtonDos;
    }

    public JRadioButton getRadioButtonTres()
    {
        if (radioButtonTres == null)
        {
            radioButtonTres = new JRadioButton("Eleccion 3");
            radioButtonTres.setName("radioButton");
            radioButtonTres.setActionCommand("radioButton");
            radioButtonTres.setBounds(50, 110, 200, 30);
            radioButtonTres.setSelected(false);
        }
        return radioButtonTres;
    }

    public JTable getTablaInsumos()
    {
        if (tablaInsumos == null)
        {
            String[] columnNames =
            {
                "Código", "Nombre", "Descripción"
            };
            DefaultTableModel tablaModel = new DefaultTableModel();
            tablaModel.setColumnIdentifiers(columnNames);
            tablaInsumos = new JTable(tablaModel);
            tablaInsumos.getSelectionModel().addListSelectionListener(new ListSelectionListener()
            {
                @Override
                public void valueChanged(ListSelectionEvent e)
                {
                    int i = getTablaInsumos().getSelectedRow();
                    getCampoIdInsumo().setText(listaInsumos.get(i).get(0));
                    getCampoCodigoInsumo().setText(listaInsumos.get(i).get(1));
                    getCampoNombreInsumo().setText(listaInsumos.get(i).get(2));
                    getCampoDescripcionInsumo().setText(listaInsumos.get(i).get(3));
                    getCampoIdCategoriaInsumo().setText(listaInsumos.get(i).get(4));
                }
            });
        }
        return tablaInsumos;
    }

    public JScrollPane getTablaInsumosScroll()
    {
        if (tablaInsumosScroll == null)
        {
            tablaInsumosScroll = new JScrollPane(getTablaInsumos());
            tablaInsumosScroll.setLocation(0, 0);
            tablaInsumosScroll.setSize(400, 200);
            tablaInsumosScroll.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }
        return tablaInsumosScroll;
    }

    public JTextField getCampoIdInsumo()
    {
        if (campoIdInsumo == null)
        {
            campoIdInsumo = new JTextField();
            campoIdInsumo.setBounds(500, 0, 200, 30);
        }
        return campoIdInsumo;
    }

    public JTextField getCampoCodigoInsumo()
    {
        if (campoCodigoInsumo == null)
        {
            campoCodigoInsumo = new JTextField();
            campoCodigoInsumo.setBounds(710, 0, 200, 30);
        }
        return campoCodigoInsumo;
    }

    public JTextField getCampoNombreInsumo()
    {
        if (campoNombreInsumo == null)
        {
            campoNombreInsumo = new JTextField();
            campoNombreInsumo.setBounds(500, 40, 200, 30);
        }
        return campoNombreInsumo;
    }

    public JTextField getCampoDescripcionInsumo()
    {
        if (campoDescripcionInsumo == null)
        {
            campoDescripcionInsumo = new JTextField();
            campoDescripcionInsumo.setBounds(710, 40, 200, 30);
        }
        return campoDescripcionInsumo;
    }

    public JTextField getCampoIdCategoriaInsumo()
    {
        if (campoIdCategoriaInsumo == null)
        {
            campoIdCategoriaInsumo = new JTextField();
            campoIdCategoriaInsumo.setBounds(500, 80, 200, 30);
        }
        return campoIdCategoriaInsumo;
    }

    public void setDataTablaInsumos(List<List<String>> tablaInsumos)
    {
        listaInsumos = tablaInsumos;
        
        DefaultTableModel model = (DefaultTableModel)getTablaInsumos().getModel();
        
        for(List<String> fila: listaInsumos)
        {
            String[] row = {fila.get(1), fila.get(2), fila.get(3)};
            model.addRow(row);
        }
    }

    public List<List<String>> getListaInsumos()
    {
        return listaInsumos;
    }
    
    

}
