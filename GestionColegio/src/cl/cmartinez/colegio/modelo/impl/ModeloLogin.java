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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class ModeloLogin extends Modelo
{
    private String username;		
    private String password;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void obtenerUsuario(String usernameConsulta)
    {
        String sql = "SELECT nombre_usuario, password "
                + "FROM usuario "
                + "WHERE nombre_usuario = ?";
        
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try
        {
            conn = new ConexionBD().crearConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, usernameConsulta);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                username = rs.getString("nombre_usuario");
                password = rs.getString("password");
            }
            else
            {
                username = null;
                password = null;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ModeloLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(ps != null)
            {
                try { ps.close(); }
                catch (SQLException ex) { }
            }
            
            if(conn != null)
            {
                try { conn.close(); }
                catch (SQLException ex) { }
            }
        }
    }
}
