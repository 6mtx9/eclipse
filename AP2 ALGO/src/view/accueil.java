package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class accueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accueil window = new accueil();
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
	public accueil() {
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
		
		JButton info = new JButton("Vos informations");
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					vosinfo vca = new vosinfo();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		info.setBounds(27, 66, 183, 49);
		frame.getContentPane().add(info);
		
		JButton livre = new JButton("Vos livres empruntés");
		livre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listelivre vca = new listelivre();
			}
		});
		livre.setBounds(27, 153, 183, 49);
		frame.getContentPane().add(livre);
		
		JButton emprunter = new JButton("Emprunter");
		emprunter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emprunter vca = new emprunter();
			}
		});
		emprunter.setBounds(235, 66, 183, 49);
		frame.getContentPane().add(emprunter);
		
		JButton rendre = new JButton("Retour");
		rendre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rendre vca = new rendre();
			}
		});
		rendre.setBounds(235, 153, 183, 49);
		frame.getContentPane().add(rendre);
	}
}
