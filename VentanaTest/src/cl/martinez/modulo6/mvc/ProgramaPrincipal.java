package cl.martinez.modulo6.mvc;

import cl.martinez.modulo6.mvc.controlador.ControladorLogin;

public class ProgramaPrincipal 
{
	public static void main(String[] args) 
	{
		ControladorLogin cl = new ControladorLogin();
		cl.getVentana().setVisible(true);
	}
}
