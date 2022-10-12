public class VOITURE {
	private String marque;
	private String modele;
	private String couleur;
	private int km;
	private int annee;
	private int prix;
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public VOITURE(String marque, String modele, String couleur, int km, int annee, int prix) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.km = km;
		this.annee = annee;
		this.prix = prix;
	}
	
	public void AFFICHERV() {
		System.out.println("marque = "+marque);
		System.out.println("modele = "+modele);
		System.out.println("couleur = "+couleur);
		System.out.println("annee = "+annee);
		System.out.println("km = "+km);
		System.out.println("prix = "+prix);
		
	}
	
}
