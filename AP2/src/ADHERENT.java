import java.util.ArrayList;
import java.util.Date;

public class ADHERENT {
	private String nom;
	private String prenom;
	private String email;
	private String numeroCarte;
	
	private ArrayList <LIVRE> listelivres;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<LIVRE> getListelivres() {
		return listelivres;
	}
	public void setListelivres(ArrayList<LIVRE> listelivres) {
		this.listelivres = listelivres;
	}
	public ADHERENT(String nom, String prenom, String email, String numeroCarte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.numeroCarte = numeroCarte;
		listelivres = new ArrayList<LIVRE>();
	}
	
	public ADHERENT(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	
	public void AFFICHERADHERENT() {
		System.out.println("Nom de l'adhérent = "+nom);
		System.out.println("Prenom de l'adhérent = "+prenom);
		System.out.println("Email = "+email);
		System.out.println("Numero de carte de l'adhérent = "+numeroCarte);
		System.out.println("");
	}
	public void AFFICHERMESLIVRES() {
		System.out.println("Liste livres empruntés = "+listelivres);
	}
	
	
}