package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class loginbibliothecaire {

	private JFrame frame;
	private JTextField mdp;
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
	 */
	public loginbibliothecaire() {
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
		
		mdp = new JTextField();
		mdp.setBounds(183, 146, 208, 28);
		frame.getContentPane().add(mdp);
		mdp.setColumns(10);
		
		login = new JTextField();
		login.setColumns(10);
		login.setBounds(183, 91, 208, 28);
		frame.getContentPane().add(login);
		
		JButton valider = new JButton("Valider");
		valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		valider.setFont(new Font("Dialog", Font.PLAIN, 17));
		valider.setBounds(249, 213, 117, 37);
		frame.getContentPane().add(valider);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEmail.setBounds(41, 92, 117, 22);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblMdp = new JLabel("mdp");
		lblMdp.setFont(new Font("Dialog", Font.BOLD, 18));
		lblMdp.setBounds(41, 152, 117, 22);
		frame.getContentPane().add(lblMdp);
		
	}
}
