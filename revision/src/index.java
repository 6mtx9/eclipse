import java.util.ArrayList;

public class index {

	public static void main(String[] args) {
		
		VOITURE v1,v2;
		int nbv,i;
		String mavoiture;
		ArrayList <VOITURE> ListeVoiture; 
		ListeVoiture = new ArrayList<VOITURE>();
		v1 = new VOITURE ("BMW","serie3","bleu",2020,10000,40000);
		v2 = new VOITURE ("Renault","clio","noir",2015,95000,9000);
		
		ListeVoiture.add(v1);
		ListeVoiture.add(v2);
		
		nbv=ListeVoiture.size();
				
		v2.setCouleur("blanc");
		
		//v1.AFFICHERV();
		System.out.println("couleur v2 : "+v2.getCouleur());
		
		//for (i=0;i<nbv;i++) {
			//ListeVoiture.get(i).AFFICHERV();
		//}
		
		
	}

}
