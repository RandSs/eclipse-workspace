package entites;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

	private static String dburl ="jdbc:mysql://localhost:3306/checkIn";
	private static String dbuser ="root";
	private static String dbpass = "";
	public static Connection connexion = null;
	
	
	public static void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connexion= DriverManager.getConnection(dburl,dbuser,dbpass);
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
		
	}
	
	
}
