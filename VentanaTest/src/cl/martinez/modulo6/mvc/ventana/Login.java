package cl.martinez.modulo6.mvc.ventana;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends VentanaAbstracta 
{
	private JTextField username;
	private JPasswordField password;
	private JButton ingresar;
	
	public Login()
	{
		super("LOGIN");
		setSize(300, 180);
		setLocationRelativeTo(null);
		Container cp = getContentPane();
		cp.setLayout(null);
		cp.add(getUsername()); //usuario
		cp.add(getPassword()); //pass
		cp.add(getIngresar()); //ingresar
	}

	public JTextField getUsername() 
	{
		if(username == null)
		{
			username = new JTextField();
			username.setSize(100, 30);
			username.setLocation(20, 20);
			username.setName("username");
		}
		return username;
	}

	public JPasswordField getPassword() 
	{
		if(password == null)
		{
			password = new JPasswordField();
			password.setSize(100, 30);
			password.setLocation(20, 60);
			password.setName("password");
		}
		return password;
	}

	public JButton getIngresar()
	{
		if(ingresar == null)
		{
			ingresar = new JButton("Ingresar");
			ingresar.setSize(100, 30);
			ingresar.setLocation(20, 100);
			ingresar.setName("ingresar");
		}
		return ingresar;
	}
}
