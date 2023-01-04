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

import model.LIVRE;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
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
		btnPrcedent.setBounds(29, 224, 117, 37);
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
		
		
		Object[] listeauteur = new Object[] {};
		
		JComboBox <String>auteur = new JComboBox(listeauteur);
		auteur.setBounds(146, 155, 237, 24);
		frame.getContentPane().add(auteur);
		// System.out.println(mainMVC.getM().getListAuteur().size());
		for (int i=0;i<mainMVC.getM().getListAuteur().size();i++) {
			listeauteur = new Object[] {mainMVC.getM().getListAuteur().get(i).getNom()};
			
		}
		
		JButton entrer = new JButton("Entrer");
		entrer.setFont(new Font("Arial", Font.PLAIN, 17));
		entrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ISBN.getText()!=null && ISBN.getText()!=null && prix.getText()!=null) {
					String selectionauteur = (String) auteur.getSelectedItem();
					float prixfloat = Float.parseFloat(prix.getText());
					try {
						mainMVC.getM().creationlivre(ISBN.getText(),titre.getText(),prixfloat,mainMVC.getM().findauteur(selectionauteur));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					
				}
			}
		});
		entrer.setBounds(169, 223, 107, 38);
		frame.getContentPane().add(entrer);
	}
}
