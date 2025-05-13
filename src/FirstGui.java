import javax.swing.*;
import java.awt.*;

public class FirstGui {
    public static void main(String[] args) {
        Gui frame= new Gui();

    }
}

class Gui extends JFrame{//Jframe use card layout by default i.e like a stack
//    of cards or plates which you can only see the topmost one. However,
//    there are other layouts like Flow Layout, Grid Layout, Null layout etc
    public Gui() throws HeadlessException {

        JLabel label1= new JLabel("Hello World");
        JLabel label2= new JLabel("Welcome to Jswing class");

        add(label1);
        add(label2);

        //4 important lines for all projects
        setLayout(new FlowLayout()); // To change frame layout
        setVisible(true); // frame is hidden by default and this is used to make it visisble
        setSize(400, 400); // used to set framesize
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to make exit button on the frame functional
    }
}