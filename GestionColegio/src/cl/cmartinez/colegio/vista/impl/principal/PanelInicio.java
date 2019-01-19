package cl.cmartinez.colegio.vista.impl.principal;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import cl.cmartinez.colegio.vista.panels.BackgroundPanel;

public class PanelInicio extends BackgroundPanel
{
	public PanelInicio() 
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
	}

}
