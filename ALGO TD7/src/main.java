import java.util.ArrayList;
import java.util.Date;

public class main {

	public static void main(String[] args) {
		COMPTE compte1,compte3;
		CLIENT client1,client2;
		EPARGNE compte2;
		COURANT courant1;
		/// 0 = FEMME 
		/// 1 = HOMMME
		
		//CREATION LISTE MESCOMPTES
		ArrayList <COMPTE> mescomptes;
		mescomptes = new ArrayList<COMPTE>();
		
		/*client1 = new CLIENT ("nomclient1","prenomclient1",true,new Date (01,01,2022),"ouvrierclient1","adresseclient1",0601010101,"emailclient1");
		client2 = new CLIENT ("nomclient2","prenomclient2",false,new Date (02,02,2022),"ouvrierclient2","adresseclient2",0602020202,"emailclient2");
		compte1 = new COMPTE (11111111,(float) 15.02,"€",client1);
		compte2 = new COMPTE (22222222,(float) 0.00,"$",client2);
		compte3 = new COMPTE (33333333,(float) 3.33,"$",client1);
		
		/// AJOUTE COMPTE AUX CLIENTS
		client1.getMescomptes().add(compte1);
		client2.getMescomptes().add(compte2);
		client1.getMescomptes().add(compte3);
		
		/// TEST VALEUR MESCOMPTES
		///System.out.println("Mes comptes = "+client1.getMescomptes());
		
		compte1.debiter((float)1.1);
		compte2.crediter((float)10.09);
		
		// AFFICHER SOLDE CLIENT1 ET CLIENT2
		System.out.println("Solde compte1 apres ajout = "+compte1.getSolde());
		System.out.println("Solde compte2 apres ajout = "+compte2.getSolde());
		
		// compte1.decrire();
		System.out.println("");
		client1.info_comptes();
		System.out.println("");
		client2.info_comptes();*/
		
		client2 = new CLIENT ("nomclient2","prenomclient2",false,new Date (02,02,2022),"ouvrierclient2","adresseclient2",0602020202,"emailclient2");
		compte2 = new EPARGNE (1022121102,1000,"€",client2,(float)0.05);
		mescomptes.add(compte2);
		client2.setMescomptes(mescomptes);
		client2.info_comptes();
		compte2.AJOUT_INTERET();
		client2.info_comptes();
		
		courant1 = new COURANT (1022121102,1000,"€",client2,500,1231616911);
		mescomptes.add(courant1);
		client2.info_comptes();
		
		compte2.RETIRER(400);
		client2.info_comptes();
		
		courant1.RETIRER(500);
		client2.info_comptes();
		
	}

}
