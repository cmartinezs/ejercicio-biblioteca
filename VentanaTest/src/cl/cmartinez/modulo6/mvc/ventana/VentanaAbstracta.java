package cl.cmartinez.modulo6.mvc.ventana;

import java.awt.Font;

import javax.swing.JFrame;

public abstract class VentanaAbstracta extends JFrame
{
	protected final Font FUENTE_COMUN_BOLD = new Font("Tahoma", Font.BOLD, 14);
	protected final Font FUENTE_COMUN = new Font("Tahoma", Font.PLAIN, 14);
	
	public VentanaAbstracta(String nombreVentana)
	{
		super(nombreVentana);
	}
}
