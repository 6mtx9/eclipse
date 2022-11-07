public class COMPTE {
	private int num;
	private CLIENT titulaire;
	private float solde;
	private String devise;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public CLIENT getTitulaire() {
		return titulaire;
	}
	public void setTitulaire(CLIENT titulaire) {
		this.titulaire = titulaire;
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
	public COMPTE(int num, CLIENT titulaire, float solde, String devise) {
		super();
		this.num = num;
		this.titulaire = titulaire;
		this.solde = solde;
		this.devise = devise;
	}
	
	public void debiter(float montantdebite) {
		this.solde-=montantdebite;
	}
	
	public void crediter(float montantcredite) {
		this.solde+=montantcredite;
	}
	public void decrire() {
		System.out.println("n° : "+this.num+" - solde : "+this.solde+" €");
	}
}
