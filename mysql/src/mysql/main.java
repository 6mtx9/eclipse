package mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class main {
	
	private static String password="";
	private static String username="root";
	private static String connectionString = "jdbc:mysql://localhost/BDD_TD7";
	private static Connection connection;
	private static Statement command;
	private static ResultSet data;
	
	public static void main(String[] args) {
		
		try {
			connection = DriverManager.getConnection(connectionString,username,password);
			command = connection.createStatement();
			//command.execute("INSERT INTO `PERSONNE` (`id`, `nom`, `prenom`, `age`) VALUES ('9', 'da', 'prenom', '10');");
			data = command.executeQuery("SELECT nom FROM PERSONNE");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// System.out.println("YESSSSSS");
			try {
				if(data.first()) {
					while (data.next()) {
						System.out.println("nom : "+data.getString("nom"));
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
