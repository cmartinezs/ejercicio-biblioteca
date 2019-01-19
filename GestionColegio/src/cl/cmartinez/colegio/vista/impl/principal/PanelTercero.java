package cl.cmartinez.colegio.vista.impl.principal;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import cl.cmartinez.colegio.vista.panels.BackgroundPanel;

public class PanelTercero extends BackgroundPanel
{
	private ButtonGroup grupoRadioButtons;
    private JRadioButton radioButtonUno;
    private JRadioButton radioButtonDos;
    private JRadioButton radioButtonTres;
    private JButton botonMostrarSeleccionRadioButtons;
	
	public PanelTercero() 
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
		
        add(getRadioButtonUno());
        add(getRadioButtonDos());
        add(getRadioButtonTres());
        add(getBotonMostrarSeleccionRadioButtons());
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
}
