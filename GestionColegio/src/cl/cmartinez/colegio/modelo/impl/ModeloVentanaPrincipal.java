/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.modelo.impl;

import cl.cmartinez.colegio.modelo.ConexionBD;
import cl.cmartinez.colegio.modelo.Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public void ingresarCategoria(String nombreCategoria, String descripcionCategoria)
    {
        String sql = "INSERT INTO categoria (nombre, descripcion) VALUES (?, ?)";
        Connection conn = null;
        PreparedStatement ps = null;
        try
        {
            conn = new ConexionBD().crearConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombreCategoria);
            ps.setString(2, descripcionCategoria);
            ps.executeUpdate();
            ps.execute(sql);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ModeloVentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(ps != null)
            {
                try
                {
                    ps.close();
                }
                catch (SQLException ex) { }
            }
            
            if(conn != null)
            {
                try
                {
                    conn.close();
                }
                catch (SQLException ex) { }
            }
        }
    }

    public List<List<String>> obtenerTablaInsumos()
    {
        List<List<String>> lista = new ArrayList();
        
        String sql = "SELECT * FROM insumo";
        
        try
        {
            ResultSet rs = new ConexionBD().ejecutarConsulta(sql);
            
            while(rs.next())
            {
                List<String> fila = new ArrayList();
                fila.add(rs.getString("id"));
                fila.add(rs.getString("codigo"));
                fila.add(rs.getString("nombre"));
                fila.add(rs.getString("descripcion"));
                fila.add(rs.getString("id_categoria"));
                
                lista.add(fila);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ModeloVentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
