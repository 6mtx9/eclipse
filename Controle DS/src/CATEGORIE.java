
public class CATEGORIE {

	private String nom;
	private int id;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public CATEGORIE(String nom) {
		super();
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CATEGORIE(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	
	
	
}