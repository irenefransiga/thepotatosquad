import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Color;

public class SignUp {

	private JFrame frmThePotatoSquad;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private int TEST12; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frmThePotatoSquad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThePotatoSquad = new JFrame();
		frmThePotatoSquad.getContentPane().setBackground(Color.GRAY);
		frmThePotatoSquad.getContentPane().setForeground(Color.GRAY);
		frmThePotatoSquad.setTitle("The Potato Squad");
		frmThePotatoSquad.setBounds(100, 100, 833, 581);
		frmThePotatoSquad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThePotatoSquad.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up to Become a Potato");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(279, 39, 333, 63);
		frmThePotatoSquad.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(245, 147, 88, 29);
		frmThePotatoSquad.getContentPane().add(lblNewLabel_1);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(245, 197, 88, 29);
		frmThePotatoSquad.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(245, 250, 88, 29);
		frmThePotatoSquad.getContentPane().add(lblPassword);
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password:");
		lblReenterPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblReenterPassword.setBounds(245, 302, 151, 29);
		frmThePotatoSquad.getContentPane().add(lblReenterPassword);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(245, 176, 138, 22);
		frmThePotatoSquad.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(245, 226, 138, 22);
		frmThePotatoSquad.getContentPane().add(textArea_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(245, 279, 138, 22);
		frmThePotatoSquad.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(245, 331, 138, 22);
		frmThePotatoSquad.getContentPane().add(passwordField_1);
	}
}
