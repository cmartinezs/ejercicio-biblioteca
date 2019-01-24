/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.controlador;

import cl.cmartinez.colegio.modelo.Modelo;
import cl.cmartinez.colegio.vista.Ventana;

/**
 * 
 * @author carlo
 *
 * @param <V> una ventana
 * @param <M> un modelo
 */
public abstract class Controlador<V extends Ventana, M extends Modelo>
{
    private final V ventana;
    private final M modelo;
    
    private boolean iniciado;
    
    public Controlador (V ventana, M modelo)
    {
        this.ventana = ventana;
        this.modelo = modelo;
        iniciado = false;
    }

    public V getVentana()
    {
        return ventana;
    }

    public M getModelo()
    {
        return modelo;
    }
    
    public void iniciarControlador()
    {
    	iniciar();
    	iniciado = true;
    }
    
    protected abstract void iniciar();

	public boolean isIniciado() {
		return iniciado;
	}
}
