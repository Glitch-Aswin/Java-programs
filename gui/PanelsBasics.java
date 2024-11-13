import java.awt.*;
import javax.swing.*;

public class PanelsBasics {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("image.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(img);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        
        //JPanels = a GUI componenet that functions as a container for other GUI components
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());
        //if no layout is used for a component, the bound of the components have to be set
        
        

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(new BorderLayout());
        
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());
        
        JFrame jf = new JFrame();
        jf.setSize(750,750);
        jf.setLayout(null);
        jf.setTitle("GUI");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(redPanel);
        jf.add(bluePanel);
        jf.add(greenPanel);
        // redPanel.add(label);
        greenPanel.add(label);
        // bluePanel.add(label);
        //panels by default use flowLayoutManager, row vise addition


    }
}
