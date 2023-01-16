package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controller.mainMVC;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class bibliothecaire {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bibliothecaire window = new bibliothecaire();
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
	public bibliothecaire() throws SQLException {
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
		
		JButton ajoutadherent = new JButton("Ajout Adhérent");
		ajoutadherent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajoutadherent vca = new ajoutadherent();
			}
		});
		ajoutadherent.setBounds(50, 65, 146, 45);
		frame.getContentPane().add(ajoutadherent);
		
		JButton ajoutauteur = new JButton("Ajout Auteur");
		ajoutauteur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajoutauteur vca = new ajoutauteur();
			}
		});
		ajoutauteur.setBounds(243, 159, 146, 42);
		frame.getContentPane().add(ajoutauteur);
		
		JButton ajoutlivre = new JButton("Ajout Livre");
		ajoutlivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajoutlivre vca = new ajoutlivre();
			}
		});
		ajoutlivre.setBounds(243, 65, 146, 45);
		frame.getContentPane().add(ajoutlivre);
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(50, 159, 146, 42);
		frame.getContentPane().add(btnPrcedent);
	}

}
