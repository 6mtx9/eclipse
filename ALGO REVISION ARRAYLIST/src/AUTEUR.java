
public class AUTEUR {
	private String nom;
	private String prenom;
	private String dateN;
	private String description;
	
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
	public String getDateN() {
		return dateN;
	}
	public void setDateN(String dateN) {
		this.dateN = dateN;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public AUTEUR(String nom, String prenom, String dateN, String description) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateN = dateN;
		this.description = description;
	}
	
}
