package cl.cmartinez.modulo6.mvc.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ModeloLogin extends ModeloAbstracto 
{
	public String buscarUsuario(String username) 
	{
		String password = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try 
		{
			conn = obtenerConexion();
			stmt = conn.createStatement();
			
			String sql = "SELECT password FROM usuario WHERE nombre_usuario = '" + username +"'";
			
			 rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				password = rs.getString("password");
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			//Error
		}
		finally
		{
			if(conn != null) { 
				try { conn.close(); } catch (SQLException e) { } 
			}
			
			if(stmt != null) { 
				try { stmt.close(); } catch (SQLException e) { } 
			}
			
			if(rs != null) { 
				try { rs.close(); } catch (SQLException e) { } 
			}
		}
		
		return password;
	}

	public List<String> obtenerUsuarios() 
	{
		List<String> usuarios = new ArrayList<String>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try 
		{
			conn = obtenerConexion();
			stmt = conn.createStatement();
			
			String sql = "SELECT nombre_usuario FROM usuario";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				String usuario = rs.getString("nombre_usuario");
				usuarios.add(usuario);
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			//Error
		}
		finally
		{
			if(conn != null) { 
				try { conn.close(); } catch (SQLException e) { } 
			}
			
			if(stmt != null) { 
				try { stmt.close(); } catch (SQLException e) { } 
			}
			
			if(rs != null) { 
				try { rs.close(); } catch (SQLException e) { } 
			}
		}
		
		return usuarios;
	}

}
