package calculette;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class simplifiee {

	private JFrame frame;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private int bouton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simplifiee window = new simplifiee();
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
	public simplifiee() {
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
		
		a = new JTextField();
		a.setBounds(12, 70, 91, 30);
		frame.getContentPane().add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(156, 70, 91, 30);
		frame.getContentPane().add(b);
		
		
		button_1 = new JButton("+"); // BOUTON +
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_1.setBackground(Color.yellow);
				button_2.setBackground(Color.gray);
				button_3.setBackground(Color.gray);
				button_4.setBackground(Color.gray);
				bouton =1;
				
			}
		});
		button_1.setBounds(100, 72, 54, 25);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("-"); // BOUTON -
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_2.setBackground(Color.yellow);
				button_1.setBackground(Color.gray);
				button_3.setBackground(Color.gray);
				button_4.setBackground(Color.gray);
				bouton =2;
			}
		});
		button_2.setBounds(100, 112, 54, 25);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("/"); // BOUTON /
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_3.setBackground(Color.yellow);
				button_2.setBackground(Color.gray);
				button_1.setBackground(Color.gray);
				button_4.setBackground(Color.gray);
				bouton =3;
			}
		});
		button_3.setBounds(100, 149, 54, 25);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("*"); // BOUTON *
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_4.setBackground(Color.yellow);
				button_3.setBackground(Color.gray);
				button_2.setBackground(Color.gray);
				button_1.setBackground(Color.gray);
				bouton =4;
			}
		});
		button_4.setBounds(100, 186, 54, 25);
		frame.getContentPane().add(button_4);
		
		JButton button = new JButton("=");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (bouton==1) {
					int resultat=Integer.parseInt(a.getText())+Integer.parseInt(b.getText()); // ADDITION
					String resultat1=String.valueOf(resultat);
					c.setText(resultat1);
				}
				else if (bouton==2) {
					int resultat=Integer.parseInt(a.getText())-Integer.parseInt(b.getText()); // SOUSTRACTION
					String resultat1=String.valueOf(resultat);
					c.setText(resultat1);
				}
				else if (bouton==3) {
					int resultat=Integer.parseInt(a.getText())/Integer.parseInt(b.getText()); // DIVISION
					String resultat1=String.valueOf(resultat);
					c.setText(resultat1);
				}
				else if (bouton==4) {
					int resultat=Integer.parseInt(a.getText())*Integer.parseInt(b.getText()); // MULTIPLICATION
					String resultat1=String.valueOf(resultat);
					c.setText(resultat1);
				}
			

				// System.out.println(resultat);
				
			}
		});
		button.setBounds(259, 72, 74, 25);
		frame.getContentPane().add(button);
		
		c = new JTextField();
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		c.setColumns(10);
		c.setBounds(345, 70, 91, 30);
		frame.getContentPane().add(c);
		
	}
	
	
}
