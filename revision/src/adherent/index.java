package adherent;

import java.util.ArrayList;

public class index {

	public static void main(String[] args) {
		ADHERENT adherent1,adherent2;
		int nombreadherent,i;
		
		adherent1=new ADHERENT("Bliotek","Billy",10001,"10/09/2022");
		adherent2=new ADHERENT("Hugo","Victor",10002,"");
		
		ArrayList <ADHERENT> listeadherent; 
		listeadherent = new ArrayList<ADHERENT>();
		
		listeadherent.add(adherent1);
		listeadherent.add(adherent2);
		
		nombreadherent=listeadherent.size();
		System.out.println("nombre adherent = "+nombreadherent);
		
		for (i=0;i<nombreadherent;i++) {
			listeadherent.get(i).AFFICHER();
		}
		// System.out.println(listeadherent.get(0).getDateAdhesion());
		
		for (i=0;i<nombreadherent;i++) {
			if (listeadherent.get(i).getDateAdhesion()==null) {
				System.out.println("numero de carte Adherent = "+listeadherent.get(i).getNumeroCarte());
			}
		}
		
		
	}

}
