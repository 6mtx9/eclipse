import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ACCUEIL {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ACCUEIL window = new ACCUEIL();
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
	public ACCUEIL() {
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
		
		JButton creationclient = new JButton("Création Client");
		creationclient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CREATION_CLIENT creation_client= new CREATION_CLIENT();
				creation_client.main(null);
			}
		});
		creationclient.setBounds(115, 45, 215, 25);
		frame.getContentPane().add(creationclient);
		
		JButton gestionclient = new JButton("Gestion Client");
		gestionclient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GESTION_CLIENT gestion_client = new GESTION_CLIENT();
				gestion_client.main(null);
			}
		});
		gestionclient.setBounds(115, 90, 215, 25);
		frame.getContentPane().add(gestionclient);
		
		JButton creationcompte = new JButton("Création Compte");
		creationcompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CREATION_COMPTE creation_compte = new CREATION_COMPTE();
				creation_compte.main(null);
			}
		});
		creationcompte.setBounds(115, 135, 215, 25);
		frame.getContentPane().add(creationcompte);
		
		JButton gestioncompte = new JButton("Gestion Compte");
		gestioncompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GESTION_COMPTE gestion_compte = new GESTION_COMPTE();
				gestion_compte.main(null);
			}
		});
		gestioncompte.setBounds(115, 180, 215, 25);
		frame.getContentPane().add(gestioncompte);
	}
}
