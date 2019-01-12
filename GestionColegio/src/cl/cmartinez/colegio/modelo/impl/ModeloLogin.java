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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class ModeloLogin implements Modelo
{
    private String username;
    private String password;

    public ModeloLogin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

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
                + "WHERE nombre_usuario = " + usernameConsulta + "";
        
        try
        {
            ResultSet rs = new ConexionBD().ejecutarConsulta(sql);
            
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
    }


}
