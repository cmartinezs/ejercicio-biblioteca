/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio;

import cl.cmartinez.colegio.controlador.impl.ControladorVentanaPrincipal;
import cl.cmartinez.colegio.controlador.ControladorPrincipal;
import cl.cmartinez.colegio.controlador.impl.ControladorLogin;
import cl.cmartinez.colegio.modelo.impl.ModeloLogin;
import cl.cmartinez.colegio.modelo.impl.ModeloVentanaPrincipal;
import cl.cmartinez.colegio.vista.impl.Login;
import cl.cmartinez.colegio.vista.impl.VentanaPrincipal;

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
        cp.agregarControlador("login", new ControladorLogin(new Login(), new ModeloLogin(null, null)));
        cp.agregarControlador("principal", new ControladorVentanaPrincipal(new VentanaPrincipal(), new ModeloVentanaPrincipal()));
        cp.iniciarControlador("login");
        cp.mostrarVentana("login");
        cp.mostrarVentana("principal");
    }
}
