/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.vista.impl;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import cl.cmartinez.colegio.vista.Ventana;

/**
 *
 * @author carlo
 */
public final class Login extends Ventana
{
    private JTextField cajaTextoUsername;
    private JPasswordField cajaTextoPassword;
    private JButton botonIngresar;
    private JLabel etiquetaUsername;
    private JLabel etiquetaPassword;
    private JLabel lblImagen;
    private JLabel lblImagenG;
    
    private final int ANCHO_COMPONENTES = 60;
    private final int ALTO_COMPONENTES = 25;
    
    private final int SEPARACION_HORIZONTAL = 30;
    private final int SEPARACION_VERTICAL = 10;
    
    private final int ANCHO_JFRAME = 350;
    private final int ALTO_JFRAME = 165;
    
    private boolean logueado = false;
    
    public Login ()
    {
        super("Login");
        setSize(350, 214);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);
        cp.add(getEtiquetaUsername());
        cp.add(getEtiquetaPassword());
        cp.add(getCajaTextoUsername());
        cp.add(getCajaTextoPassword());
        cp.add(getBotonIngresar());
        cp.add(getIconoUsuario());
        cp.add(getIconoUsuarioG());
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

	public JLabel getIconoUsuario() 
	{
		if(lblImagen == null)
		{
			String imagen = "resources/imagenes/user_silhouette.png"; 
			lblImagen = new JLabel("");
	        lblImagen.setIcon(new ImageIcon(imagen));
	        lblImagen.setBounds(120, 11, 32, 44);
		}
        return lblImagen;
	}
	
	public JLabel getIconoUsuarioG() 
	{
		if(lblImagenG == null)
		{
			String imagen = "resources/imagenes/user_green.png"; 
			lblImagenG = new JLabel("");
			lblImagenG.setIcon(new ImageIcon(imagen));
			lblImagenG.setBounds(120, 11, 32, 44);
			lblImagenG.setVisible(false);
		}
        return lblImagenG;
	}

    public JLabel getEtiquetaUsername() 
    {
        if(etiquetaUsername == null)
        {
            etiquetaUsername = new JLabel("Usuario");
            etiquetaUsername.setBounds(
                    29
                    , 66
                    , ANCHO_COMPONENTES
                    , ALTO_COMPONENTES
            );
        }
        return etiquetaUsername;
    }

    public JLabel getEtiquetaPassword() 
    {
        if(etiquetaPassword == null)
        {
            etiquetaPassword = new JLabel("Password");
            etiquetaPassword.setBounds(
                    29
                    , 101
                    , ANCHO_COMPONENTES
                    , ALTO_COMPONENTES);
        }
        return etiquetaPassword;
    }
    
    public JTextField getCajaTextoUsername() 
    {
        if(cajaTextoUsername == null)
        {
            cajaTextoUsername = new JTextField();
            cajaTextoUsername.setName("cajaTextoUsername");
            cajaTextoUsername.setActionCommand("cajaTextoUsername");
            cajaTextoUsername.setBounds(
                    119
                    , 66
                    , ANCHO_COMPONENTES * 3
                    , ALTO_COMPONENTES);
        }
        return cajaTextoUsername;
    }

    public JPasswordField getCajaTextoPassword() 
    {
        if(cajaTextoPassword == null)
        {
            cajaTextoPassword = new JPasswordField();
            cajaTextoPassword.setName("cajaTextoPassword");
            cajaTextoPassword.setActionCommand("cajaTextoPassword");
            cajaTextoPassword.setBounds(
                    119
                    , 101
                    , ANCHO_COMPONENTES * 3
                    , ALTO_COMPONENTES
            );
        }
        return cajaTextoPassword;
    }

    public JButton getBotonIngresar() 
    {
        if(botonIngresar == null)
        {
            botonIngresar = new JButton();
            try
            {
                botonIngresar.setIcon(new ImageIcon("resources/imagenes/bullet_arrow_right.png"));
            }
            catch (Exception ex)
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            botonIngresar.setName("botonIngresar");
            botonIngresar.setActionCommand("botonIngresar");
            botonIngresar.setText("Ingresar");
            botonIngresar.setEnabled(false);
            botonIngresar.setBounds(
                    119
                    , 136
                    , ANCHO_COMPONENTES * 3
                    , ALTO_COMPONENTES);
        }
        return botonIngresar;
    }

    public boolean isLogueado() 
    {
        return logueado;
    }

    public void setLogueado(boolean logueado)
    {
        this.logueado = logueado;
    }

	@Override
	public void agregarKeyListener(KeyListener listener) 
	{
		getCajaTextoUsername().addKeyListener(listener);
        getCajaTextoPassword().addKeyListener(listener);
	}

	@Override
	public void agregarActionListener(ActionListener listener) 
	{
		getBotonIngresar().addActionListener(listener);
	}

	@Override
	public void agregarItemListener(ItemListener listener) { }

	public void getCambiarIconoUsuario(boolean b) 
	{
		getIconoUsuario().setVisible(!b);
		getIconoUsuarioG().setVisible(b);
	}
}
