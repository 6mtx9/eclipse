import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		AUTEUR auteur1,auteur2;
		LIVRE livre1,livre2,livre3;
		ADHERENT adherent1,adherent2;
		ArrayList <LIVRE> liste1,liste2;
		
		auteur1 = new AUTEUR ("Gravouil","Benjamin","26/09/1984","Professeur de SLAM");
		auteur2 = new AUTEUR ("Tarif","","03/11/1989","Professeur de SISR");
		
		auteur1.setPrenom("Mohamed");
		
		livre1 = new LIVRE ("001","Programmer en Java",60,true,auteur1);
		livre2 = new LIVRE ("002","Le reseau",50,true,auteur2);
		livre3 = new LIVRE ("003","Le petit cheval",10,true,null);
		
		adherent1 = new ADHERENT ("CHEN","Michel","chen@gmail.com");
		adherent2 = new ADHERENT ("ASSEMAT","Alexander","assemat@gmail.com");
		
		liste1 = new ArrayList <LIVRE> ();
		liste2 = new ArrayList <LIVRE> ();
		
		adherent1.setListelivre(liste1);
		adherent1.setListelivre(liste2);
		
		adherent1.AddLivre(livre1);
		adherent1.AddLivre(livre2);
		
		for (int i=0;i<adherent1.getListelivre().size();i+=1) {
			adherent1.getListelivre().get(i).AFFICHER();
		}
		
		
	}

}
