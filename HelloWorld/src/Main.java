//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    
    //Note: Typically the main method will be in a
    //separate class. As this is a simple one class
    //example it's all in the one class.
    public static void main(String[] args) {
        
        new Main();
    }

    public Main()
    {
        JFrame guiFrame = new JFrame();
        
        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("The Potato Squad");
        guiFrame.setSize(650, 650);
      
        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);
        

        //Create the second JPanel. Add a JLabel and JList and
        //make use the JPanel is not visible.
        final JPanel listPanel = new JPanel();
        listPanel.setVisible(false);
        JLabel aboutList = new JLabel("<html>We are 'The Potato Squad'<br><br>Group Members:<br>-------------<br>Irene Fransiga<br>"
        							+ "Scott Hiraki<br>David Mkrtychyan<br>Mamadou Barry<br>Tanvir Singh(Beni)<br>"
        							+ "-------------<br>Email:<br>"
        							+ "thepotatosquad05@gmail.com<br>URL:<br>"
        							+ "http://thepotatosquad.tk/</html>", SwingConstants.CENTER);
          
        listPanel.add(aboutList);

        JMenuBar menuBar = new JMenuBar();
        
        JMenu about = new JMenu("Menu");
        menuBar.add(about);
        JMenuItem aboutItem = new JMenuItem("About...");
        about.add(aboutItem);
        
        guiFrame.add(menuBar, BorderLayout.NORTH);
        
        JButton aboutButton = new JButton( "About...");
        
        //The ActionListener class is used to handle the
        //event that happens when the user clicks the button.
        //As there is not a lot that needs to happen we can 
        //define an anonymous inner class to make the code simpler.
        aboutButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
               listPanel.setVisible(!listPanel.isVisible());
               //comboPanel.setVisible(!comboPanel.isVisible());

            }
        });
        
        //The JFrame uses the BorderLayout layout manager.
        //Put the two JPanels and JButton in different areas.
        //guiFrame.add(comboPanel, BorderLayout.NORTH);
        guiFrame.add(listPanel, BorderLayout.CENTER);
        guiFrame.add(aboutButton,BorderLayout.SOUTH);
        
        //make sure the JFrame is visible
        guiFrame.setVisible(true);
    }
    
}

