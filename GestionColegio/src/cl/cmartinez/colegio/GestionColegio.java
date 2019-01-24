/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio;

import cl.cmartinez.colegio.controlador.impl.ControladorLogin;
import cl.cmartinez.colegio.controlador.impl.ControladorVentanaPrincipal;

/**
 *
 * @author carlo
 */
public class GestionColegio
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ControladorPrincipal cp = new ControladorPrincipal();
        cp.agregarControlador("login", new ControladorLogin());
        cp.agregarControlador("principal", new ControladorVentanaPrincipal());
        cp.iniciarControlador("login");
        cp.mostrarVentana("login");
    }
}
