
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener{
    
    //set buttons
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addBtn,subBtn,mulBtn,divBtn;
    JButton decBtn,equBtn,delBtn,clrBtn ;
    JPanel panel;
    
    double num1=0,num2=0,result=0;
    char operator;
    Calculator(){
        this.setDefaultCloseOperation(Calculator.EXIT_ON_CLOSE);
        this.setSize(420,550);
        this.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        this.add(textField);
        textField.setEditable(false);

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        decBtn = new JButton(".");
        equBtn = new JButton("=");
        delBtn = new JButton("del");
        clrBtn = new JButton("clr");

        functionButtons[0] = addBtn;
        functionButtons[1] = subBtn;
        functionButtons[2] = mulBtn;
        functionButtons[3] = divBtn;
        functionButtons[4] = decBtn;
        functionButtons[5] = equBtn;
        functionButtons[6] = delBtn;
        functionButtons[7] = clrBtn;

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFocusable(false);
        }
        for (int i = 0; i < 10; i++) {
            numberButtons[i]=new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
        }
        delBtn.setBounds(50,430,145,50);
        clrBtn.setBounds(200,430,145,50);

        this.add(delBtn);
        this.add(clrBtn);
        this.add(textField);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addBtn);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subBtn);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulBtn);
        panel.add(decBtn);
        panel.add(numberButtons[0]);
        panel.add(equBtn);
        panel.add(divBtn);
        
        this.add(panel);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if(e.getSource()== numberButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()== decBtn){
            textField.setText(textField.getText().concat("."));
        }
        if(e.getSource()== addBtn){
            num1 = Double.parseDouble(textField.getText());
            operator= '+';
            textField.setText("");

        }
        if(e.getSource()== subBtn){
            num1 = Double.parseDouble(textField.getText());
            operator= '-';
            textField.setText("");
        }
        if(e.getSource()== divBtn){
            num1 = Double.parseDouble(textField.getText());
            operator= '/';
            textField.setText("");
        }
        if(e.getSource()== mulBtn){
            num1 = Double.parseDouble(textField.getText());
            operator= '*';
            textField.setText("");
        }

        if(e.getSource()==equBtn){
            num2 = Double.parseDouble(textField.getText());

            switch(operator){
                case '+' -> {
                    result = num1 + num2;
                    break;
                }
                case '-' -> {
                    result = num1 - num2;
                    break;
                }
                case '*' -> {
                    result = num1 * num2;
                    break;
                }
                case '/' -> {
                    try {
                        if(num2==0){
                            throw new ArithmeticException("Dont divide by zero");
                            
                        }
                    }                        
                    catch (ArithmeticException err) {
                        System.err.println(err.getMessage()+" "+err);
                        textField.setText("");
                        break;
                    }
                    result = num1 / num2;
                    break;
                }
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if(e.getSource()== clrBtn){
            textField.setText("");
        }
        if(e.getSource()== delBtn){
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length()-1; i++) {
                textField.setText(textField.getText()+string.charAt(i));
            }
        }


    }
}


public class Lab2 {
    public static void main(String[] args) {
        new Calculator();
    }
}
