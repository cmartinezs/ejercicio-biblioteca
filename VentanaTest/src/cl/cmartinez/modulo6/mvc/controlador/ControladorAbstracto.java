package cl.cmartinez.modulo6.mvc.controlador;

import cl.cmartinez.modulo6.mvc.model.ModeloAbstracto;
import cl.cmartinez.modulo6.mvc.ventana.VentanaAbstracta;

public abstract class ControladorAbstracto 
{
	protected VentanaAbstracta ventana;
	protected ModeloAbstracto modelo;
	
	public VentanaAbstracta getVentana() {
		return ventana;
	}
	public ModeloAbstracto getModelo() {
		return modelo;
	}
	
	
}
