//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Scott Hiraki, Irene Fransiga, Mamadou Barry, Tanvir Singh, David Mkrtychyan
 * @version 0.1
 * This program makes a simple GUI that has a Menu item "About..." that when clicked, opens a new window and displays
 * our team name, group members, email, and website.
 */
public class Main {
    
    /**
     * Main to start off the program.
     * @param args
     */
    public static void main(String[] args) {
        
        //new Main();
        JFrame guiFrame = new JFrame();
        
        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("The Potato Squad");
        guiFrame.setSize(650, 650);
      
        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);
        //create menu bar at the top
        JMenuBar menuBar = new JMenuBar();
        
        JMenuItem about = new JMenuItem("About...");
        menuBar.add(about);
        //adds menubar to the jframe.
        guiFrame.add(menuBar, BorderLayout.NORTH);
        
        //The ActionListener class is used to handle the
        //event that happens when the user clicks the button.
        about.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
            	JOptionPane.showMessageDialog(guiFrame,
            		    "We are 'The Potato Squad'\nGroup Members:\n-------------\nIrene Fransiga"
            		    + "\nScott Hiraki\nDavid Mkrtychyan\nMamadou Barry\nTanvir Singh(Beni)\n"
        							+ "-------------\nEmail:\n"
        							+ "thepotatosquad05@gmail.com\nURL:\n"
        							+ "http://thepotatosquad.tk/",
            		    "A plain message",
            		    JOptionPane.PLAIN_MESSAGE);

            }
        });
        
        //make sure the JFrame is visible
        guiFrame.setVisible(true);
    }
    
}

