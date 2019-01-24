package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaPokedex;


public final class ControladorPokedex extends controlador implements ActionListener
{
    
    VentanaPokedex vPokedex;
    ControladorPrincipal cPrincipal;
    
    public ControladorPokedex()
    { 
        vPokedex = new VentanaPokedex();
        setListener();
    }
    
    void setListener()
    {
        for (int i = 0; i < 151; i++) 
        {
            vPokedex.listaBotones.get(i).addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       String pokemon = e.getActionCommand();
        System.out.println(pokemon);
    }

    @Override
    public void Notificar() 
    {
        
    }
    
    public void SetcPrincipal(ControladorPrincipal cPrincipal)
        {
            this.cPrincipal = cPrincipal;
        }
    
    
}
