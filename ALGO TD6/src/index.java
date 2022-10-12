import java.util.ArrayList;

public class index {

	public static void main(String[] args) {
		// DEFINITION VARIABLES
		EMPLOYE employe1, employe2;
		ENTREPRISE ABC;
		int i;
		
		// CREATION LISTE EMPLOYES VIDE
		ArrayList <EMPLOYE> listeemploye;
		listeemploye = new ArrayList <EMPLOYE>();
		// CREATION EMPLOYES
		employe1 = new EMPLOYE ("Pierre","5bd Descartes 77454 Champs de Marne","0110214948","pierre@hotmail.fr",3000);
		employe2 = new EMPLOYE ("Marie","4 rue de Meaux 75001 Paris","0140404040","marie@hotmail.fr",2000);
		
		// AJOUT EMPLOYE1 ET EMPLOYE2 A ARRAYLIST LISTEEMPLOYE
		listeemploye.add(employe1);
		listeemploye.add(employe2);
		
		// AFFICHE LISTE EMPLOYES
		
		
		// SORTIE SALAIRE ANNUEL PIERRE ET MARIE
		for (i=0;i<listeemploye.size();i++) {
			System.out.println("Salaire annuel = "+listeemploye.get(i).getSalaire());
		}
		
		// CREATION ENTREPRISE ABC
		ABC = new ENTREPRISE ("ABC","99 impasse de java 75020 Paris");
		
		// PIERRE ET MARIE TRAVAILLE CHEZ ABC
		employe1.setEmployeur(ABC);
		employe2.setEmployeur(ABC);
		ABC.getListeemploye().add(employe1);
		
		// TEST EMPLOYEUR DE EMPLOYE 1 ET 2
		//System.out.println("employeur employe 1"+employe1.getEmployeur());
		//System.out.println("employeur employe 2"+employe2.getEmployeur());
		
		// AFFICHE SALAIRE EMPLOYE ENTREPRISE ABC
		for (i=0;i<listeemploye.size();i++) {
				System.out.println("Salaire employé n°"+i+" = "+listeemploye.get(i));
			}
		
		
		
	}

}
