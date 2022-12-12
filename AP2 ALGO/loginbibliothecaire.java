package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.mainMVC;
import model.model;

public class loginbibliothecaire {

	private JFrame frame;
	private JTextField motdepasse;
	private JTextField login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginbibliothecaire window = new loginbibliothecaire();
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
	public loginbibliothecaire() throws SQLException {
		initialize();
		frame.setVisible(true);
		mainMVC.getM().getAll();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(65, 213, 117, 37);
		frame.getContentPane().add(btnPrcedent);
		
		JLabel lblConnexionBibliothecaire = new JLabel("Connexion Bibliothecaire");
		lblConnexionBibliothecaire.setFont(new Font("Dialog", Font.BOLD, 16));
		lblConnexionBibliothecaire.setBounds(121, 27, 256, 28);
		frame.getContentPane().add(lblConnexionBibliothecaire);
		
		motdepasse = new JTextField();
		motdepasse.setBounds(204, 151, 208, 28);
		frame.getContentPane().add(motdepasse);
		motdepasse.setColumns(10);
		
		login = new JTextField();
		login.setColumns(10);
		login.setBounds(204, 91, 208, 28);
		frame.getContentPane().add(login);
		
		JButton valider = new JButton("Valider");
		valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login2= login.getText();
				String motdepasse2 = motdepasse.getText();
				try {
					mainMVC.getM().connexionbiblio(login2, motdepasse2);
				} catch (NoSuchAlgorithmException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		valider.setFont(new Font("Dialog", Font.PLAIN, 17));
		valider.setBounds(249, 213, 117, 37);
		frame.getContentPane().add(valider);
		
		JLabel lblEmail = new JLabel("Identifiant :");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEmail.setBounds(41, 92, 141, 22);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblMdp = new JLabel("Mot de passe :");
		lblMdp.setFont(new Font("Dialog", Font.BOLD, 18));
		lblMdp.setBounds(41, 152, 157, 22);
		frame.getContentPane().add(lblMdp);
		
	}
}
