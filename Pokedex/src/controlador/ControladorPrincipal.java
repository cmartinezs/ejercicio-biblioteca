package controlador;

import javax.swing.JOptionPane;

import vista.VentanaLogin;
import vista.VentanaPokedex;
import modelo.BDD;

public final class ControladorPrincipal 
{
	BDD data;
        ControladorLogin cLogin;
        ControladorPokedex cPokedex;
        VentanaLogin vLogin;
        VentanaPokedex vPokedex;
        
        public void IniciarComponentes()
        {
            cLogin = new ControladorLogin();
            cPokedex = new ControladorPokedex();
            cLogin.SetcPrincipal(this);
            cPokedex.SetcPrincipal(this);
            vLogin = cLogin.vLogin;
            vPokedex = cPokedex.vPokedex;
            data = new BDD();
        }
	
	public void ValidarLogin()
	{
            char[] password = cLogin.boxPassword;
            String username = cLogin.boxUsername;
		
            if(username == null || username.trim().isEmpty()
            || password == null || password.length <= 3 || username.trim().length() <= 3)
            {
            JOptionPane.showMessageDialog(null, "Debe ingresar un usuario y contraseña valido", "Error de Login", JOptionPane.ERROR_MESSAGE);
            }
            else if(data.getUsername() == null)
            {
            JOptionPane.showMessageDialog(null, "El usuario ingresado no existe", "Error de Login", JOptionPane.ERROR_MESSAGE);
            }
            else if (!username.equals(data.getUsername()) || !String.valueOf(password).equals(data.getClave()))
            {
            JOptionPane.showMessageDialog(null, "Usuario y/o contrase�a no coinciden", "Error de Login", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
        	vLogin.setVisible(false);
                vPokedex.setVisible(true);
            }
        }
}

