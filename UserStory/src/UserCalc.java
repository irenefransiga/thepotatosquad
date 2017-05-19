import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class UserCalc {

	private JFrame frmThePotatoSquad;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserCalc window = new UserCalc();
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
	public UserCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThePotatoSquad = new JFrame();
		frmThePotatoSquad.setTitle("The Potato Squad");
		frmThePotatoSquad.getContentPane().setBackground(Color.GRAY);
		frmThePotatoSquad.setBounds(100, 100, 800, 500);
		frmThePotatoSquad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThePotatoSquad.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frmThePotatoSquad.setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenu mnProjects = new JMenu("Projects");
		menuBar.add(mnProjects);
		
		JMenu mnSupport = new JMenu("Support");
		menuBar.add(mnSupport);
		frmThePotatoSquad.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(360, 179, 138, 22);
		frmThePotatoSquad.getContentPane().add(passwordField);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(360, 150, 138, 22);
		frmThePotatoSquad.getContentPane().add(textArea);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setBackground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setBounds(251, 152, 97, 16);
		frmThePotatoSquad.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(251, 181, 85, 16);
		frmThePotatoSquad.getContentPane().add(lblPassword);
		
		JLabel lblLogin = new JLabel("Members Login");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblLogin.setBounds(261, 42, 268, 54);
		frmThePotatoSquad.getContentPane().add(lblLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(442, 214, 97, 25);
		frmThePotatoSquad.getContentPane().add(btnLogin);
		
		JButton btnSignup = new JButton("Sign-up");
		btnSignup.setBounds(333, 214, 97, 25);
		frmThePotatoSquad.getContentPane().add(btnSignup);
	}
}
