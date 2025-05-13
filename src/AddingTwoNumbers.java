import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddingTwoNumbers {

    public static void main(String[] args) {
        Addition addObj=new Addition();
    }
}

class Addition extends JFrame implements ActionListener {
    JTextField number1 ;
    JTextField number2 ;
    JButton button1 ;
    JLabel label1 ;
    public Addition(){

      number1= new JTextField(20);
      number2= new JTextField(20);
      button1= new JButton("Ok");
      label1= new JLabel("Result");

        add(number1);
        add(number2);
        add(button1);
        add(label1);


        button1.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int number_1= Integer.parseInt(number1.getText());
        int number_2= Integer.parseInt(number2.getText());

        int result= number_1+number_2;

        label1.setText("Your result is"+result);

    }



}