package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;


public class ajoutlivre {

	private JFrame frame;
	private JTextField titre;
	private JTextField ISBN;
	private JTextArea txtrCodeBarre;
	private JTextArea txtrAuteur;
	private JTextArea r;
	private JButton btnPrcedent;

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton entrer = new JButton("Entrer");
		entrer.setFont(new Font("Arial", Font.PLAIN, 17));
		entrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ISBN.getText()!=null) {
					/*int nombre = Integer.parseInt(ISBN.getText());
					livre = new LIVRE (ISBN.getText(),titre.getText(),auteur.getText()); JAVA CREATION USELESS*/
				}
				else {
					
				}
			}
		});
		entrer.setBounds(169, 183, 107, 38);
		frame.getContentPane().add(entrer);
		
		titre = new JTextField();
		titre.setBounds(146, 91, 237, 20);
		frame.getContentPane().add(titre);
		titre.setColumns(10);
		
		ISBN = new JTextField();
		ISBN.setBounds(146, 60, 237, 20);
		frame.getContentPane().add(ISBN);
		ISBN.setColumns(10);
		
		JTextArea txtrAda = new JTextArea();
		txtrAda.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrAda.setBackground(new Color(240, 240, 240));
		txtrAda.setText("Titre : ");
		txtrAda.setBounds(51, 60, 62, 23);
		frame.getContentPane().add(txtrAda);
		
		txtrCodeBarre = new JTextArea();
		txtrCodeBarre.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrCodeBarre.setBackground(new Color(240, 240, 240));
		txtrCodeBarre.setText("Code Barre :");
		txtrCodeBarre.setBounds(51, 92, 95, 22);
		frame.getContentPane().add(txtrCodeBarre);
		
		txtrAuteur = new JTextArea();
		txtrAuteur.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrAuteur.setText("Auteur : ");
		txtrAuteur.setBackground(new Color(240, 240, 240));
		txtrAuteur.setBounds(51, 122, 95, 22);
		frame.getContentPane().add(txtrAuteur);
		
		r = new JTextArea();
		r.setFont(new Font("Arial", Font.PLAIN, 21));
		r.setBackground(new Color(240, 240, 240));
		r.setText("Page d'ajout de livres");
		r.setBounds(118, 11, 237, 38);
		frame.getContentPane().add(r);
		
		btnPrcedent = new JButton("Précedent");
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(29, 183, 117, 37);
		frame.getContentPane().add(btnPrcedent);
		
		JComboBox auteur = new JComboBox();
		auteur.setBounds(146, 123, 237, 24);
		frame.getContentPane().add(auteur);
		for (int i=0;i<size;i++) {
			auteur.addItem(leslivres.get(i));
		}
		
	}
}
