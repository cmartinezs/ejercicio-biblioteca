/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.modulo6;

import java.awt.BorderLayout;
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
public class Ventana4 extends JFrame 
{
    public Ventana4()
    {
        super("Titulo de ventana");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);

        JButton boton = new JButton("Primer botón");
        boton.setBounds(50, 50, 150, 30);
        boton.addActionListener(
            new ActionListener()
            {
               @Override
                public void actionPerformed(ActionEvent e) 
                {
                    System.out.println("Click en el Primer Boton");
                }
            }
        );
        cp.add(boton);
        
        JButton boton2 = new JButton("Segundo botón");
        boton2.setBounds(50, 90, 150, 30);
        boton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("Click en el Segundo Boton");
            }
        });
        cp.add(boton2);
    } 
}
