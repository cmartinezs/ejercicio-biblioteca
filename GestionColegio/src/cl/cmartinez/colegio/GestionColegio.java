/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio;

import cl.cmartinez.colegio.vista.Login;
import cl.cmartinez.colegio.vista.VentanaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Login login = new Login();
        login.setVisible(true);
        
        //Esperamos mientras aun no esté logueado
        while(!login.isLogueado())
        {
            try 
            {
                //"Dormimos" la ejecucion del programa principal por 1000 milisegundos
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex) 
            {    
                Logger.getLogger(GestionColegio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Cuando está loguado ocultamos la ventana de login y mostramos la ventana principal
        login.setVisible(false);
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
    }
}
