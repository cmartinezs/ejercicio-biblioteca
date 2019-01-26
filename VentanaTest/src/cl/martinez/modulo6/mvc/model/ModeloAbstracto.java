package cl.martinez.modulo6.mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ModeloAbstracto 
{
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/ventas?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=America/Santiago";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";
    
    protected Connection obtenerConexion() throws SQLException, ClassNotFoundException
    {
    	Class.forName(JDBC_DRIVER);
    	return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
