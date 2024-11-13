import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lol extends JFrame implements ActionListener{
    JButton btn ;
    JTextField input;
    JTextField outmin;
    JTextField outplus;
    Lol(){
        this.setSize(500,500);
        this.setTitle("Poda");
        this.setVisible(true);
        this.setLayout(new GridLayout(4,1,10,10));
        this.setDefaultCloseOperation(Lol.EXIT_ON_CLOSE);

        btn = new JButton("GOOOO!");
        btn.setSize(20,40);
        btn.setFocusable(false);
        btn.addActionListener(this);

        outplus = new JTextField(16);
        outmin= new JTextField(16);
        input= new JTextField(16);

        JPanel panel = new JPanel();
        panel.add(btn);

        panel.add(input);
        panel.add(outmin);
        panel.add(outplus);

        this.add(panel);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int i = Integer.parseInt(input.getText());
        outmin.setText(String.valueOf(i-1));
        outplus.setText(String.valueOf(i+1));
    }

}


public class Lab3 {
    public static void main(String[] args) {
        new Lol();
    }
}
