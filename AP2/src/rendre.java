import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class rendre {

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
	 */
	public rendre() {
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
		
		JTextArea code = new JTextArea();
		code.setText("Code Barre :");
		code.setFont(new Font("Arial", Font.PLAIN, 17));
		code.setBackground(SystemColor.menu);
		code.setBounds(23, 69, 127, 22);
		frame.getContentPane().add(code);
		
		JTextArea txtrPageDe = new JTextArea();
		txtrPageDe.setText("Page de restitution");
		txtrPageDe.setFont(new Font("Arial", Font.PLAIN, 21));
		txtrPageDe.setBackground(SystemColor.menu);
		txtrPageDe.setBounds(154, 11, 216, 29);
		frame.getContentPane().add(txtrPageDe);
		
		ISBN = new JTextField();
		ISBN.setColumns(10);
		ISBN.setBackground(Color.WHITE);
		ISBN.setBounds(154, 72, 235, 22);
		frame.getContentPane().add(ISBN);
		
		JTextArea t = new JTextArea();
		t.setText("Emprunteur : ");
		t.setFont(new Font("Arial", Font.PLAIN, 17));
		t.setBackground(SystemColor.menu);
		t.setBounds(23, 102, 127, 22);
		frame.getContentPane().add(t);
		
		emprunteur = new JTextField();
		emprunteur.setColumns(10);
		emprunteur.setBackground(Color.WHITE);
		emprunteur.setBounds(154, 105, 235, 22);
		frame.getContentPane().add(emprunteur);
		
		JTextArea r = new JTextArea();
		r.setText("Titre : ");
		r.setFont(new Font("Arial", Font.PLAIN, 17));
		r.setBackground(SystemColor.menu);
		r.setBounds(23, 136, 92, 22);
		frame.getContentPane().add(r);
		
		JTextArea titre = new JTextArea();
		titre.setBackground(Color.WHITE);
		titre.setBounds(154, 138, 235, 22);
		frame.getContentPane().add(titre);
		
		JTextArea r2 = new JTextArea();
		r2.setText("Auteur : ");
		r2.setFont(new Font("Arial", Font.PLAIN, 17));
		r2.setBackground(SystemColor.menu);
		r2.setBounds(23, 169, 92, 22);
		frame.getContentPane().add(r2);
		
		JTextArea auteur = new JTextArea();
		auteur.setBackground(Color.WHITE);
		auteur.setBounds(154, 171, 235, 22);
		frame.getContentPane().add(auteur);
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(23, 216, 117, 37);
		frame.getContentPane().add(btnPrcedent);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(169, 216, 109, 36);
		frame.getContentPane().add(btnNewButton);
	}

}
