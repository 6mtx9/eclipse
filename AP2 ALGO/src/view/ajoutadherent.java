package view;
import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.mainMVC;
import model.model;

import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.ADHERENT;

public class ajoutadherent {

	private JFrame frame;
	private JTextField nom;
	private JTextField prenom;
	private JTextField email;
	private JTextField num;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajoutadherent window = new ajoutadherent();
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
	public ajoutadherent() {
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
		
		nom = new JTextField();
		nom.setBounds(167, 92, 238, 20);
		nom.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(nom);
		nom.setColumns(10);
		
		prenom = new JTextField();
		prenom.setBounds(167, 128, 238, 20);
		prenom.setFont(new Font("Arial", Font.PLAIN, 13));
		prenom.setColumns(10);
		frame.getContentPane().add(prenom);
		
		email = new JTextField();
		email.setBounds(167, 162, 238, 20);
		email.setFont(new Font("Arial", Font.PLAIN, 13));
		email.setColumns(10);
		frame.getContentPane().add(email);
		
		JTextArea txtrNom = new JTextArea();
		txtrNom.setEditable(false);
		txtrNom.setBounds(29, 94, 108, 22);
		txtrNom.setBackground(new Color(240, 240, 240));
		txtrNom.setText("Nom :");
		txtrNom.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(txtrNom);
		
		JTextArea txtrPrenom = new JTextArea();
		txtrPrenom.setEditable(false);
		txtrPrenom.setBounds(29, 130, 108, 22);
		txtrPrenom.setBackground(new Color(240, 240, 240));
		txtrPrenom.setText("Prenom  :");
		txtrPrenom.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(txtrPrenom);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setEditable(false);
		txtrEmail.setBounds(27, 164, 108, 22);
		txtrEmail.setBackground(new Color(240, 240, 240));
		txtrEmail.setText("Email :");
		txtrEmail.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(txtrEmail);
		
		JTextArea txtrPageDajoutAdhrent = new JTextArea();
		txtrPageDajoutAdhrent.setBounds(118, 11, 238, 37);
		txtrPageDajoutAdhrent.setBackground(new Color(240, 240, 240));
		txtrPageDajoutAdhrent.setText("Page d'ajout adhérent");
		txtrPageDajoutAdhrent.setFont(new Font("Arial", Font.PLAIN, 21));
		frame.getContentPane().add(txtrPageDajoutAdhrent);
		
		JTextArea txtrEmail_1 = new JTextArea();
		txtrEmail_1.setEditable(false);
		txtrEmail_1.setBounds(29, 60, 117, 22);
		txtrEmail_1.setText("Numéro adhérent : ");
		txtrEmail_1.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrEmail_1.setBackground(new Color(243, 243, 243));
		frame.getContentPane().add(txtrEmail_1);
		
		num = new JTextField();
		num.setBounds(167, 60, 238, 20);
		frame.getContentPane().add(num);
		num.setColumns(10);
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(20, 213, 117, 37);
		frame.getContentPane().add(btnPrcedent);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num.getText()!=null && nom.getText()!=null && prenom.getText()!=null && email.getText()!=null) {
					
					try {
						mainMVC.getM().creationAdherent(num.getText(),nom.getText(),prenom.getText(),email.getText());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					nom.setText(null);
					prenom.setText(null);
					email.setText(null);
					num.setText(null);
					
				}
				
			}
		});
		btnNewButton.setBounds(171, 213, 108, 37);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(btnNewButton);
	}
}
