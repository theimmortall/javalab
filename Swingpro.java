import javax.swing.*;

public class Swingpro{
    public static void main(String[] args) {
        JFrame f = new JFrame("MyFrame");
        JButton b1 = new JButton("Click me");
        JButton b2 = new JButton("Click me again");
        f.add(b1);
        f.add(b2);
        f.setSize(500,500);
        b1.setBounds(300,100,80,50);
        b2.setBounds(300,150,130,50);
        f.setLayout(null);
        f.setVisible(true);
    }
}
