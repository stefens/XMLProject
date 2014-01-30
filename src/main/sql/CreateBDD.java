package main.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateBDD {
	
	Connection connection = null;
	
	public CreateBDD(String name) throws ClassNotFoundException
	{
		// load the sqlite-JDBC driver using the current class loader
	    Class.forName("org.sqlite.JDBC");
	    if(getConnection() == null)
		try 
	    {
				connection = DriverManager.getConnection("jdbc:sqlite:xml.db");
				Statement statement = connection.createStatement();
			    statement.setQueryTimeout(30);
			    
		} catch (SQLException e) {}
	    
	}
	
	public Connection getConnection()
	{
		return connection;	
	}
		
}
