package cl.cmartinez.colegio.vista.impl.principal;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import cl.cmartinez.colegio.vista.panels.BackgroundPanel;

public class PanelSegundo extends BackgroundPanel
{

    private JTextField campoTextoNombreCategoria;
    private JTextField campoTextoDescripcionCategoria;
    private JButton botonIngresarCategoria;
    private JComboBox<String> comboCategoria;
    
	public PanelSegundo() 
	{
		setLayout(null);
		
		try 
		{
			setImage(ImageIO.read(new File("resources/imagenes/bg/wp2224998.jpg")));
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        add(getCampoTextoNombreCategoria());
        add(getCampoTextoDescripcionCategoria());
        add(getBotonIngresarCategoria());
        add(getComboCategoria());
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
    
    public JComboBox<String> getComboCategoria()
    {
        if (comboCategoria == null)
        {
            comboCategoria = new JComboBox();
            comboCategoria.setBounds(300, 80, 200, 30);
        }
        return comboCategoria;
    }
}
