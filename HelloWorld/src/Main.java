/*
 * TCSS360
 * Iteration 1
 */
//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This program makes a simple GUI that has a Menu item "About..." that when clicked, opens a new window and displays
 * our team name, group members, email, and website.
 * 
 * @author Scott Hiraki, Irene Fransiga, Mamadou Barry, Tanvir Singh, David Mkrtychyan
 * @version April 2017
 */
public class Main {
	/** myFrame. **/
    public static JFrame myFrame = new JFrame();
    /**
     * Main to start off the program.
     * @param args
     */
    public static void main(String[] args) {
        
        //make sure the program exits when the frame closes
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("The Potato Squad");
        myFrame.setSize(650, 650);
      
        //This will center the JFrame in the middle of the screen
        myFrame.setLocationRelativeTo(null);
        myFrame.setJMenuBar(createMenuBar());
        
        //make sure the JFrame is visible
        myFrame.setVisible(true);
    }
    /**
     * Create a menubar to be placed as JMenuBar of myFrame.
     * @return menuBar the menuBar consist of JMenu and/or JMenuItem
     */
    public static JMenuBar createMenuBar(){
    	final JMenuBar menuBar = new JMenuBar();
    	menuBar.add(createAbout());
        return menuBar;
    }
    /**
     * Create a menuItem of "About...".
     * the About will be information about our group.
     * @return aboutMenu that is basically a button of JMenuItem
     */
    public static JMenuItem createAbout(){
    	final ImageIcon aboutIcon = new ImageIcon("basket.png");
    	final JMenuItem aboutMenu = new JMenuItem("About...", aboutIcon);
    	//The ActionListener class is used to handle the
        //event that happens when the user clicks the button.
    	aboutMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event){
            	JOptionPane.showMessageDialog(myFrame,
            		    "Members:"
            		    + "\nIrene Fransiga\nScott Hiraki"
            		    + "\nDavid Mkrtychyan\nMamadou Barry"
            		    + "\nTanvir Singh(Beni)\n"
            		    + "\nEmail:\nthepotatosquad05@gmail.com"
            		    + "\nURL:\nhttp://thepotatosquad.tk/",
            		    "We are 'The Potato Squad'",
            		    JOptionPane.PLAIN_MESSAGE);
            }
        });
    	return aboutMenu;
    }
    
}

