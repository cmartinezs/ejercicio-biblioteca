/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.modulo6;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author carlo
 */
public class MiVentana3 extends JFrame 
{
    public MiVentana3()
    {
        super("Titulo de ventana");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        BorderLayout bl = new BorderLayout();
        bl.setHgap(5);
        bl.setVgap(5);
        cp.setLayout(bl);

        cp.add(new JButton("Center"), BorderLayout.CENTER);
        cp.add(new JButton("North"), BorderLayout.NORTH);
        cp.add(new JButton("South"), BorderLayout.SOUTH);
        cp.add(new JButton("East"), BorderLayout.EAST);
        cp.add(new JButton("West"), BorderLayout.WEST);
    } 
    
}
