
public class EPARGNE extends COMPTE{
	
	public EPARGNE(int num, float solde, String devise, CLIENT titulaire,float letaux_interet) {
		super(num, solde, devise, titulaire);
		taux_interet=letaux_interet;
	}

	private float taux_interet;

	public float getTaux_interet() {
		return taux_interet;
	}

	public void setTaux_interet(float taux_interet) {
		this.taux_interet = taux_interet;
	}
	
	public void DECRIRE() {
		System.out.println("Compte Epargne ");
		super.DECRIRE();
		System.out.println("- taux = "+taux_interet*100+"%");
	}
	
	public void AJOUT_INTERET() {
		if ( super.solde>0) {
			super.solde=super.solde+super.solde*taux_interet;
		}
	}
	public void RETIRER(float var) {
		if (var>super.solde/2) {
			System.out.println("Veuillez de retirer pas plus de 50% de votre solde épargne, soit "+super.solde/2+"€");
			System.out.println("");
		}
		else {
			super.solde=super.solde-var;
		}
	}
	
}
