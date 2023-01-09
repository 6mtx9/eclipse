import java.util.ArrayList;

public class ENTREPRISE {
	private String nom;
	private String adresse;
	private ArrayList <EMPLOYE> listeemploye;
	public int i;
	
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
	public ArrayList<EMPLOYE> getListeemploye() {
		return listeemploye;
	}
	public void setListeemploye(ArrayList<EMPLOYE> listeemploye) {
		this.listeemploye = listeemploye;
	}
	
	public ENTREPRISE(String nom, String adresse, ArrayList<EMPLOYE> listeemploye) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.listeemploye = listeemploye;
	}
	
	public ENTREPRISE(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	
}
