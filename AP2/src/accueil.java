import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
				
			}
		});
		info.setBounds(27, 66, 183, 49);
		frame.getContentPane().add(info);
		
		JButton livre = new JButton("Vos livres empruntés");
		livre.setBounds(27, 153, 183, 49);
		frame.getContentPane().add(livre);
		
		JButton emprunter = new JButton("Emprunter");
		emprunter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		emprunter.setBounds(235, 66, 183, 49);
		frame.getContentPane().add(emprunter);
		
		JButton rendre = new JButton("Retour");
		rendre.setBounds(235, 153, 183, 49);
		frame.getContentPane().add(rendre);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.setBounds(301, 12, 117, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
