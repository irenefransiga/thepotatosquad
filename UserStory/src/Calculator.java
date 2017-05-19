import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Calculator {

	private JFrame frmThePotatoSquad;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThePotatoSquad = new JFrame();
		frmThePotatoSquad.setTitle("The Potato Squad");
		frmThePotatoSquad.setBounds(100, 100, 868, 571);
		frmThePotatoSquad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmThePotatoSquad.setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenu mnProjects = new JMenu("Projects");
		menuBar.add(mnProjects);
		
		JMenu mnSupport = new JMenu("Support");
		menuBar.add(mnSupport);
		frmThePotatoSquad.getContentPane().setLayout(null);
		
		JButton btnSignin = new JButton("Sign-In");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignin.setBounds(753, 0, 97, 25);
		frmThePotatoSquad.getContentPane().add(btnSignin);
		
		JButton button = new JButton("Number of Walls");
		button.setBounds(43, 70, 190, 72);
		frmThePotatoSquad.getContentPane().add(button);
		
		JButton btnSelectStore = new JButton("Select Store");
		btnSelectStore.setBounds(43, 142, 190, 72);
		frmThePotatoSquad.getContentPane().add(btnSelectStore);
		
		JButton btnCalculator = new JButton("Calculator");
		btnCalculator.setBounds(43, 214, 190, 72);
		frmThePotatoSquad.getContentPane().add(btnCalculator);
		
		JButton button_1 = new JButton("Load");
		button_1.setEnabled(false);
		button_1.setBounds(43, 404, 97, 25);
		frmThePotatoSquad.getContentPane().add(button_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(141, 404, 97, 25);
		frmThePotatoSquad.getContentPane().add(btnSave);
	}
}