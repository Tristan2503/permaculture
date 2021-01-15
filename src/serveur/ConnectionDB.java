package serveur;

import java.sql.*;

public class ConnectionDB {
	static Connection c = null;
	
	static public Connection creationConnection() {
		try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:db/test.db");
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
		return c;
	}
}