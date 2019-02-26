/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class ConexionBaseDatos
{
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/ventas?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=America/Santiago";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";
    
    public static void main(String[] args)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try
        {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);
            
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            
            String username = "Gilberto' OR '1' = '1";
            
            String sql = "SELECT * FROM usuario WHERE nombre_usuario = ? ";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            
            //rs = stmt.executeQuery(sql);
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
               System.out.print("ID: " + rs.getInt("id"));
               System.out.print(", Usuario: " + rs.getString("nombre_usuario"));
               System.out.println(", Pwd: " + rs.getString("password"));
            }
            
            /*String sql = "SELECT id, precio_venta, stock FROM producto";
            rs = stmt.executeQuery(sql);
            
            //STEP 5: Extract data from result set
            while(rs.next())
            {
               //Retrieve by column name
               int id  = rs.getInt("id");
               int precioVenta = rs.getInt("precio_venta");
               int stock = rs.getInt("stock");

               //Display values
               System.out.print("ID: " + id);
               System.out.print(", Precio Venta: " + precioVenta);
               System.out.println(", Stock: " + stock);
            }*/
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            //STEP 6: Clean-up environment
            if(rs != null) {
                try { rs.close(); }
                catch (SQLException ex) { }
            }
            if(stmt != null) {
                try { stmt.close(); }
                catch (SQLException ex) { }
            }
            if(conn != null) {
                try { conn.close(); }
                catch (SQLException ex) { }
            }
        }
    }
}
