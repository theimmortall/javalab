import javax.swing.*;  
import java.awt.*;  
public class gridlayout {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("GridLayout Example");  
        frame.setLayout(new GridLayout(3, 3));  
        for (int i = 1; i <= 9; i++) {  
            frame.add(new JButton("Button " + i));  
        }  
        frame.pack();  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
}