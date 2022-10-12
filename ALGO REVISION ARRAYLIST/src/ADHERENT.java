import java.util.ArrayList;

public class ADHERENT {
	private String nom;
	private String prenom;
	private String email;
	private ArrayList <LIVRE> listelivre;
	
	public ADHERENT(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}

	public ADHERENT(String nom, String prenom, String email, ArrayList<LIVRE> listelivre) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.listelivre = listelivre;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<LIVRE> getListelivre() {
		return listelivre;
	}

	public void setListelivre(ArrayList<LIVRE> listelivre) {
		this.listelivre = listelivre;
	}
	
	public void AddLivre(LIVRE livre) {
		if (listelivre.size()<5) {
			listelivre.add(livre);
			livre.setDispo(false);
		}
		else {
			System.out.println("Quota atteint");
		}
	}
	
	public void RemoveLivre(LIVRE livre) {
			listelivre.remove(livre);
			livre.setDispo(false);
		}
	
}
