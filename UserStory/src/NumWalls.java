import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextField;

public class NumWalls {

	private JFrame frmThePotatoSquad;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumWalls window = new NumWalls();
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
	public NumWalls() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThePotatoSquad = new JFrame();
		frmThePotatoSquad.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmThePotatoSquad.setTitle("The Potato Squad");
		frmThePotatoSquad.setBounds(100, 100, 871, 581);
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
		
		JButton btnNewButton = new JButton("Sign-In");
		btnNewButton.setBounds(756, 0, 97, 25);
		frmThePotatoSquad.getContentPane().add(btnNewButton);
		
		JButton btnNumberOfWalls = new JButton("Number of Walls");
		btnNumberOfWalls.setBounds(30, 69, 190, 72);
		frmThePotatoSquad.getContentPane().add(btnNumberOfWalls);
		
		JButton btnSelectStore = new JButton("Select Store");
		btnSelectStore.setEnabled(false);
		btnSelectStore.setBounds(30, 140, 190, 72);
		frmThePotatoSquad.getContentPane().add(btnSelectStore);
		
		JButton btnCalculator = new JButton("Calculator");
		btnCalculator.setEnabled(false);
		btnCalculator.setBounds(30, 211, 190, 72);
		frmThePotatoSquad.getContentPane().add(btnCalculator);
		
		JButton btnNewButton_1 = new JButton("Load");
		btnNewButton_1.setBounds(27, 437, 97, 25);
		frmThePotatoSquad.getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("Load");
		button.setBounds(123, 437, 97, 25);
		frmThePotatoSquad.getContentPane().add(button);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(272, 69, 532, 393);
		frmThePotatoSquad.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNumberOfWalls = new JLabel("Number of Walls:");
		lblNumberOfWalls.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNumberOfWalls.setBounds(12, 13, 162, 41);
		panel.add(lblNumberOfWalls);
		
		textField = new JTextField();
		textField.setBounds(172, 23, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.setEnabled(false);
		btnNext.setBounds(304, 22, 97, 25);
		panel.add(btnNext);
	}
}
