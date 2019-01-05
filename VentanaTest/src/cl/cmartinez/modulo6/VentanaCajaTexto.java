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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author carlo
 */
public class VentanaCajaTexto extends JFrame implements ActionListener
{
    private JTextField cajaTexto = new JTextField();
    private JButton botonMensaje = new JButton("Saludo");
    private JLabel etiqueta = new JLabel();
    private JLabel etiquetaCajaTexto = new JLabel();
    
    public VentanaCajaTexto()
    {
        super("VentanaListener");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);
        
        etiquetaCajaTexto.setBounds(50, 50, 130, 30);
        etiquetaCajaTexto.setName("cajaTexto");
        etiquetaCajaTexto.setText("Indique su nombre");
        cp.add(etiquetaCajaTexto);
        
        cajaTexto.setBounds(190, 50, 250, 30);
        cajaTexto.setActionCommand("cajaTexto");
        cajaTexto.setName("cajaTexto");
        cp.add(cajaTexto);
        
        botonMensaje.setBounds(50, 90, 250, 30);
        botonMensaje.setActionCommand("botonMensaje");
        botonMensaje.setName("botonMensaje");
        botonMensaje.addActionListener(this);
        cp.add(botonMensaje);
        
        etiqueta.setBounds(50, 130, 250, 30);
        etiqueta.setName("botonMensaje");
        cp.add(etiqueta);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String comando = e.getActionCommand();
        
        if(comando.equals("botonMensaje"))
        {
            String texto = cajaTexto.getText();
            String saludo = "Hola " + texto + "!";
            etiqueta.setText(saludo);
            JOptionPane.showMessageDialog(null, saludo);
        }
    }
}
