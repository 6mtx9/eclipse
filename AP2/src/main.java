import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
	
	private static ArrayList <AUTEUR> listeauteur = new ArrayList<AUTEUR>();
	private static ArrayList <LIVRE> listelivre = new ArrayList<LIVRE>();
	private static ArrayList <ADHERENT> listeadherent = new ArrayList<ADHERENT>();
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		String password="";
		String username="root";
		Connection connection;
		Statement command;
		String BDD = "AP2prof";
		String connectionString = "jdbc:mysql://localhost:3306/"+BDD;
		ResultSet data,data2,data3;

		Class.forName("com.mysql.jdbc.Driver");
		// System.out.println(connectionString+"-"+username+"-"+password); IMPRESSION url / username / password

		// CONNEXION AU BDD
		connection = DriverManager.getConnection(connectionString,username,password);
		command = connection.createStatement();
		//command.execute("INSERT INTO `PERSONNE` (`id`, `nom`, `prenom`, `age`) VALUES ('9', 'da', 'prenom', '10');");

		// RECUPERATION LIVRE DU BDD
		String requete = "SELECT * FROM livre";
		data = command.executeQuery(requete);
		// AJOUT LISTE + IMPRESSION
		while (data.next()) {
			// LIVRE livre = "livre"+data.getString(1);
			// System.out.println(livre);
			LIVRE livre = new LIVRE (data.getString(1),data.getString(2),data.getFloat(3));
			listelivre.add(livre);
		}
		// BOUCLE LISTE LIVRE
		for (int i=0;i<listelivre.size();i++) {
			System.out.println(listelivre.get(i).getISBN()+" "+listelivre.get(i).getTitre()+" "+listelivre.get(i).getPrix()+" "+listelivre.get(i).getAuteur()+" "+listelivre.get(i).getEmprunteur());
		}
		
		// RECUPERATION ADHERENT DU BDD
		String requete2 = "SELECT * FROM adherent";
		data2 = command.executeQuery(requete2);
		// AJOUT LISTE + IMPRESSION
		while (data2.next()) {
			ADHERENT adherent;
			adherent = new ADHERENT (data2.getString(1),data2.getString(2),data2.getString(3),data2.getString(4));
			listeadherent.add(adherent);
		}
		// BOUCLE LISTE ADHERENT
		for (int i=0;i<listeadherent.size();i++) {
			System.out.println(listeadherent.get(i).getNum()+" "+listeadherent.get(i).getNom()+" "+listeadherent.get(i).getPrenom()+" "+listeadherent.get(i).getEmail());
		}
		// RECUPERATION AUTEUR DU BDD
		String requete3 = "SELECT * FROM auteur";
		data3 = command.executeQuery(requete3);
		// AJOUT LISTE + IMPRESSION
		while (data3.next()) {
			AUTEUR auteur = new AUTEUR (data3.getInt(1),data3.getString(2),data3.getString(3),data3.getString(4),data3.getString(5));
			listeauteur.add(auteur);
		}
		// BOUCLE LISTE AUTEUR
		for (int i=0;i<listeauteur.size();i++) {
			System.out.println(listeauteur.get(i).getNum()+" "+listeauteur.get(i).getNom()+" "+listeauteur.get(i).getPrenom()+" "+listeauteur.get(i).getDatenaissance()+" "+listeauteur.get(i).getDescription());
		}
		
		LIVRE testlivre = findlivre("1");
		ADHERENT testadherent = findadherent("2");
		AUTEUR testauteur = findauteur(1);
		
	}
	
	public static LIVRE findlivre (String ISBN) {
		LIVRE lelivre = null;
		for (int i=0;i<listelivre.size();i++) {
			if (listelivre.get(i).getISBN().equals(ISBN)) {
				System.out.println("ISBN trouvé");
				return lelivre;
			}
			else {
				System.out.println("ISBN non trouvé");
			}
		}
		return null;
	}
	
	public static ADHERENT findadherent (String num) {
		ADHERENT ladherent = null;
		for (int i=0;i<listeadherent.size();i++) {
			if (listeadherent.get(i).getNum().equals(num)) {
				System.out.println("adherent trouvé");
				return ladherent;
			}
			else {
				System.out.println("adherent non trouvé");
			}
		}
		return null;
	}
	
	public static AUTEUR findauteur (int num) {
		AUTEUR lauteur = null;
		for (int i=0;i<listeauteur.size();i++) {
			if (listeauteur.get(i).getNum()==num) {
				System.out.println("auteur trouvé");
				return lauteur;
			}
			else {
				System.out.println("auteur non trouvé");
			}
		}
		return null;
	}
}

