package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controller.mainMVC;

import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ISBN = new JTextField();
		ISBN.setBackground(new Color(255, 255, 255));
		ISBN.setBounds(159, 96, 235, 22);
		frame.getContentPane().add(ISBN);
		ISBN.setColumns(10);

		JTextArea code = new JTextArea();
		code.setEditable(false);
		code.setBackground(new Color(240, 240, 240));
		code.setFont(new Font("Arial", Font.PLAIN, 17));
		code.setText("Code Barre :");
		code.setBounds(25, 93, 127, 22);
		frame.getContentPane().add(code);

		JTextArea txtrPageDemprunt = new JTextArea();
		txtrPageDemprunt.setEditable(false);
		txtrPageDemprunt.setFont(new Font("Arial", Font.PLAIN, 21));
		txtrPageDemprunt.setText("Page d'emprunt");
		txtrPageDemprunt.setBackground(new Color(240, 240, 240));
		txtrPageDemprunt.setBounds(139, 11, 235, 29);
		frame.getContentPane().add(txtrPageDemprunt);

		emprunteur = new JTextField();
		emprunteur.setColumns(10);
		emprunteur.setBackground(Color.WHITE);
		emprunteur.setBounds(159, 148, 235, 22);
		frame.getContentPane().add(emprunteur);

		JTextArea t = new JTextArea();
		t.setEditable(false);
		t.setText("Emprunteur : ");
		t.setFont(new Font("Arial", Font.PLAIN, 17));
		t.setBackground(new Color(243, 243, 243));
		t.setBounds(25, 147, 127, 22);
		frame.getContentPane().add(t);

		JTextArea resultat = new JTextArea();
		resultat.setBackground(new Color(255, 255, 255));
		resultat.setBounds(79, 49, 275, 22);
		frame.getContentPane().add(resultat);

		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(25, 208, 124, 35);
		frame.getContentPane().add(btnPrcedent);

		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					mainMVC.getM().emprunt(ISBN.getText(), emprunteur.getText());
					resultat.setText("Vous avez emprunté le livre "+ISBN.getText()+" avec succès.");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(174, 209, 109, 34);
		frame.getContentPane().add(btnNewButton);

	}
}
