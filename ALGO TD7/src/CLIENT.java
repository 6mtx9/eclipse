import java.util.ArrayList;
import java.util.Date;

public class CLIENT {
	private String nom;
	private String prenom;
	private Boolean genre;
	private Date date;
	private String categorie;
	private String adresse;
	private int telephone;
	private String email;
	private ArrayList<COMPTE> mescomptes;
	
	public String g;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPernom() {
		return prenom;
	}
	public void setPernom(String pernom) {
		this.prenom = pernom;
	}
	public Boolean getGenre() {
		return genre;
	}
	public void setGenre(Boolean genre) {
		this.genre = genre;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public ArrayList<COMPTE> getMescomptes() {
		return mescomptes;
	}
	public void setMescomptes(ArrayList<COMPTE> mescomptes) {
		this.mescomptes = mescomptes;
	}
	public CLIENT(String nom, String pernom, Boolean genre, Date date, String categorie, String adresse, int telephone,
			String email) {
		super();
		this.nom = nom;
		this.prenom = pernom;
		this.genre = genre;
		this.date = date;
		this.categorie = categorie;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}
	
	public CLIENT(String nom, String prenom, Boolean genre, Date date, String categorie, String adresse, int telephone,
			String email, ArrayList<COMPTE> mescomptes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.date = date;
		this.categorie = categorie;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.mescomptes = mescomptes;
	}
	public void info_comptes() {
		if (genre==true) {
			g="Mme.";
		}
		else {
			g="M.";
		}
		System.out.println("Liste des comptes de "+g+nom+" "+prenom);
		System.out.println("");
		for(int i=0;i<mescomptes.size();i++)
		{
			mescomptes.get(i).DECRIRE();
		}
		System.out.println("");
	}
	
}
