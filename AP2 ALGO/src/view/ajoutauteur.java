package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;

import controller.mainMVC;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

import java.awt.TextArea;

public class ajoutauteur {

	private JFrame frame;
	private JTextField nom;
	private JTextField prenom;
	private JTextField dateN;
	private JTextField num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajoutauteur window = new ajoutauteur();
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
	public ajoutauteur() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextArea txtrPageDajoutAuteur = new JTextArea();
		txtrPageDajoutAuteur.setEditable(false);
		txtrPageDajoutAuteur.setText("Page d'ajout auteur");
		txtrPageDajoutAuteur.setFont(new Font("Arial", Font.PLAIN, 21));
		txtrPageDajoutAuteur.setBackground(SystemColor.menu);
		txtrPageDajoutAuteur.setBounds(120, 22, 208, 37);
		frame.getContentPane().add(txtrPageDajoutAuteur);

		JTextArea txtrNom = new JTextArea();
		txtrNom.setEditable(false);
		txtrNom.setText("Nom :");
		txtrNom.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrNom.setBackground(SystemColor.menu);
		txtrNom.setBounds(10, 105, 108, 22);
		frame.getContentPane().add(txtrNom);

		JTextArea txtrPrenom = new JTextArea();
		txtrPrenom.setEditable(false);
		txtrPrenom.setText("Prenom :");
		txtrPrenom.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrPrenom.setBackground(SystemColor.menu);
		txtrPrenom.setBounds(10, 139, 108, 22);
		frame.getContentPane().add(txtrPrenom);

		JTextArea txtrDateDeNaissance = new JTextArea();
		txtrDateDeNaissance.setEditable(false);
		txtrDateDeNaissance.setText("Date de naissance :");
		txtrDateDeNaissance.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrDateDeNaissance.setBackground(SystemColor.menu);
		txtrDateDeNaissance.setBounds(10, 173, 121, 22);
		frame.getContentPane().add(txtrDateDeNaissance);

		JTextArea txtrEmail_1 = new JTextArea();
		txtrEmail_1.setEditable(false);
		txtrEmail_1.setText("Numéro auteur : ");
		txtrEmail_1.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrEmail_1.setBackground(SystemColor.menu);
		txtrEmail_1.setBounds(10, 71, 108, 22);
		frame.getContentPane().add(txtrEmail_1);

		nom = new JTextField();
		nom.setFont(new Font("Arial", Font.PLAIN, 13));
		nom.setColumns(10);
		nom.setBounds(143, 103, 238, 20);
		frame.getContentPane().add(nom);

		prenom = new JTextField();
		prenom.setFont(new Font("Arial", Font.PLAIN, 13));
		prenom.setColumns(10);
		prenom.setBounds(143, 137, 238, 20);
		frame.getContentPane().add(prenom);

		dateN = new JTextField();
		dateN.setFont(new Font("Arial", Font.PLAIN, 13));
		dateN.setColumns(10);
		dateN.setBounds(143, 178, 238, 20);
		frame.getContentPane().add(dateN);

		num = new JTextField();
		num.setFont(new Font("Arial", Font.PLAIN, 13));
		num.setColumns(10);
		num.setBounds(143, 71, 238, 20);
		frame.getContentPane().add(num);

		JButton btnNewButton = new JButton("Valider");

		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNewButton.setBounds(150, 360, 108, 37);
		frame.getContentPane().add(btnNewButton);

		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(14, 360, 117, 37);
		frame.getContentPane().add(btnPrcedent);

		JTextArea txtrDescription = new JTextArea();
		txtrDescription.setText("Description :");
		txtrDescription.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtrDescription.setEditable(false);
		txtrDescription.setBackground(SystemColor.windowBorder);
		txtrDescription.setBounds(10, 224, 121, 22);
		frame.getContentPane().add(txtrDescription);

		TextArea description = new TextArea();
		description.setBounds(143, 224, 238, 130);
		frame.getContentPane().add(description);


		btnNewButton.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				if (num.getText()!=null && nom.getText()!=null && prenom.getText()!=null && dateN.getText()!=null && description.getText()!=null) {
					try {
						mainMVC.getM().creationAuteur(num.getText(),nom.getText(),prenom.getText(),dateN.getText(),description.getText());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					num.setText(null);
					nom.setText(null);
					prenom.setText(null);
					dateN.setText(null);
					description.setText(null);
				}
			}
		});

	}
}
