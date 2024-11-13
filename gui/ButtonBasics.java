
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class BFrame extends JFrame implements ActionListener{
    JButton jbtn = new JButton("CLick me");
    BFrame(){        
        jbtn.setBounds(200,100,100,50) ;
        jbtn.addActionListener(this);
        jbtn.setFocusable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(jbtn);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jbtn){
            System.out.println("pew pew");
        }
    }
}

public class ButtonBasics {
    public static void main(String[] args) {
        new BFrame();
    }
}
