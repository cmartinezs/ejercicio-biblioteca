/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.vista;

import cl.cmartinez.colegio.vista.panels.BackgroundPanel;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author carlo
 */
public class VentanaPrincipal extends JFrame
{
    public VentanaPrincipal () throws IOException
    {
        super("Sistema de Gestión de Colegios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Image bgImagen = ImageIO.read(new File("resources/imagenes/bg/wp2224998.jpg"));
        BackgroundPanel bgPanel = new BackgroundPanel(bgImagen, BackgroundPanel.SCALED);
        
        Container cp = getContentPane();
        
        cp.setLayout(new FlowLayout());
        cp.add(bgPanel);
        JLabel label = new JLabel("Bienvenido!");
        label.setBounds(30, 30, 200, 30);
        bgPanel.add(label);
    }
}
