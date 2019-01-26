package cl.martinez.modulo6.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import cl.martinez.modulo6.mvc.model.ModeloLogin;
import cl.martinez.modulo6.mvc.ventana.Login;

public class ControladorLogin extends ControladorAbstracto implements ActionListener
{
	public ControladorLogin()
	{
		this.ventana = new Login();
		this.modelo = new ModeloLogin();
		
		((Login) this.ventana).getIngresar().addActionListener(this);
		JComboBox<String> combo = ((Login) this.ventana).getUsername();
		List<String> usuarios = ((ModeloLogin) this.modelo).obtenerUsuarios();
		
		for(String usuario: usuarios)
		{
			combo.addItem(usuario);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String username = (String)((Login) this.ventana).getUsername().getSelectedItem();
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
			JOptionPane.showMessageDialog(null, "Login válido", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
