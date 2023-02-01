package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;

import controller.mainMVC;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import model.ADHERENT;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Label;

import model.model;
import javax.swing.JLabel;

public class rendre {

	private JFrame frame;
	private JTextField ISBN;
	private final Label verif = new Label("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rendre window = new rendre();
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
	public rendre() throws SQLException {
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
		
		JTextArea code = new JTextArea();
		code.setEditable(false);
		code.setText("Code Barre :");
		code.setFont(new Font("Arial", Font.PLAIN, 22));
		code.setBackground(SystemColor.menu);
		code.setBounds(85, 180, 127, 22);
		frame.getContentPane().add(code);
		
		JTextArea txtrPageDe = new JTextArea();
		txtrPageDe.setEditable(false);
		txtrPageDe.setText("Page de restitution");
		txtrPageDe.setFont(new Font("Arial", Font.PLAIN, 25));
		txtrPageDe.setBackground(SystemColor.menu);
		txtrPageDe.setBounds(249, 63, 235, 29);
		frame.getContentPane().add(txtrPageDe);
		
		ISBN = new JTextField();
		ISBN.setFont(new Font("Tahoma", Font.PLAIN, 22));
		ISBN.setColumns(10);
		ISBN.setBackground(Color.WHITE);
		ISBN.setBounds(249, 175, 235, 37);
		frame.getContentPane().add(ISBN);
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPrcedent.setBounds(85, 340, 158, 44);
		frame.getContentPane().add(btnPrcedent);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					mainMVC.getM().retour(ISBN.getText());
					verif.setText("Le livre "+ISBN.getText()+" a bien été rendu.");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(311, 253, 109, 36);
		frame.getContentPane().add(btnNewButton);
		verif.setBounds(156, 98, 344, 29);
		frame.getContentPane().add(verif);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\Bibliothèque.jpg"));
		background.setBounds(0, -33, 692, 463);
		frame.getContentPane().add(background);
	}
}
