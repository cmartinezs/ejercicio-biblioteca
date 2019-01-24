/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.controlador.impl;

import cl.cmartinez.colegio.controlador.Controlador;
import cl.cmartinez.colegio.modelo.impl.ModeloLogin;
import cl.cmartinez.colegio.vista.impl.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class ControladorLogin extends Controlador<Login, ModeloLogin> implements ActionListener, KeyListener
{
    public ControladorLogin()
    {
        super(new Login(), new ModeloLogin());
    }
    
    @Override
    public void iniciar()
    {
        getVentana().getCajaTextoUsername().addKeyListener(this);
        getVentana().getCajaTextoPassword().addKeyListener(this);
        getVentana().getBotonIngresar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String comando = e.getActionCommand();
        System.out.println("Comando: " + comando);
        switch(comando)
        {
            case "botonIngresar": validarLogin(); break;
            default: break;
        }
    }

    private void validarLogin() 
    {
        String username = getVentana().getCajaTextoUsername().getText();
        char[] password = getVentana().getCajaTextoPassword().getPassword();
        
        ModeloLogin modeloLogin = getModelo();
        modeloLogin.obtenerUsuario(username);
        
        if(valoresVacios(username, String.valueOf(password)))
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar un usuario y contraseña válido", "Error de Login", JOptionPane.ERROR_MESSAGE);
        }
        else if(modeloLogin.getUsername() == null)
        {
            JOptionPane.showMessageDialog(null, "El usuario ingresado no existe", "Error de Login", JOptionPane.ERROR_MESSAGE);
        }
        else if (!username.equals(modeloLogin.getUsername()) || !String.valueOf(password).equals(modeloLogin.getPassword()))
        {
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña no coinciden", "Error de Login", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        	getVentana().setLogueado(true);
        	getVentana().setVisible(false);
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e)
    {
        String username = getVentana().getCajaTextoUsername().getText();
        char[] password = getVentana().getCajaTextoPassword().getPassword();
        
        getVentana().getBotonIngresar().setEnabled(!valoresVacios(username, String.valueOf(password)));

    }

    private boolean valoresVacios(String username, String password) 
    {
    	boolean usuarioVacio = username == null || username.trim().isEmpty();
        boolean passwordVacia = password == null || password.trim().isEmpty();
        
    	return usuarioVacio || passwordVacia || password.trim().length() <= 3 || username.trim().length() <= 3;
	}

	@Override
    public void keyPressed(KeyEvent e)
    {
        //Nada
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        //Nada
    }
}
