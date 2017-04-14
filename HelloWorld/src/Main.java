//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    
    //Note: Typically the main method will be in a
    //separate class. As this is a simple one class
    //example it's all in the one class.
    public static void main(String[] args) {
        
        //new Main();
        JFrame guiFrame = new JFrame();
        
        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("The Potato Squad");
        guiFrame.setSize(650, 650);
      
        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        ImageIcon icon = new ImageIcon("basket.png");
        JMenuItem about = new JMenuItem("About...");
        about.setIcon(icon);
        menuBar.add(about);
        
        guiFrame.add(menuBar, BorderLayout.NORTH);
        
        //The ActionListener class is used to handle the
        //event that happens when the user clicks the button.
        //As there is not a lot that needs to happen we can 
        //define an anonymous inner class to make the code simpler.
        about.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
            	
            	JOptionPane.showMessageDialog(guiFrame,
            		    "Members:"
            		    + "\nIrene Fransiga"
            		    + "\nScott Hiraki"
            		    + "\nDavid Mkrtychyan"
            		    + "\nMamadou Barry"
            		    + "\nTanvir Singh(Beni)"
            		    + "\n\n"
            		    + "\nEmail:"
            		    + "\nthepotatosquad05@gmail.com"
            		    + "\nURL:"
            		    + "\nhttp://thepotatosquad.tk/",
            		    "We are 'The Potato Squad'",
            		    JOptionPane.PLAIN_MESSAGE);
            }
        });
        
        //make sure the JFrame is visible
        guiFrame.setVisible(true);
    }
    
}

