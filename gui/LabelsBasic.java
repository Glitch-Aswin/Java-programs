import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;

public class LabelsBasic {

    public static void main(String[] args) {
        
        ImageIcon img = new ImageIcon("image.png");
        Border brdr = BorderFactory.createLineBorder(Color.green,3);
        JLabel label = new JLabel();
        label.setText("Bro, do you even code");
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(000255000));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        
        //By default it occupies the entire frame
        label.setBackground(Color.black);
        label.setOpaque(true);
        
        label.setBorder(brdr);
        //by default the position of the content in a label is on the horizontal left and vertical center of the label
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(250,250,350,350);
       
       
        JFrame jf = new JFrame();
        // jf.setSize(500,500);
        // jf.setLayout(null);
        jf.setTitle("GUI");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(label);
        jf.pack();
        //change icon Image
        jf.setIconImage(img.getImage());

    }
}
