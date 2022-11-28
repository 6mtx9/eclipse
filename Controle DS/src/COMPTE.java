class COMPTE {
	private String numero;
	private float solde;
	private String devise;
	private CLIENT letitulaire ;

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public String getDevise() {
		return devise;
	}
	public void setDevise(String devise) {
		this.devise = devise;
	}

	
	public COMPTE(String numero, float solde, String devise, CLIENT letitulaire) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.devise = devise;
		this.letitulaire = letitulaire;
	}
	public CLIENT getLetitulaire() {
		return letitulaire;
	}
	public void setLetitulaire(CLIENT letitulaire) {
		this.letitulaire = letitulaire;
	}
	public void debiter(float montant)
	{
		solde=solde-montant;
	}
	public void crediter(float montant)
	{
		solde=solde+montant;
	}
	public void decrire()
	{
		System.out.println("num : "+numero+" - solde : "+solde+" "+devise);
	}
	public COMPTE(String numero, float solde, String devise) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.devise = devise;
	}
	
}