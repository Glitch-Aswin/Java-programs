
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyFrame extends JFrame {
    MyFrame(){
        this.setSize(420,420);
        this.setTitle("GUI");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        //change icon Image
        ImageIcon img = new ImageIcon("D:\\Dev\\java2\\WhatsApp Image 2024-09-20 at 6.24.06 PM.jpeg");
        this.setIconImage(img.getImage());

        //change bg
        this.getContentPane().setBackground(new Color(200,25,50)); //
        
    }
}
