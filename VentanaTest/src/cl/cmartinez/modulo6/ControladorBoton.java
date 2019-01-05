/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.modulo6;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author carlo
 */
public class ControladorBoton implements ActionListener
{
    private int clickBoton1 = 0;
    private int clickBoton2 = 0;
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String comando = e.getActionCommand();
        
        if(comando.equals("boton1"))
        {
            JButton source = (JButton) e.getSource();
            clickBoton1++;
            if(clickBoton1 <= 10)
            {
                source.setText("Primer botón: tiene " + clickBoton1 + " clicks");
                System.out.println("Click en el Primer Boton");
            }
            else
            {
                source.setText("Límite de clicks");
                source.setEnabled(false);
                System.out.println("Límite de clicks");
            }
        }
        else if (comando.equals("boton2"))
        {
            JButton source = (JButton) e.getSource();
            clickBoton2++;
            if(clickBoton2 <= 10)
            {
                source.setText("Segundo botón: tiene " + clickBoton2 + " clicks");
                System.out.println("Click en el Segundo Boton");
            }
            else
            {
                source.setText("Límite de clicks");
                source.setEnabled(false);
                System.out.println("Límite de clicks");
            }
        }
        else if(comando.equals("reset"))
        {
            JButton reset = (JButton) e.getSource();
            Component[] componentes = reset.getParent().getComponents();
            for(Component componente: componentes)
            {
                if(componente.getName().equals("boton1"))
                {
                    componente.setEnabled(true);
                    clickBoton1 = 0;
                    ((JButton)componente).setText("Primer Botón sin clicks");
                }
                else if(componente.getName().equals("boton2"))
                {
                    componente.setEnabled(true);
                    clickBoton2 = 0;
                    ((JButton)componente).setText("Segundo Botón sin clicks");
                }
            }
        }
    }
}
