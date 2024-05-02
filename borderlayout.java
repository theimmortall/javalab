import javax.swing.*;  
import java.awt.*;  
public class borderlayout {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("BorderLayout Example");  
        frame.setLayout(new BorderLayout());  
        frame.add(new JButton("North"), BorderLayout.NORTH);  
        frame.add(new JButton("South"), BorderLayout.SOUTH);  
        frame.add(new JButton("East"), BorderLayout.EAST);  
        frame.add(new JButton("West"), BorderLayout.WEST);  
        frame.add(new JButton("Center"), BorderLayout.CENTER);  
        frame.pack();  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
}  