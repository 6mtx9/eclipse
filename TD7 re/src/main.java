import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		CLIENT client1;
		COMPTE c1,c2,c3;
		
		ArrayList <COMPTE> mescomptes;
		mescomptes = new ArrayList<COMPTE>();
		
		client1 = new CLIENT ("Gravouil","Benjamin",true,"02/05/1977","enseignant","lycée Paul Lapie, 5 boulevard AB, 92400 COURBEVOIE",0101010101,"prof.grvaouil@gmail.com");
		c1 = new COMPTE (1324541132,client1,2548200,"€");
		c2 = new COMPTE (325447712,client1,1000,"€");
		c3 = new COMPTE (225447712,client1,-214,"€");
		
		client1.setMescomptes(mescomptes);
		client1.getMescomptes().add(c1);
		client1.getMescomptes().add(c2);
		client1.getMescomptes().add(c3);
		client1.info_comptes();
		
		c1.crediter(100);
		
		client1.info_comptes();
		
	}

}
