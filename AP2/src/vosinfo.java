import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

public class vosinfo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vosinfo window = new vosinfo();
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
	public vosinfo() {
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
		btnPrcedent.setBounds(0, 243, 448, 30);
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		frame.getContentPane().add(btnPrcedent);
		
		JButton btnPrcedent_1 = new JButton("Précedent");
		btnPrcedent_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent_1.setBounds(48, 176, 117, 37);
		frame.getContentPane().add(btnPrcedent_1);
		
		JTextArea txtrNom = new JTextArea();
		txtrNom.setText("Nom :");
		txtrNom.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtrNom.setBackground(new Color(240, 240, 240));
		txtrNom.setBounds(34, 44, 108, 22);
		frame.getContentPane().add(txtrNom);
		
		JTextArea txtrPrnom = new JTextArea();
		txtrPrnom.setText("Prénom :");
		txtrPrnom.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtrPrnom.setBackground(new Color(240, 240, 240));
		txtrPrnom.setBounds(34, 78, 108, 22);
		frame.getContentPane().add(txtrPrnom);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("Email :");
		txtrEmail.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtrEmail.setBackground(new Color(240, 240, 240));
		txtrEmail.setBounds(34, 112, 108, 22);
		frame.getContentPane().add(txtrEmail);
		
		JTextArea txtrNumroAdhrent = new JTextArea();
		txtrNumroAdhrent.setText("Numéro adhérent :");
		txtrNumroAdhrent.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtrNumroAdhrent.setBackground(new Color(240, 240, 240));
		txtrNumroAdhrent.setBounds(34, 142, 131, 22);
		frame.getContentPane().add(txtrNumroAdhrent);
		
		JTextArea txtrVosInformations = new JTextArea();
		txtrVosInformations.setBackground(new Color(243, 243, 243));
		txtrVosInformations.setFont(new Font("Dialog", Font.PLAIN, 21));
		txtrVosInformations.setText("Vos informations");
		txtrVosInformations.setBounds(121, 2, 232, 30);
		frame.getContentPane().add(txtrVosInformations);
		
		JTextArea nom = new JTextArea();
		nom.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				
			}
		});
		nom.setBounds(182, 45, 209, 21);
		frame.getContentPane().add(nom);
		
		JTextArea prenom = new JTextArea();
		prenom.setBounds(182, 79, 209, 21);
		frame.getContentPane().add(prenom);
		
		JTextArea email = new JTextArea();
		email.setBounds(182, 113, 209, 21);
		frame.getContentPane().add(email);
		
		JTextArea num = new JTextArea();
		num.setBounds(182, 143, 209, 21);
		frame.getContentPane().add(num);
	}
}
