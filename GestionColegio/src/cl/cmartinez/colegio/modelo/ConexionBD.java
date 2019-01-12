/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class ConexionBD
{
    private static final Logger LOG = Logger.getLogger(ConexionBD.class.getName());
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/ventas?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=America/Santiago";

    static final String USER = "root";
    static final String PASS = "";
    
    public ConexionBD ()
    {
        try
        {
            Class.forName(JDBC_DRIVER);
        }
        catch (ClassNotFoundException ex)
        {
            LOG.log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection crearConexion() throws SQLException
    {
        return DriverManager.getConnection(DB_URL,USER,PASS);
    }
    
    public Statement crearSentencia() throws SQLException
    {
        return crearConexion().createStatement();
    }
    
    public ResultSet ejecutarConsulta(String sql) throws SQLException
    {
        return crearSentencia().executeQuery(sql);
    }
}
