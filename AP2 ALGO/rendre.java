package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;

import controller.mainMVC;

import java.awt.Color;
import javax.swing.JButton;

import model.ADHERENT;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Label;

import model.model;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea code = new JTextArea();
		code.setEditable(false);
		code.setText("Code Barre :");
		code.setFont(new Font("Arial", Font.PLAIN, 17));
		code.setBackground(SystemColor.menu);
		code.setBounds(23, 119, 127, 22);
		frame.getContentPane().add(code);
		
		JTextArea txtrPageDe = new JTextArea();
		txtrPageDe.setEditable(false);
		txtrPageDe.setText("Page de restitution");
		txtrPageDe.setFont(new Font("Arial", Font.PLAIN, 21));
		txtrPageDe.setBackground(SystemColor.menu);
		txtrPageDe.setBounds(120, 11, 216, 29);
		frame.getContentPane().add(txtrPageDe);
		
		ISBN = new JTextField();
		ISBN.setColumns(10);
		ISBN.setBackground(Color.WHITE);
		ISBN.setBounds(165, 120, 235, 22);
		frame.getContentPane().add(ISBN);
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(23, 216, 117, 37);
		frame.getContentPane().add(btnPrcedent);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					mainMVC.getM().retour(ISBN.getText());
					verif.setText("Le livre "+ISBN.getText()+" a bien été rendu.");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(169, 216, 109, 36);
		frame.getContentPane().add(btnNewButton);
		verif.setBounds(56, 46, 344, 29);
		frame.getContentPane().add(verif);
	}

}
