package view;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JMenuBar;

import model.ADHERENT;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listelivre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listelivre window = new listelivre();
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
	public listelivre() {
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
		
		
		List list = new List();
		list.setBounds(115, 63, 139, 72);
		frame.getContentPane().add(list);
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnPrcedent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPrcedent.setBounds(23, 216, 117, 37);
		frame.getContentPane().add(btnPrcedent);
	}
}
