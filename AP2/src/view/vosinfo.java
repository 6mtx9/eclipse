package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.event.CaretListener;

import model.LIVRE;

import javax.swing.event.CaretEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

public class vosinfo {

	private JFrame frame;

	private static String password="";
	private static String username="root";
	private static Connection connection;
	private static Statement command;
	private static ResultSet data;
	static String BDD = "AP2prof";
	private static String connectionString = "jdbc:mysql://localhost:3306/"+BDD;

	private ArrayList <LIVRE> listelivres; // LISTE LIVRES
	
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

		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("Erreur");
			}
			// System.out.println(connectionString+"-"+username+"-"+password); IMPRESSION url / username / password

			connection = DriverManager.getConnection(connectionString,username,password);
			command = connection.createStatement();
			//command.execute("INSERT INTO `PERSONNE` (`id`, `nom`, `prenom`, `age`) VALUES ('9', 'da', 'prenom', '10');");
			String requete = "SELECT * FROM livre";
			data = command.executeQuery(requete);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erreur");
		} finally {
			// System.out.println("1");
			try {
				ArrayList <LIVRE> listelivre;
				listelivre = new ArrayList<LIVRE>();
				LIVRE livre;
				while (data.next()) {
					System.out.println("ISBN : "+data.getString(1));
					System.out.println("titre : "+data.getString(2));
					System.out.println("prix : "+data.getFloat(3));
					// LIVRE livre = "livre"+data.getString(1);
					// System.out.println(livre);
					livre = new LIVRE (data.getString(1),data.getString(2),data.getFloat(3));
					listelivre.add(livre);
					for (int i=0;i<listelivre.size();i++) {
						System.out.println(listelivre.get(i).getISBN()+" "+listelivre.get(i).getTitre()+" "+listelivre.get(i).getPrix()+" "+listelivre.get(i).getAuteur()+" "+listelivre.get(i).getEmprunteur());
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Erreur");
			}
		}
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
