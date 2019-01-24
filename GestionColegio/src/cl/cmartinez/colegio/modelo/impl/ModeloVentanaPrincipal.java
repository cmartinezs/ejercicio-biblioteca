/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.modelo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;

import cl.cmartinez.colegio.modelo.ConexionBD;
import cl.cmartinez.colegio.modelo.HibernateUtil;
import cl.cmartinez.colegio.modelo.Modelo;
import cl.cmartinez.colegio.modelo.entidades.Categoria;

/**
 *
 * @author carlo
 */
public class ModeloVentanaPrincipal extends Modelo
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
    
    @SuppressWarnings("unchecked")
	public List<Categoria> obtenerTodasLasCategorias()
	{
    	Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List<Categoria> result = session.createQuery("from Categoria").getResultList();

        session.getTransaction().commit();
        session.close();
        
        return result;
	}
    
    public void ingresarCategoria(Categoria categoria)
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.saveOrUpdate(categoria);

        session.getTransaction().commit();
        session.close();
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
