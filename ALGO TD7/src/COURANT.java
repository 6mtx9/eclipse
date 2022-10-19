
public class COURANT extends COMPTE{

	public COURANT(int num, float solde, String devise, CLIENT titulaire,int leplafondmax) {
		super(num, solde, devise, titulaire);
		plafondmax=leplafondmax;
	}

	public COURANT(int num, float solde, String devise, CLIENT titulaire, int  plafondmax, int numCB) {
		super(num, solde, devise, titulaire);
		this.numCB = numCB;
		this.plafondmax = plafondmax;
	}
	
	public int getNumCB() {
		return numCB;
	}

	public void setNumCB(int numCB) {
		this.numCB = numCB;
	}

	public int getPlafondmax() {
		return plafondmax;
	}

	public void setPlafondmax(int plafondmax) {
		this.plafondmax = plafondmax;
	}
	
	private int numCB,plafondmax;
	
	public void DECRIRE() {
		System.out.println("Compte Epargne ");
		super.DECRIRE();
		System.out.println("- Plafond Max = "+plafondmax +"€");
	}
	public void RETIRER(float var) {
		if (var>plafondmax) {
			System.out.println("Votre saisie dépasse le plafond maximal de "+plafondmax+"€");
			System.out.println("");
		}
		else {
			super.solde=super.solde-var;
		}
	}
	
}
