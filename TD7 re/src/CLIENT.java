import java.util.ArrayList;

public class CLIENT {
	private String nom;
	private String prenom;
	private Boolean genre;
	private String dateN;
	private String categorie;
	private String adresse;
	private int telephone;
	private String email;
	private ArrayList<COMPTE> mescomptes;
	private String g;
	
	public ArrayList<COMPTE> getMescomptes() {
		return mescomptes;
	}
	public void setMescomptes(ArrayList<COMPTE> mescomptes) {
		this.mescomptes = mescomptes;
	}
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
	public Boolean getGenre() {
		return genre;
	}
	public void setGenre(Boolean genre) {
		this.genre = genre;
	}
	public String getDateN() {
		return dateN;
	}
	public void setDateN(String dateN) {
		this.dateN = dateN;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public CLIENT(String nom, String prenom, Boolean genre, String dateN, String categorie, String adresse,
			int telephone, String email, ArrayList<COMPTE> mescomptes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.dateN = dateN;
		this.categorie = categorie;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.mescomptes = mescomptes;
	}
	
	public CLIENT(String nom, String prenom, Boolean genre, String dateN, String categorie, String adresse,
			int telephone, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.dateN = dateN;
		this.categorie = categorie;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}
	
	public void info_comptes() {
		if (this.genre) {
			g="Mr.";
		}
		else {
			g="Mme.";
		}
		System.out.println("Liste des comptes de "+g+"Gravouil Benjamin");
		System.out.println("");
		for (int i=0;i<mescomptes.size();i++) {
			mescomptes.get(i).decrire();
		}
		System.out.println("");
	}
	
}
