package main.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateBDD {
	
	Connection connection = null;
	Statement statement = null;
	
	public CreateBDD() throws ClassNotFoundException
	{
		// load the sqlite-JDBC driver using the current class loader
	    Class.forName("org.sqlite.JDBC");
	    if(getConnection() == null)
		try 
	    {
				connection = DriverManager.getConnection("jdbc:sqlite:xml.db");
				statement = connection.createStatement();
			    statement.setQueryTimeout(30);
			    
		} catch (SQLException e) {}
	    
	}
	
	public void createTable(String requete)
	{
		 try {
			statement.executeUpdate(requete);
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	public void insertRow(String requete)
	{
		try {
			if(requete !=  null)
				statement.executeUpdate(requete);
			
		} catch (SQLException e) {e.printStackTrace();}
	    
	}
	
	public ResultSet select(String requete) throws SQLException
	{
		 return (ResultSet) statement.executeQuery(requete);
	}
	
	public Connection getConnection()
	{
		return connection;	
	}
		
}
