package cl.cmartinez.colegio.vista.impl.principal;

import java.awt.Color;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class PanelCuarto extends JPanel
{
    private JTable tablaInsumos;
    private JScrollPane tablaInsumosScroll;
    
    private JTextField campoIdInsumo;
    private JTextField campoCodigoInsumo;
    private JTextField campoNombreInsumo;
    private JTextField campoDescripcionInsumo;
    private JTextField campoIdCategoriaInsumo;
    private JButton botonGuardar;
    
    List<List<String>> listaInsumos;
	
	public PanelCuarto() 
	{
		setLayout(null);
		add(getTablaInsumosScroll());
		add(getCampoIdInsumo());
		add(getCampoCodigoInsumo());
		add(getCampoNombreInsumo());
		add(getCampoDescripcionInsumo());
		add(getCampoIdCategoriaInsumo());
		add(getBotonGuardar());
	}
	
	public JTable getTablaInsumos()
    {
        if (tablaInsumos == null)
        {
            String[] columnNames =
            {
                "Código", "Nombre", "Descripción"
            };
            DefaultTableModel tablaModel = new DefaultTableModel();
            tablaModel.setColumnIdentifiers(columnNames);
            tablaInsumos = new JTable(tablaModel);
            tablaInsumos.getSelectionModel().addListSelectionListener(new ListSelectionListener()
            {
                @Override
                public void valueChanged(ListSelectionEvent e)
                {
                    int i = getTablaInsumos().getSelectedRow();
                    getCampoIdInsumo().setText(listaInsumos.get(i).get(0));
                    getCampoCodigoInsumo().setText(listaInsumos.get(i).get(1));
                    getCampoNombreInsumo().setText(listaInsumos.get(i).get(2));
                    getCampoDescripcionInsumo().setText(listaInsumos.get(i).get(3));
                    getCampoIdCategoriaInsumo().setText(listaInsumos.get(i).get(4));
                }
            });
        }
        return tablaInsumos;
    }

    public JScrollPane getTablaInsumosScroll()
    {
        if (tablaInsumosScroll == null)
        {
            tablaInsumosScroll = new JScrollPane(getTablaInsumos());
            tablaInsumosScroll.setLocation(0, 0);
            tablaInsumosScroll.setSize(400, 200);
            tablaInsumosScroll.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }
        return tablaInsumosScroll;
    }

    public JTextField getCampoIdInsumo()
    {
        if (campoIdInsumo == null)
        {
            campoIdInsumo = new JTextField();
            campoIdInsumo.setBounds(500, 0, 200, 30);
        }
        return campoIdInsumo;
    }

    public JTextField getCampoCodigoInsumo()
    {
        if (campoCodigoInsumo == null)
        {
            campoCodigoInsumo = new JTextField();
            campoCodigoInsumo.setBounds(710, 0, 200, 30);
        }
        return campoCodigoInsumo;
    }

    public JTextField getCampoNombreInsumo()
    {
        if (campoNombreInsumo == null)
        {
            campoNombreInsumo = new JTextField();
            campoNombreInsumo.setBounds(500, 40, 200, 30);
        }
        return campoNombreInsumo;
    }

    public JTextField getCampoDescripcionInsumo()
    {
        if (campoDescripcionInsumo == null)
        {
            campoDescripcionInsumo = new JTextField();
            campoDescripcionInsumo.setBounds(710, 40, 200, 30);
        }
        return campoDescripcionInsumo;
    }

    public JTextField getCampoIdCategoriaInsumo()
    {
        if (campoIdCategoriaInsumo == null)
        {
            campoIdCategoriaInsumo = new JTextField();
            campoIdCategoriaInsumo.setBounds(500, 80, 200, 30);
        }
        return campoIdCategoriaInsumo;
    }

    public JButton getBotonGuardar() 
    {
    	if(botonGuardar == null)
    	{
    		botonGuardar = new JButton("Guardar");
    		botonGuardar.setBounds(500, 120, 200, 30);
    		botonGuardar.setActionCommand("botonGuardar");
    	}
		return botonGuardar;
	}

	public void setDataTablaInsumos(List<List<String>> tablaInsumos)
    {
        listaInsumos = tablaInsumos;
        
        DefaultTableModel model = (DefaultTableModel)getTablaInsumos().getModel();
        while(model.getRowCount() > 0)
        {
        	model.removeRow(0);
        }
        
        for(List<String> fila: listaInsumos)
        {
            String[] row = {fila.get(1), fila.get(2), fila.get(3)};
            model.addRow(row);
        }
    }

    public List<List<String>> getListaInsumos()
    {
        return listaInsumos;
    }
}
