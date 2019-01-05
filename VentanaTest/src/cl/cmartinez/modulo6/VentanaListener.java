/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.modulo6;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author carlo
 */
public class VentanaListener extends JFrame implements ActionListener
{
    private JButton boton = new JButton("Primer botón sin clicks");
    private JButton boton2 = new JButton("Segundo botón sin clicks");
    private JButton reset = new JButton("Habilitar botones");
    
    private int clickBoton1 = 0;
    private int clickBoton2 = 0;
    
    public VentanaListener()
    {
        super("VentanaListener");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);
        
        boton.setBounds(50, 50, 250, 30);
        boton.setActionCommand("boton1");
        boton.setName("boton1");
        boton.addActionListener(this);
        cp.add(boton);
        
        boton2.setBounds(50, 90, 250, 30);
        boton2.setActionCommand("boton2");
        boton2.setName("boton2");
        boton2.addActionListener(this);
        cp.add(boton2);
        
        reset.setBounds(50, 130, 250, 30);
        reset.setActionCommand("reset");
        reset.setName("reset");
        reset.addActionListener(this);
        cp.add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String comando = e.getActionCommand();
        
        if(comando.equals("boton1"))
        {
            clickBoton1++;
            if(clickBoton1 <= 10)
            {
                boton.setText("Primer botón: tiene " + clickBoton1 + " clicks");
                System.out.println("Click en el Primer Boton");
            }
            else
            {
                boton.setText("Límite de clicks");
                boton.setEnabled(false);
                System.out.println("Límite de clicks");
            }
        }
        else if (comando.equals("boton2"))
        {
            clickBoton2++;
            if(clickBoton2 <= 10)
            {
                boton2.setText("Segundo botón: tiene " + clickBoton2 + " clicks");
                System.out.println("Click en el Segundo Boton");
            }
            else
            {
                boton2.setText("Límite de clicks");
                boton2.setEnabled(false);
                System.out.println("Límite de clicks");
            }
        }
        else if(comando.equals("reset"))
        {
            boton.setEnabled(true);
            clickBoton1 = 0;
            boton.setText("Primer Botón sin clicks");

            boton2.setEnabled(true);
            clickBoton2 = 0;
            boton2.setText("Segundo Botón sin clicks");
        }
    }
}
