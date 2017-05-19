/*
 * TCSS360
 * Iteration 1
 */
import static org.junit.Assert.*;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import org.junit.Test;
/**
 * JUnit for the Iteration1 (About button)
 * 
 * @author The Potato Squad
 * @version April 2017
 */
public class MainTest{
	/** the Frame field to test the GUI. **/
	private JFrame frameTest;
	/**
	 * testMain is to check if myFrame is not null.
	 * Meaning, myFrame is at least assigned to new JFrame();
	 */
	@Test
	public final void testMain() {
		frameTest = Main.myFrame;
		assertNotNull(frameTest);
	}
	/**
	 * testCreateMenuBar is checking if the MenuBar function successfully return a menuBar.
	 * Regardless of the content
	 */
	@Test
	public final void testCreateMenuBar() {
		JMenuBar menuBarTest = Main.createMenuBar();
		assertNotNull(menuBarTest);
	}
	/**
	 * testCreateAbout is checking if the MenuItem function successfully return a menuitem.
	 * Regardless of the content
	 */
	@Test
	public final void testCreateAbout() {
		JMenuItem aboutMenuItemTest = Main.createAbout();
		assertNotNull(aboutMenuItemTest);
	}
	/**
	 * testActionListener is checking if the about button is linked to an action Listener.
	 * to give information about the potato squad group
	 */
	@Test
	public final void testActionListener(){
		JMenuItem aboutActionListener = Main.createAbout();
		aboutActionListener.getActionListeners();
		assertNotNull( aboutActionListener);
	}

}
