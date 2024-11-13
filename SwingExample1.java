import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JFrame implements ActionListener{
	Container c;
	JLabel label0 = new JLabel("CLICK THE COLOR");
	// JTextField jft = new JTextField(20);
	TrafficLight(){
		c = getContentPane();
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,300);
		JRadioButton r1,r2,r3;
		JLabel label = new JLabel("CLICK THE LIGHT!");
		r1 = new JRadioButton("RED");
		r2 = new JRadioButton("ORANGE");
		r3 = new JRadioButton("GREEN");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1); bg.add(r2); bg.add(r3);
		c.add(label); c.add(r1); c.add(r2); c.add(r3); c.add(label0);
		//c.add(jft);
		c.setBackground(Color.white);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
	}
	String msg = "";
	public void actionPerformed(ActionEvent ie){
		msg = ie.getActionCommand();

		if(msg.equals("RED")){
			c.setBackground(Color.red);
			label0.setText("CONGRATS YOU SELECTED RED, NOW STOP YOUR DAMN VEHICLE");
		}else if(msg.equals("GREEN")){
			c.setBackground(Color.green);
			label0.setText("CONGRATS YOU SELECTED GREEN, NOW MOVE YOUR DAMN VEHICLE");
		}else{
			c.setBackground(Color.orange);
			label0.setText("CONGRATS YOU SELECTED ORANGE, NOW START YOUR DAMN VEHICLE");
		}

	}
	
}

public class SwingExample1{

	public static void main(String args[]){
		TrafficLight tl = new TrafficLight();
		tl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
