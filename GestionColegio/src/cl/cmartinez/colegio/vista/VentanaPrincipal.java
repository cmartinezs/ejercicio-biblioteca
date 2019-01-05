/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.vista;

import java.awt.Container;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author carlo
 */
public class VentanaPrincipal extends JFrame
{
    public VentanaPrincipal ()
    {
        super("Sistema de Gestión de Colegios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Container cp = getContentPane();
        cp.setLayout(null);
        JLabel label = new JLabel("Bienvenido!");
        label.setBounds(30, 30, 200, 30);
        cp.add(label);
    }
}
