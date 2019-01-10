/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.modelo.impl;

import cl.cmartinez.colegio.modelo.ConexionBD;
import cl.cmartinez.colegio.modelo.Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class ModeloVentanaPrincipal implements Modelo
{

    public ArrayList<String> obtenerElementosComboCategoria()
    {
        ArrayList<String> lista = new ArrayList();
        String sql = "SELECT nombre FROM categoria";
        try
        {
            ResultSet rs = new ConexionBD().ejecutarConsulta(sql);
            while(rs.next())
            {
                lista.add(rs.getString("nombre"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ModeloVentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
