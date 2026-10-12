import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This program displays an empty frame.
 */
public class SimpleFrame extends JFrame
{

    /**
     * The main launcher method
     */
    public static void main(String[] args)
    {
        SimpleFrame frame = new SimpleFrame();

        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("A not so empty frame");

        frame.createGUI();
        
        frame.setVisible(true);
        
    }

    /**
     * This method sets up the graphical user interface.
     */
    private void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        // Nothing in the window yet!
    }

}
