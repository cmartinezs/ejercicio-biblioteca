/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio;

import cl.cmartinez.colegio.controlador.impl.ControladorLogin;
import cl.cmartinez.colegio.controlador.impl.ControladorVentanaPrincipal;
import cl.cmartinez.colegio.modelo.impl.ModeloLogin;
import cl.cmartinez.colegio.modelo.impl.ModeloVentanaPrincipal;
import cl.cmartinez.colegio.vista.impl.Login;
import cl.cmartinez.colegio.vista.impl.VentanaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class GestionColegioSimple
{
    public static void main(String[] args)
    {
        ControladorLogin cl = new ControladorLogin(new Login(), new ModeloLogin(null, null));
        cl.iniciarControlador();
        cl.getLogin().setVisible(true);
        
        while(cl.getLogin().isVisible())
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
        
        ControladorVentanaPrincipal cvp = new ControladorVentanaPrincipal(new VentanaPrincipal(), new ModeloVentanaPrincipal());
        cvp.iniciarControlador();
        cvp.getVentanaPrincipal().setVisible(true);
    }
}
