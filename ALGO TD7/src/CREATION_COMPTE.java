import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CREATION_COMPTE {

	private JFrame frame;
	private JTextField numCB;
	private JTextField decouvertmax;
	private JTextField solde;
	private JTextField taux;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CREATION_COMPTE window = new CREATION_COMPTE();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CREATION_COMPTE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		CLIENT client1,client2;
		COMPTE compte1,compte2,compte3;
		
		ArrayList <COMPTE> mescomptes;
		mescomptes = new ArrayList<COMPTE>();
		
		// CREATION DES CLIENTS / COMPTES
		client1 = new CLIENT ("nomclient1","prenomclient1",true,"01,01,2022","ouvrierclient1","adresseclient1",0601010101,"emailclient1");
		client2 = new CLIENT ("nomclient2","prenomclient2",false,"02,02,2022","ouvrierclient2","adresseclient2",0602020202,"emailclient2");
		compte1 = new COMPTE (11111111,(float) 15.02,"€",client1);
		compte2 = new COMPTE (22222222,(float) 0.00,"$",client2);
		compte3 = new COMPTE (33333333,(float) 3.33,"$",client1);
		
		// CREATION LISTE DE CLIENTS
		ArrayList <CLIENT> lstc;
		lstc = new ArrayList <CLIENT>();
		// AJOUT DANS LA LISTE DE CLIENTS
		lstc.add(client1);
		lstc.add(client2);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCreationDeCompte = new JLabel("CREATION DE COMPTE");
		lblCreationDeCompte.setBounds(140, 0, 171, 35);
		frame.getContentPane().add(lblCreationDeCompte);
		
		List liste_client = new List();
		liste_client.setBounds(173, 53, 245, 182);
		frame.getContentPane().add(liste_client);
		
		JLabel lblSlectionnerLeClient = new JLabel("Sélectionner le client");
		lblSlectionnerLeClient.setBounds(12, 62, 150, 55);
		frame.getContentPane().add(lblSlectionnerLeClient);
		
		JLabel lblTypeDeCompte = new JLabel("Type de compte");
		lblTypeDeCompte.setBounds(12, 284, 120, 35);
		frame.getContentPane().add(lblTypeDeCompte);
		
		JRadioButton button_courant = new JRadioButton("Compte Courant");
		button_courant.setBounds(141, 290, 149, 23);
		frame.getContentPane().add(button_courant);
		
		JRadioButton button_epargne = new JRadioButton("Compte Epargne");
		button_epargne.setBounds(291, 290, 149, 23);
		frame.getContentPane().add(button_epargne);
		
		JLabel lblNCb = new JLabel("N° CB");
		lblNCb.setBounds(12, 343, 70, 15);
		frame.getContentPane().add(lblNCb);
		
		numCB = new JTextField();
		numCB.setBounds(173, 336, 186, 29);
		frame.getContentPane().add(numCB);
		numCB.setColumns(10);
		
		decouvertmax = new JTextField();
		decouvertmax.setBounds(173, 388, 186, 29);
		frame.getContentPane().add(decouvertmax);
		decouvertmax.setColumns(10);
		
		JLabel lblDcouvertMax = new JLabel("Découvert Max");
		lblDcouvertMax.setBounds(12, 398, 120, 15);
		frame.getContentPane().add(lblDcouvertMax);
		
		solde = new JTextField();
		solde.setColumns(10);
		solde.setBounds(173, 498, 186, 29);
		frame.getContentPane().add(solde);
		
		taux = new JTextField();
		taux.setColumns(10);
		taux.setBounds(173, 441, 186, 29);
		frame.getContentPane().add(taux);
		
		JButton creer = new JButton("CREER");
		creer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = liste_client.getSelectedIndex(); // Selection du client de liste_client selectionné
				CLIENT clientselectionne = lstc.get(index); // Retrouver le client selectionné a partir de la liste lstc ( liste des clients de la banque )
				
				// Si boutton courant appuyé Sinon ...
				if (button_courant.isSelected()) {
					taux.setEditable(false);
					int prochainid = lstc.size()+1;
					COURANT comptecourant1;
					comptecourant1 = new COURANT(prochainid,Float.parseFloat(solde.getText()),"€",clientselectionne,500);
				}
				else {
					numCB.setEditable(false);
					decouvertmax.setEditable(false);
					int prochainid = lstc.size()+1;
					COURANT compteepargne1;
					compteepargne1 = new COURANT(prochainid,Float.parseFloat(solde.getText()),"€",clientselectionne,Integer.parseInt(taux.getText()));
				}
			}
		});
		creer.setBounds(207, 553, 117, 25);
		frame.getContentPane().add(creer);
		
		JLabel lblTaux = new JLabel("Taux");
		lblTaux.setBounds(12, 448, 70, 15);
		frame.getContentPane().add(lblTaux);
		
		JLabel lblSolde = new JLabel("Solde");
		lblSolde.setBounds(12, 505, 70, 15);
		frame.getContentPane().add(lblSolde);
		
		// AFFICHAGE DE TOUS LES CLIENTS DE LA BANQUE DANS LA LISTE VISUELLE
		for (int i=0;i<lstc.size();i++) {
			liste_client.add(lstc.get(i).Ligne());;
		}
		
		// CREATION ET AJOUT DES BOUTTONS EPARGNE ET COURANT DANS UNE LISTE DE BOUTTONS POUR PAS AVOIR LA SELECTIONNE DES DEUX SIMULTANEMENT
		ButtonGroup type_compte = new ButtonGroup();
		type_compte.add(button_epargne);
		type_compte.add(button_courant);
		
		
	}
}
