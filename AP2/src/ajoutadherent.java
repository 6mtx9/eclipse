import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ajoutadherent {

	private JFrame frame;
	private JTextField nom;
	private JTextField prenom;
	private JTextField email;
	private JTextField num;
	private JLabel label;
	ADHERENT adherent;

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
	 */
	public ajoutadherent() {
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
		
		nom = new JTextField();
		nom.setBounds(147, 81, 238, 20);
		nom.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(nom);
		nom.setColumns(10);
		
		prenom = new JTextField();
		prenom.setBounds(147, 118, 238, 20);
		prenom.setFont(new Font("Arial", Font.PLAIN, 13));
		prenom.setColumns(10);
		frame.getContentPane().add(prenom);
		
		email = new JTextField();
		email.setBounds(147, 149, 238, 20);
		email.setFont(new Font("Arial", Font.PLAIN, 13));
		email.setColumns(10);
		frame.getContentPane().add(email);
		
		JTextArea txtrNom = new JTextArea();
		txtrNom.setBounds(29, 81, 108, 22);
		txtrNom.setBackground(new Color(240, 240, 240));
		txtrNom.setText("Nom :");
		txtrNom.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(txtrNom);
		
		JTextArea txtrPrenom = new JTextArea();
		txtrPrenom.setBounds(29, 114, 108, 22);
		txtrPrenom.setBackground(new Color(240, 240, 240));
		txtrPrenom.setText("Prenom  :");
		txtrPrenom.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(txtrPrenom);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setBounds(29, 147, 108, 22);
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
		txtrEmail_1.setBounds(29, 180, 117, 22);
		txtrEmail_1.setText("Numéro adhérent : ");
		txtrEmail_1.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrEmail_1.setBackground(new Color(243, 243, 243));
		frame.getContentPane().add(txtrEmail_1);
		
		num = new JTextField();
		num.setBounds(147, 182, 238, 20);
		frame.getContentPane().add(num);
		num.setColumns(10);
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(20, 213, 117, 37);
		frame.getContentPane().add(btnPrcedent);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num.getText()!=null) {
					
					adherent = new ADHERENT (nom.getText(),prenom.getText(),email.getText(),num.getText());
					nom.setText(null);
					prenom.setText(null);
					email.setText(null);
					num.setText(null);
					
				}
				/*else {
					int min = 111111111;
					int max = 999999999;
					//Generate random int value from 111111111 to 999999999
					int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
					String random_text=String.valueOf(random_int);
					adherent1 = new ADHERENT (nom.getText(),prenom.getText(),email.getText(),random_text);
				}*/
			}
		});
		btnNewButton.setBounds(171, 213, 108, 37);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(btnNewButton);
	}
}
