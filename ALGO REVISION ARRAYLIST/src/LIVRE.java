
public class LIVRE {
	private String ISBN;
	private String titre;
	private int prix;
	private boolean dispo;
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
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public boolean isDispo() {
		return dispo;
	}
	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	public AUTEUR getAuteur() {
		return auteur;
	}
	public void setAuteur(AUTEUR auteur) {
		this.auteur = auteur;
	}
	public ADHERENT getEmprunteur() {
		return emprunteur;
	}
	public void setEmprunteur(ADHERENT emprunteur) {
		this.emprunteur = emprunteur;
	}
	
	public LIVRE(String iSBN, String titre, int prix, boolean dispo, AUTEUR auteur) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.prix = prix;
		this.dispo = dispo;
		this.auteur = auteur;
	}
	
	public LIVRE(String iSBN, String titre, int prix, boolean dispo, AUTEUR auteur, ADHERENT emprunteur) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.prix = prix;
		this.dispo = dispo;
		this.auteur = auteur;
		this.emprunteur = emprunteur;
	}
	
	public void AFFICHER() {
		String d;
		if (dispo) {
			d="Disponible";
		}
		else {
			d="Emprunté";
		}
		System.out.println("Livre n°"+ISBN+":'"+titre+"' de ' "+auteur.getNom()+"' "+prix+"€ ( "+d+" )");
	}
	
}

