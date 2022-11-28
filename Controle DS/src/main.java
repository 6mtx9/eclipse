import java.util.ArrayList;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
	
	private static ArrayList <CATEGORIE> listecategorie = new ArrayList<CATEGORIE>();
	private static ArrayList <CLIENT> listeclient = new ArrayList<CLIENT>();
	private static ArrayList <COMPTE> listecompte = new ArrayList<COMPTE>();
	
	public static CLIENT findclient(String client )
	{
		for(int i=0;i!=listeclient.size();i++)
		{
			if(listeclient.get(i).getNom().equals(client))
			{
				return listeclient.get(i);
			}
		}
		return null;
	}
	
	public static CATEGORIE findcategorie(int categorie )
	{
		for(int i=0;i!=listecategorie.size();i++)
		{
			if(listecategorie.get(i).getId()==categorie)
			{
				return listecategorie.get(i);
			}
		}
		return null;
	}
	
	public static COMPTE findcompte(String compte )
	{
		for(int i=0;i!=listecompte.size();i++)
		{
			if(listecompte.get(i).getNumero().equals(compte))
			{
				return listecompte.get(i);
			}
		}
		return null;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String password="";
		String username="root";
		String BDD = "CONTROLE DS";
		String connectionString = "jdbc:mysql://localhost:3306/"+BDD;
		ResultSet resultat;
		
		/// CONNEXION BDD
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(connectionString,username,password);
		
		/// CHARGEMENT CATEGORIES
		Statement commande = conn.createStatement();
		String requete = "SELECT * FROM categorie";
		resultat = commande.executeQuery(requete);
		while (resultat.next()) {
			CATEGORIE categorie = new CATEGORIE (resultat.getInt(1),resultat.getString(2));
			/// System.out.println(resultat.getInt(1)+" "+resultat.getString(2));
			listecategorie.add(categorie);
		}
		
		/// CHARGEMENT CLIENTS
		commande = conn.createStatement();
		requete = "SELECT * FROM client";
		resultat = commande.executeQuery(requete);
		while (resultat.next()) {
			CLIENT client= new CLIENT (resultat.getString(2),resultat.getString(3),resultat.getInt(4),resultat.getString(5),resultat.getString(6),resultat.getString(7),resultat.getString(8));
			/// System.out.println(resultat.getInt(1)+" "+resultat.getString(2));
			listeclient.add(client);
		}
		
		/// CHARGEMENT COMPTES
		commande = conn.createStatement();
		requete = "SELECT * FROM compte";
		resultat = commande.executeQuery(requete);
		while (resultat.next()) {
			COMPTE compte= new COMPTE (resultat.getString(1),resultat.getFloat(2),resultat.getString(3));
			/// System.out.println(resultat.getInt(1)+" "+resultat.getString(2));
			listecompte.add(compte);
		}
		
		
		/// INSERTION CATEGORIE CLIENT DANS LISTE DES CLIENTS
		commande = conn.createStatement();
		requete = "SELECT client.nom AS client,categorie.id as categorie FROM categorie,client WHERE client.categorie=categorie.id";
		resultat = commande.executeQuery(requete);
		while (resultat.next()) {
			String client = resultat.getString(1);
			int categorie = resultat.getInt(2);
			CLIENT cl = findclient(client);
			CATEGORIE ca = findcategorie(categorie);
			cl.setCateg(ca);
		}
		
		/// INSERTION LISTE COMPTE DANS LISTE DU CLIENT
		commande = conn.createStatement();
		requete = "SELECT client.nom AS client,compte.numero as compte FROM compte,client WHERE client.id=compte.client";
		resultat = commande.executeQuery(requete);
		while (resultat.next()) {
			String client = resultat.getString(1);
			String compte = resultat.getString(2);
			CLIENT cl = findclient(client);
			COMPTE co = findcompte(compte);
			listecompte.add(co);
			/// INSERTION CLIENT DANS COMPTE
			co.setLetitulaire(cl);
		}
		
		for (int i=0;i<listeclient.get(i).getLstcompte().size();i++) {
			//System.out.println(listeclient.get(i).getNom()+" "+listeclient.get(i).getPrenom()+" "+listeclient.get(i).getAdresse()+" "+listeclient.get(i).getDate()+" "+listeclient.get(i).getCateg()+" "+listeclient.get(i).getLstcompte());
			System.out.println(i);
		}
		
		
		
	}

}
