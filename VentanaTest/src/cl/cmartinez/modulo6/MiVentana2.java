/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.modulo6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author carlo
 */
public class MiVentana2 extends JFrame 
{
    public MiVentana2()
    {
        super("Titulo de ventana");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        GridLayout gl = new GridLayout(4, 3);
        gl.setHgap(5);
        gl.setVgap(5);
        cp.setLayout(gl);
        
        for(int i = 1; i < 10; i++)
        {
            cp.add(new JButton(String.valueOf(i)));
        }
        
        cp.add(new JButton("*"));
        cp.add(new JButton("0"));
        cp.add(new JButton("#"));
    }   
}
