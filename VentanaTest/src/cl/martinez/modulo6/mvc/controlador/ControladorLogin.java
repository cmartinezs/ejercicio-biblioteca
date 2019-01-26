package cl.martinez.modulo6.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import cl.martinez.modulo6.mvc.model.ModeloLogin;
import cl.martinez.modulo6.mvc.ventana.Login;

public class ControladorLogin extends ControladorAbstracto implements ActionListener
{
	public ControladorLogin()
	{
		this.ventana = new Login();
		this.modelo = new ModeloLogin();
		
		((Login) this.ventana).getIngresar().addActionListener(this);;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String username = ((Login) this.ventana).getUsername().getText();
		String password = String.valueOf(((Login) this.ventana).getPassword().getPassword());
		
		String pwd = ((ModeloLogin) this.modelo).buscarUsuario(username);
		
		if(pwd == null)
		{
			JOptionPane.showMessageDialog(null, "Usuario no existe", "Error de login", JOptionPane.ERROR_MESSAGE);
		}
		else if (!pwd.equals(password))
		{
			JOptionPane.showMessageDialog(null, "Password inválida", "Error de login", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Login válido", "Exito", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
