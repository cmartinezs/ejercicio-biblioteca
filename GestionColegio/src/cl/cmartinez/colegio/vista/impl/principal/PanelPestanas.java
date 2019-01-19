package cl.cmartinez.colegio.vista.impl.principal;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PanelPestanas extends JPanel 
{
    private JTabbedPane panelDePestanas;
    private PanelInicio panelInicio;
    private PanelSegundo panelSegundo;
    private PanelTercero panelTercero;
    private PanelCuarto panelCuarto;
    
    private static final Font FUENTE_PESTANA = new Font("Verdana", Font.BOLD, 12);
    
	public PanelPestanas() 
	{
		setLayout(new GridLayout(0, 1, 0, 0));
		add(getPanelDePestanas());
	}
	
	public JTabbedPane getPanelDePestanas()
    {
        if (panelDePestanas == null)
        {
            panelDePestanas = new JTabbedPane();
            panelDePestanas.setName("panelDePestanas");
            panelDePestanas.setFont(FUENTE_PESTANA);
            panelDePestanas.addTab("Inicio", new ImageIcon("resources/imagenes/home_page.png"), getPanelInicio(), "Inicio");
            panelDePestanas.addTab("Segundo", new ImageIcon("resources/imagenes/user_green.png"), getPanelSegundo(), "Segundo");
            panelDePestanas.addTab("Tercero", new ImageIcon("resources/imagenes/user_silhouette.png"), getPanelTercero(), "Tercero");
            panelDePestanas.addTab("Tabla Scroll", new ImageIcon("resources/imagenes/user_silhouette.png"), getPanelCuarto(), "Tabla Scroll");
        }
        return panelDePestanas;
    }
	
	public PanelInicio getPanelInicio()
    {
        if (panelInicio == null)
        {
           panelInicio = new PanelInicio();
        }
        return panelInicio;
    }
	
	public PanelSegundo getPanelSegundo()
    {
        if (panelSegundo == null)
        {
            panelSegundo = new PanelSegundo();
        }
        return panelSegundo;
    }
	
	public PanelTercero getPanelTercero()
    {
        if (panelTercero == null)
        {
        	panelTercero = new PanelTercero();
        }
        return panelTercero;
    }
	
	public PanelCuarto getPanelCuarto()
    {
        if (panelCuarto == null)
        {
        	panelCuarto = new PanelCuarto();
        }
        return panelCuarto;
    }
}
