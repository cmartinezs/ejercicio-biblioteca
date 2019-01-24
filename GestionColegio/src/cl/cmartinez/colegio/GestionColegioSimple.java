/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio;

import java.util.logging.Level;
import java.util.logging.Logger;

import cl.cmartinez.colegio.controlador.impl.ControladorLogin;
import cl.cmartinez.colegio.controlador.impl.ControladorVentanaPrincipal;
import cl.cmartinez.colegio.modelo.impl.ModeloVentanaPrincipal;
import cl.cmartinez.colegio.vista.impl.VentanaPrincipal;

/**
 *
 * @author carlo
 */
public class GestionColegioSimple
{
    public static void main(String[] args)
    {
        ControladorLogin cl = new ControladorLogin();
        cl.iniciarControlador();
        cl.getVentana().setVisible(true);
        
        while(cl.getVentana().isVisible())
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(GestionColegioSimple.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        ControladorVentanaPrincipal cvp = new ControladorVentanaPrincipal();
        cvp.iniciarControlador();
        cvp.getVentana().setVisible(true);
    }
}
