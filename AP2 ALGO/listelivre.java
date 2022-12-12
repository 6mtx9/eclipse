package view;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

import controller.mainMVC;

import javax.swing.JList;
import javax.swing.JMenuBar;

import model.ADHERENT;
import model.LIVRE;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JLabel;

public class listelivre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listelivre window = new listelivre();
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
	public listelivre() throws SQLException {
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
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(23, 216, 117, 37);
		frame.getContentPane().add(btnPrcedent);
		
		JLabel lblListeDesLivres = new JLabel("Liste des livres");
		lblListeDesLivres.setBounds(162, 12, 117, 36);
		frame.getContentPane().add(lblListeDesLivres);
		
		List tableauliste = new List();
		tableauliste.setBounds(63, 54, 318, 148);
		frame.getContentPane().add(tableauliste);
		
		for (int i=0;i!=mainMVC.getM().getListLivre().size();i++) {
			tableauliste.add("ISBN : "+mainMVC.getM().getListLivre().get(i).getISBN()+" Titre : "+mainMVC.getM().getListLivre().get(i).getTitre()+" Prix : "+mainMVC.getM().getListLivre().get(i).getPrix());
		}
	}
}
