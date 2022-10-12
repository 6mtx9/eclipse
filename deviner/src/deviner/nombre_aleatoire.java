package deviner;
import java.util.Random;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class nombre_aleatoire {

	private JFrame frame;
	private JTextField entree;
	private int tentativenombre;
	private int min = 1;
	private int max = 100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nombre_aleatoire window = new nombre_aleatoire();
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
	public nombre_aleatoire() {
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
		

		JTextArea txtrDevineLeNombre = new JTextArea();
		txtrDevineLeNombre.setBackground(new Color(238, 238, 236));
		txtrDevineLeNombre.setFont(new Font("Dialog", Font.PLAIN, 19));
		txtrDevineLeNombre.setText("Devine le nombre :");
		txtrDevineLeNombre.setBounds(42, 107, 176, 30);
		frame.getContentPane().add(txtrDevineLeNombre);
		
		JTextArea txtrNombreDeTentative = new JTextArea();
		txtrNombreDeTentative.setBackground(new Color(238, 238, 236));
		txtrNombreDeTentative.setFont(new Font("Dialog", Font.PLAIN, 19));
		txtrNombreDeTentative.setText("Nombre de tentative :");
		txtrNombreDeTentative.setBounds(42, 31, 215, 25);
		frame.getContentPane().add(txtrNombreDeTentative);
		
		JTextArea tentative = new JTextArea();
		tentative.setFont(new Font("Dialog", Font.PLAIN, 19));
		tentative.setBackground(new Color(238, 238, 236));
		tentative.setBounds(261, 31, 55, 25);
		frame.getContentPane().add(tentative);
		
		JTextArea texte = new JTextArea();
		texte.setBackground(new Color(238, 238, 236));
		texte.setBounds(49, 185, 345, 30);
		frame.getContentPane().add(texte);
		
		
		tentativenombre = 0;
		int d = new Random().nextInt(max - min) + min;
		
		
		entree = new JTextField();
		entree.setBounds(230, 106, 117, 30);
		frame.getContentPane().add(entree);
		entree.setColumns(10);
		
		JButton button = new JButton("Entrer");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				tentativenombre= tentativenombre + 1;
				
				if (Integer.parseInt(entree.getText())==d) {
					texte.setText("gagné");
				}
				else if (Integer.parseInt(entree.getText())<d) {
					texte.setText("Raté : le nombre à deviner est + grand !");
				}
				else if (Integer.parseInt(entree.getText())>d) {
					texte.setText("Raté : le nombre à deviner est + petit !");
				}
				String resultat1=String.valueOf(tentativenombre);
				tentative.setText(resultat1);
			}
		});
		button.setBounds(230, 148, 117, 25);
		frame.getContentPane().add(button);
		
		JButton reset = new JButton("Recommencer");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texte.setText(null);
				tentative.setText(null);
				entree.setText(null);
				tentativenombre = 0;
				frame.setVisible(false); 
				frame.setVisible(true); 
				
			}
		});
		reset.setBounds(283, 227, 153, 25);
		frame.getContentPane().add(reset);
		
		
	}
}
