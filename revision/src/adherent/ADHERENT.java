package adherent;

public class ADHERENT {
	private String nom;
	private String prenom;
	private int numeroCarte;
	private String DateAdhesion;
	
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
	public int getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public String getDateAdhesion() {
		return DateAdhesion;
	}
	public void setDateAdhesion(String dateAdhesion) {
		DateAdhesion = dateAdhesion;
	}
	public ADHERENT(String nom, String prenom, int numeroCarte, String dateAdhesion) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroCarte = numeroCarte;
		DateAdhesion = dateAdhesion;
	}
	
	public void AFFICHER() {
		System.out.println("nom = "+nom);
		System.out.println("prenom = "+prenom);
		System.out.println("numeroCarte = "+numeroCarte);
		System.out.println("DateAdhesion = "+DateAdhesion);
		System.out.println("");
	}
	
	
}