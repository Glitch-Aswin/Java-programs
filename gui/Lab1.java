import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ThreadA extends Thread{
    int count;
    ThreadA(int cou){
        this.count = cou; 
    }
    @Override
    public void run(){
        // for (int i = 0; i < count; i++) {
        //     System.out.println("Thrikkakara"+i);
        // }
        Lab1.print("Thrikkakara",count);
    }
}
class ThreadB extends Thread{
    int count;
    ThreadB(int cou){
        this.count = cou; 
    }
    @Override
    public void run(){
        // for (int i = 0; i < count; i++) {
        //     System.out.println("Kochi"+i);
        // }
        Lab1.print("Kochi",count);
    }
}

class AFrame extends JFrame implements ActionListener{
    JTextField txt = new JTextField(10);
    JButton btn = new JButton("PRINT");
    AFrame(){
        this.setSize(500,500);
        this.setBackground(Color.black);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.add(txt);
        this.add(btn);
        this.setDefaultCloseOperation(AFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        // btn.setEnabled(false);
        int count = Integer.parseInt(txt.getText());
        ThreadA t1 = new ThreadA(count);
        ThreadB t2 = new ThreadB(count);
        t1.start();
        t2.start();
    }
}

public class Lab1 {
    public static synchronized void print(String s,int count){
        for (int i = 0; i < count; i++) {
            System.out.println(s+i);
        }
    }
    public static void main(String[] args) {
        new AFrame();
    }
}
