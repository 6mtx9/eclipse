public class LIVRE {
	private String ISBN;
	private String titre;
	private int prix;
	private AUTEUR auteur;
	
	private ADHERENT emprunteur;
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public AUTEUR getAuteur() {
		return auteur;
	}
	public void setAuteur(AUTEUR auteur) {
		this.auteur = auteur;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public ADHERENT getEmprunteur() {
		return emprunteur;
	}
	public void setEmprunteur(ADHERENT emprunteur) {
		this.emprunteur = emprunteur;
	}
	public LIVRE(String iSBN, String titre, AUTEUR auteur, int prix) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	
	public LIVRE(String iSBN, String titre) {
		super();
		ISBN = iSBN;
		this.titre = titre;
	}
	
	public LIVRE(String iSBN, String titre, AUTEUR auteur) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.auteur = auteur;
	}
	
	public LIVRE(String iSBN, String titre, AUTEUR auteur, ADHERENT emprunteur) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.auteur = auteur;
		this.emprunteur = emprunteur;
	}
	public LIVRE(String iSBN, String titre, ADHERENT emprunteur) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.emprunteur = emprunteur;
	}
	public void AFFICHERLIVRE() {
		System.out.println("ISBN = "+ISBN);
		System.out.println("titre = "+titre);
		System.out.println("prix = "+prix);
		System.out.println("");
	}
	
	
}