/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.vista;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author carlo
 */
public final class Login extends JFrame implements ActionListener, KeyListener
{
    private JTextField cajaTextoUsername;
    private JPasswordField cajaTextoPassword;
    private JButton botonIngresar;
    private JLabel etiquetaUsername;
    private JLabel etiquetaPassword;
    
    private final int ANCHO_COMPONENTES = 60;
    private final int ALTO_COMPONENTES = 25;
    
    private final int SEPARACION_HORIZONTAL = 30;
    private final int SEPARACION_VERTICAL = 10;
    
    private final int ANCHO_JFRAME = 350;
    private final int ALTO_JFRAME = 165;
    
    private final String USERNAME = "Carlos";
    private final String PASSWORD = "Carlos2019";
    
    private boolean logueado = false;
    
    public Login ()
    {
        super("Login");
        setSize(ANCHO_JFRAME, ALTO_JFRAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);
        cp.add(getEtiquetaUsername());
        cp.add(getEtiquetaPassword());
        cp.add(getCajaTextoUsername());
        cp.add(getCajaTextoPassword());
        cp.add(getBotonIngresar());
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    public JLabel getEtiquetaUsername() 
    {
        if(etiquetaUsername == null)
        {
            etiquetaUsername = new JLabel("Usuario");
            etiquetaUsername.setBounds(
                    SEPARACION_HORIZONTAL
                    , SEPARACION_VERTICAL
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
                    SEPARACION_HORIZONTAL
                    , ALTO_COMPONENTES + SEPARACION_VERTICAL*2
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
            cajaTextoUsername.addKeyListener(this);
            cajaTextoUsername.setBounds(
                    ANCHO_COMPONENTES + SEPARACION_HORIZONTAL*2
                    , SEPARACION_VERTICAL
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
            cajaTextoPassword.addKeyListener(this);
            cajaTextoPassword.setBounds(
                    ANCHO_COMPONENTES + SEPARACION_HORIZONTAL*2
                    , ALTO_COMPONENTES + SEPARACION_VERTICAL*2
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
            botonIngresar.setName("botonIngresar");
            botonIngresar.setActionCommand("botonIngresar");
            botonIngresar.setText("Ingresar");
            botonIngresar.setEnabled(false);
            botonIngresar.addActionListener(this);
            botonIngresar.setBounds(
                    ANCHO_COMPONENTES + SEPARACION_HORIZONTAL*2
                    , ALTO_COMPONENTES*2 + SEPARACION_VERTICAL*3
                    , ANCHO_COMPONENTES * 3
                    , ALTO_COMPONENTES);
        }
        return botonIngresar;
    }

    public boolean isLogueado() {
        return logueado;
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
        String username = getCajaTextoUsername().getText();
        char[] password = getCajaTextoPassword().getPassword();
        
        if(username == null || username.trim().isEmpty()
                || password == null || password.length == 0)
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar un usuario y contraseña válido", "Error de Login", JOptionPane.ERROR_MESSAGE);
        }
        else if (!username.equals(USERNAME) || !String.valueOf(password).equals(PASSWORD))
        {
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña no coinciden", "Error de Login", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            logueado = true;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        System.out.println("keyTyped: " + e.getKeyChar());
        String username = getCajaTextoUsername().getText();
        char[] password = getCajaTextoPassword().getPassword();
        
        System.out.println("username: " + username);
        System.out.println("password: " + String.valueOf(password));
        
        if(username != null && !username.trim().isEmpty()
                && password != null && password.length > 0)
        {
            botonIngresar.setEnabled(true);
        }
        else
        {
            botonIngresar.setEnabled(false);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        //Nada por ahora
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        //Nada por ahora
    }
}
