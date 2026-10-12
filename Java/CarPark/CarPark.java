import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CarPark extends JFrame implements ActionListener
{
    private int carCount = 0;
    private int vanCount = 0;

    private final int MAX_CAPACITY = 20;

    private JButton enter, exit;
    private JButton enterVan, exitVan;

    private JTextField text;
    private JTextField textVan;
    private JTextField textMax;
    

    public static void main(String[] args)
    {
        CarPark frame = new CarPark();
        frame.setSize(700, 600);
        frame.setLocation(150, 150);
        frame.setTitle("Car Park");
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        // ----- CAR SECTION -----
        enter = new JButton("Car Entering");
        window.add(enter);
        enter.addActionListener(this);

        text = new JTextField("0        ");
        text.setFont(new Font("Arial", Font.BOLD, 40));
        text.setEditable(false);
        window.add(text);

        exit = new JButton("Car Exiting");
        window.add(exit);
        exit.addActionListener(this);

        window.add(new JLabel("     ")); // spacer

        // ----- VAN SECTION -----
        enterVan = new JButton("Van Entering");
        window.add(enterVan);
        enterVan.addActionListener(this);

        textVan = new JTextField("0      ");
        textVan.setFont(new Font("Arial", Font.BOLD, 40));
        textVan.setEditable(false);
        window.add(textVan);

        exitVan = new JButton("Van Exiting");
        window.add(exitVan);
        exitVan.addActionListener(this);
        
        window.add(new JLabel("          ")); //spacer
        
        // ----- DISPLAYS MAX -----
        textMax= new JTextField("Remaining spaces");
        textMax = new JTextField("0        ");
        //textMax.setText(Integer.toString(MAX_CAPACITY));
        textMax.setFont(new Font("Arial", Font.BOLD, 40));
        textMax.setEditable(false);
        window.add(textMax);
        
    }

    public void actionPerformed(ActionEvent event)
    {
        Object source = event.getSource();

        int totalVehicles = carCount + vanCount;
        int capacity = MAX_CAPACITY - totalVehicles;

        // ----- CAR ENTER -----
        if (source == enter && totalVehicles < MAX_CAPACITY)
        {
            carCount++;
        }

        // ----- CAR EXIT -----
        else if (source == exit && carCount > 0)
        {
            carCount--;
        }

        // ----- VAN ENTER -----
        else if (source == enterVan && totalVehicles < MAX_CAPACITY)
        {
            vanCount++;
        }

        // ----- VAN EXIT -----
        else if (source == exitVan && vanCount > 0)
        {
            vanCount--;
        }
    

        // Update display
        text.setText(Integer.toString(carCount));
        textVan.setText(Integer.toString(vanCount));
        textMax.setText(Integer.toString(capacity));
    }
}