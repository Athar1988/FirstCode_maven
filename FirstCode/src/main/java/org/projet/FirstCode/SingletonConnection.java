package org.projet.FirstCode;

import java.sql.Connection;
import java.sql.DriverManager;



public class SingletonConnection {

	private static Connection connection;
	/* Chargement du driver JDBC pour MySQL */
	static{
		try {
			Class.forName( "com.mysql.jdbc.Driver" );
			connection = DriverManager.getConnection(  "jdbc:mysql://localhost:3306/bd_mvc_cat", "root", "" );
		} catch ( Exception e ) {
		    e.printStackTrace();
		}
}
	public static Connection getConnection() {
		return connection;
	}

}
