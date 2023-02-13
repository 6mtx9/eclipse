package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.mainMVC;
import model.ADHERENT;
import model.EMPRUNTER;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JTextField;

public class historique {

	private JFrame frame;
	private JTextField entree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					historique window = new historique();
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
	public historique() {
		try {
			mainMVC.getM().getAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 710, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		List list = new List();
		list.setBackground(new Color(255, 228, 181));
		list.setBounds(60, 40, 411, 307);
		frame.getContentPane().add(list);
		
		JButton btnPrcedent = new JButton("");
		btnPrcedent.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\precedent.png"));
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPrcedent.setBounds(60, 353, 167, 51);
		frame.getContentPane().add(btnPrcedent);
		btnPrcedent.setOpaque(false);
		btnPrcedent.setBorderPainted(false);
		
		entree = new JTextField();
		entree.setBackground(new Color(250, 235, 215));
		entree.setFont(new Font("Dialog", Font.PLAIN, 18));
		entree.setBounds(528, 150, 137, 43);
		frame.getContentPane().add(entree);
		entree.setColumns(10);
		
		JButton valider = new JButton("");
		valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADHERENT adherent = mainMVC.getM().findadherent(entree.getText());
				for (EMPRUNTER element : adherent.getHistorique()) {
					list.add("ISBN : "+element.getLivre().getISBN()+" Titre : "+element.getLivre().getTitre()+" Date début : "+element.getDateD()+" Date fin : "+element.getDateF());
				}
				valider.setEnabled(false);
			}
		});
		valider.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\valider.png"));
		valider.setBounds(528, 224, 137, 43);
		frame.getContentPane().add(valider);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\Bibliothèque.jpg"));
		background.setBounds(0, 0, 694, 431);
		frame.getContentPane().add(background);
		
		
	}
}
