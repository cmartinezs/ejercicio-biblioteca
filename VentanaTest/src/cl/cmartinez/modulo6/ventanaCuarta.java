package cl.cmartinez.modulo6;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.GREEN;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ventanaCuarta extends JFrame {

    public JPanel panel;

    public ventanaCuarta() 
    {
        super("Cuarta Compañia");
        
        try
        {
            setSize(500, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            Container contenedor = getContentPane();
            
            JButton boton = new JButton("bodega");
            JButton boton2 = new JButton("Bomberos");
            boton.setBounds(25, 400, 150, 30);
            boton2.setBounds(300, 400, 150, 30);
            
            Image bgImagen = ImageIO.read(new File("resources/cuartalogo.jpg"));
            panel = new BackgroundPanel(bgImagen, BackgroundPanel.SCALED);
            panel.setLayout(new FlowLayout());
            panel.add(boton);
            panel.add(boton2);
            contenedor.add(panel);
            
            
        }
        catch (IOException ex)
        {
            Logger.getLogger(ventanaCuarta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
