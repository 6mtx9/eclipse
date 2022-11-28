package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

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
	 */
	public emprunter() {
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
		
		ISBN = new JTextField();
		ISBN.setBackground(new Color(255, 255, 255));
		ISBN.setBounds(159, 96, 235, 22);
		frame.getContentPane().add(ISBN);
		ISBN.setColumns(10);
		
		JTextArea code = new JTextArea();
		code.setBackground(new Color(240, 240, 240));
		code.setFont(new Font("Arial", Font.PLAIN, 17));
		code.setText("Code Barre :");
		code.setBounds(25, 93, 127, 22);
		frame.getContentPane().add(code);
		
		JTextArea txtrPageDemprunt = new JTextArea();
		txtrPageDemprunt.setFont(new Font("Arial", Font.PLAIN, 21));
		txtrPageDemprunt.setText("Page d'emprunt");
		txtrPageDemprunt.setBackground(new Color(240, 240, 240));
		txtrPageDemprunt.setBounds(139, 11, 235, 29);
		frame.getContentPane().add(txtrPageDemprunt);
		
		JTextArea r = new JTextArea();
		r.setBackground(new Color(240, 240, 240));
		r.setText("Titre : ");
		r.setFont(new Font("Arial", Font.PLAIN, 17));
		r.setBounds(25, 159, 92, 22);
		frame.getContentPane().add(r);
		
		JTextArea r2 = new JTextArea();
		r2.setBackground(new Color(240, 240, 240));
		r2.setText("Auteur : ");
		r2.setFont(new Font("Arial", Font.PLAIN, 17));
		r2.setBounds(25, 192, 92, 22);
		frame.getContentPane().add(r2);
		
		JTextArea titre = new JTextArea();
		titre.setBackground(new Color(255, 255, 255));
		titre.setBounds(159, 160, 235, 22);
		frame.getContentPane().add(titre);
		
		JTextArea auteur = new JTextArea();
		auteur.setBackground(new Color(255, 255, 255));
		auteur.setBounds(159, 194, 235, 22);
		frame.getContentPane().add(auteur);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listelivres.add();
			}
		});
		btnNewButton.setBounds(169, 227, 109, 34);
		frame.getContentPane().add(btnNewButton);
		
		emprunteur = new JTextField();
		emprunteur.setColumns(10);
		emprunteur.setBackground(Color.WHITE);
		emprunteur.setBounds(159, 127, 235, 22);
		frame.getContentPane().add(emprunteur);
		
		JTextArea t = new JTextArea();
		t.setText("Emprunteur : ");
		t.setFont(new Font("Arial", Font.PLAIN, 17));
		t.setBackground(new Color(243, 243, 243));
		t.setBounds(25, 126, 127, 22);
		frame.getContentPane().add(t);
		
		JTextArea info_emprunteur = new JTextArea();
		info_emprunteur.setBackground(new Color(255, 255, 255));
		info_emprunteur.setBounds(79, 49, 275, 22);
		frame.getContentPane().add(info_emprunteur);
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(23, 226, 124, 35);
		frame.getContentPane().add(btnPrcedent);
	}
}
