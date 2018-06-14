
/*
 * NAME: KRIS TRINIDAD
 * COURSE: PROGRAMMING (JAVA 2)
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ConferenceClient extends JApplet
{
    private ConferenceGUI gui;
    private Container c = getContentPane();
    
    private final int WIDTH = 700;
    private final int HEIGHT = 250;
    
     public ConferenceClient()
    {
	        gui = new ConferenceGUI();
	        getContentPane();
	        setLayout(new BorderLayout());
	        add(gui, BorderLayout.CENTER);
	        init();
	        
	        //sets the size of the window
	        setSize(WIDTH, HEIGHT);
	        setVisible(true);
	        destroy();
	    }
	     
	    public static void main(String[]args)
	    {
	        //Create Conference Client Object
	        ConferenceClient client = new ConferenceClient();
	    }
    
   
   
   
}