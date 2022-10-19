public class COMPTE {
	protected int num;
	protected float solde;
	protected String devise;
	protected CLIENT titulaire;
	public float montantdebite;
	public float montantcredite;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public CLIENT getTitulaire() {
		return titulaire;
	}
	public void setTitulaire(CLIENT titulaire) {
		this.titulaire = titulaire;
	}
	
	public COMPTE(int num, float solde, String devise, CLIENT titulaire) {
		super();
		this.num = num;
		this.solde = solde;
		this.devise = devise;
		this.titulaire = titulaire;
	}
	
	public void debiter(float montantdebite) {
		this.solde-=montantdebite;
	}
	
	public void crediter(float montantcredite) {
		this.solde+=montantcredite;
	}
	public void DECRIRE() {
		System.out.print("n°"+num+" - solde : "+solde+" "+devise );
	}
	
	
}
