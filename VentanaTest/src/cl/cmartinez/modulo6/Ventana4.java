/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.modulo6;

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
        
        ControladorBoton cb = new ControladorBoton();

        JButton boton = new JButton("Primer botón sin clicks");
        boton.setBounds(50, 50, 250, 30);
        boton.setActionCommand("boton1");
        boton.setName("boton1");
        boton.addActionListener(cb);
        cp.add(boton);
        
        JButton boton2 = new JButton("Segundo botón sin clicks");
        boton2.setBounds(50, 90, 250, 30);
        boton2.setActionCommand("boton2");
        boton2.setName("boton2");
        boton2.addActionListener(cb);
        cp.add(boton2);
        
        JButton reset = new JButton("Habilitar botones");
        reset.setBounds(50, 130, 250, 30);
        reset.setActionCommand("reset");
        reset.setName("reset");
        reset.addActionListener(cb);
        cp.add(reset);
    } 
}
