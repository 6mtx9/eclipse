import java.util.ArrayList;

public class EMPLOYE {
	private String nom;
	private String adresse;
	private String telephone;
	private String email;
	private int salaire;
	private ENTREPRISE employeur;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	public EMPLOYE(String nom, String adresse, String telephone, String email, int salaire) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.salaire = salaire;
	}
	
	public ENTREPRISE getEmployeur() {
		return employeur;
	}
	public void setEmployeur(ENTREPRISE employeur) {
		this.employeur = employeur;
	}
	
	public EMPLOYE(String nom, String adresse, String telephone, String email, int salaire, ENTREPRISE employeur) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.salaire = salaire;
		this.employeur = employeur;
	}
	// salaire par an
	public int getSalaireannuel() {
		return salaire*=12;
	}
	
	
}
