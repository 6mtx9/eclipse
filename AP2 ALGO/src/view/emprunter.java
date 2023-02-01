package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.mainMVC;

import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

import model.LIVRE;
import model.ADHERENT;

public class emprunter {

	private JFrame frame;
	private JTextField ISBN;
	private JTextField emprunteur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					emprunter window = new emprunter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public emprunter() throws SQLException {
		mainMVC.getM().getAll();
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 708, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ISBN = new JTextField();
		ISBN.setBackground(new Color(255, 255, 255));
		ISBN.setBounds(240, 236, 296, 60);
		frame.getContentPane().add(ISBN);
		ISBN.setColumns(10);

		JTextArea code = new JTextArea();
		code.setEditable(false);
		code.setBackground(new Color(240, 240, 240));
		code.setFont(new Font("Arial", Font.PLAIN, 25));
		code.setText("Code Barre :");
		code.setBounds(25, 145, 165, 44);
		frame.getContentPane().add(code);

		JTextArea txtrPageDemprunt = new JTextArea();
		txtrPageDemprunt.setEditable(false);
		txtrPageDemprunt.setFont(new Font("Arial", Font.PLAIN, 26));
		txtrPageDemprunt.setText("Page d'emprunt");
		txtrPageDemprunt.setBackground(new Color(240, 240, 240));
		txtrPageDemprunt.setBounds(259, 11, 195, 43);
		frame.getContentPane().add(txtrPageDemprunt);

		emprunteur = new JTextField();
		emprunteur.setColumns(10);
		emprunteur.setBackground(Color.WHITE);
		emprunteur.setBounds(240, 129, 296, 60);
		frame.getContentPane().add(emprunteur);

		JTextArea t = new JTextArea();
		t.setEditable(false);
		t.setText("Emprunteur : ");
		t.setFont(new Font("Arial", Font.PLAIN, 25));
		t.setBackground(new Color(243, 243, 243));
		t.setBounds(25, 245, 144, 49);
		frame.getContentPane().add(t);

		JTextArea resultat = new JTextArea();
		resultat.setFont(new Font("Monospaced", Font.PLAIN, 17));
		resultat.setEditable(false);
		resultat.setBackground(SystemColor.control);
		resultat.setBounds(191, 65, 322, 41);
		frame.getContentPane().add(resultat);

		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(25, 336, 124, 35);
		frame.getContentPane().add(btnPrcedent);

		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					resultat.setText(null);
					System.out.println(mainMVC.getM().verif(ISBN.getText()));
					if (mainMVC.getM().verif(ISBN.getText())=="null") {
						mainMVC.getM().emprunt(ISBN.getText(), emprunteur.getText());
						resultat.setText("Vous avez emprunté le livre "+ISBN.getText()+" avec succès.");
					}
					else {
						resultat.setText("Le livre "+ISBN.getText()+" a déjà été emprunté.");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(336, 336, 109, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\Bibliothèque.jpg"));
		background.setBounds(0, -33, 692, 463);
		frame.getContentPane().add(background);
	}
}
