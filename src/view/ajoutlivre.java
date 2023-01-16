package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import controller.mainMVC;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;

import model.AUTEUR;
import model.LIVRE;
import javax.swing.JLabel;

public class ajoutlivre {

	private JFrame frame;
	private JTextField titre;
	private JTextField ISBN;
	private JTextArea txtrCodeBarre;
	private JTextArea txtrAuteur;
	private JTextArea r;
	private JButton btnPrcedent;
	private JTextField prix;
	private JTextArea txtrPrix;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajoutlivre window = new ajoutlivre();
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
	public ajoutlivre() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int auteur[]=new int[999];
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		titre = new JTextField();
		titre.setBounds(146, 92, 237, 20);
		frame.getContentPane().add(titre);
		titre.setColumns(10);
		
		ISBN = new JTextField();
		ISBN.setBounds(146, 60, 237, 20);
		frame.getContentPane().add(ISBN);
		ISBN.setColumns(10);
		
		JTextArea txtrAda = new JTextArea();
		txtrAda.setEditable(false);
		txtrAda.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrAda.setBackground(new Color(240, 240, 240));
		txtrAda.setText("Titre : ");
		txtrAda.setBounds(47, 92, 62, 23);
		frame.getContentPane().add(txtrAda);
		
		txtrCodeBarre = new JTextArea();
		txtrCodeBarre.setEditable(false);
		txtrCodeBarre.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrCodeBarre.setBackground(new Color(240, 240, 240));
		txtrCodeBarre.setText("Code Barre :");
		txtrCodeBarre.setBounds(47, 61, 95, 22);
		frame.getContentPane().add(txtrCodeBarre);
		
		txtrAuteur = new JTextArea();
		txtrAuteur.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrAuteur.setText("Auteur : ");
		txtrAuteur.setBackground(new Color(240, 240, 240));
		txtrAuteur.setBounds(47, 159, 95, 22);
		frame.getContentPane().add(txtrAuteur);
		
		r = new JTextArea();
		r.setEditable(false);
		r.setFont(new Font("Arial", Font.PLAIN, 21));
		r.setBackground(new Color(240, 240, 240));
		r.setText("Page d'ajout de livres");
		r.setBounds(118, 11, 237, 38);
		frame.getContentPane().add(r);
		
		btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(25, 261, 117, 37);
		frame.getContentPane().add(btnPrcedent);
		
		prix = new JTextField();
		prix.setColumns(10);
		prix.setBounds(146, 123, 237, 20);
		frame.getContentPane().add(prix);
		
		txtrPrix = new JTextArea();
		txtrPrix.setEditable(false);
		txtrPrix.setText("Prix : ");
		txtrPrix.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtrPrix.setBackground(new Color(240, 240, 240));
		txtrPrix.setBounds(47, 127, 62, 23);
		frame.getContentPane().add(txtrPrix);
		
		JLabel sortie = new JLabel("");
		sortie.setBounds(47, 204, 336, 31);
		frame.getContentPane().add(sortie);
		
		JComboBox <String>listeauteur = new JComboBox<String>();
		listeauteur.setBounds(146, 155, 237, 24);
		frame.getContentPane().add(listeauteur);
		// System.out.println(mainMVC.getM().getListAuteur().size());
		for (int i=0;i<mainMVC.getM().getListAuteur().size();i++) {
			listeauteur.addItem(mainMVC.getM().getListAuteur().get(i).getNom()+" "+mainMVC.getM().getListAuteur().get(i).getPrenom());
			auteur[i]=mainMVC.getM().getListAuteur().get(i).getNum();
		}
		
		
		JButton entrer = new JButton("Entrer");
		entrer.setFont(new Font("Arial", Font.PLAIN, 17));
		entrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numAuteur=auteur[listeauteur.getSelectedIndex()]; /// NUMERO DE LISTE DE LA FILE DEROULANTE ENTIER
				AUTEUR lauteur=mainMVC.getM().findlAuteur(numAuteur); /// FINDLAUTEUR POUR EN TYPE AUTEUR
				System.out.println(lauteur.getDescription());
				if (ISBN.getText()!=null && ISBN.getText()!=null && prix.getText()!=null) {
					float prixfloat = Float.parseFloat(prix.getText());
					try {
						mainMVC.getM().creationlivre(ISBN.getText(),titre.getText(),prixfloat,lauteur);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					
				}
			}
		});
		entrer.setBounds(170, 261, 107, 38);
		frame.getContentPane().add(entrer);
		
		
	}
}
