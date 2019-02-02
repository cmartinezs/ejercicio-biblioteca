package cl.cmartinez.modulo6.mvc.ventana;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;

public class Login extends VentanaAbstracta 
{
	private JComboBox<String> username;
	private JPasswordField password;
	private JButton ingresar;
	
	
	public Login()
	{
		super("LOGIN");
		setSize(300, 162);
		setLocationRelativeTo(null);
		Container cp = getContentPane();
		cp.setLayout(null);
		cp.add(getUsername()); //usuario
		cp.add(getPassword()); //pass
		cp.add(getIngresar()); //ingresar
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(FUENTE_COMUN_BOLD);
		lblUsuario.setBounds(10, 17, 70, 14);
		getContentPane().add(lblUsuario);
		
		JLabel label = new JLabel("Password");
		label.setFont(FUENTE_COMUN_BOLD);
		label.setBounds(10, 52, 70, 14);
		getContentPane().add(label);
	}

	public JComboBox<String> getUsername() 
	{
		if(username == null)
		{
			username = new JComboBox<String>();
			username.setSize(184, 30);
			username.setLocation(90, 11);
			username.setName("username");
			username.setFont(FUENTE_COMUN);
		}
		return username;
	}

	public JPasswordField getPassword() 
	{
		if(password == null)
		{
			password = new JPasswordField();
			password.setSize(184, 30);
			password.setLocation(90, 44);
			password.setName("password");
			password.setFont(FUENTE_COMUN);
		}
		return password;
	}

	public JButton getIngresar()
	{
		if(ingresar == null)
		{
			ingresar = new JButton("Ingresar");
			ingresar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			ingresar.setSize(184, 30);
			ingresar.setLocation(90, 85);
			ingresar.setName("ingresar");
		}
		return ingresar;
	}
}
