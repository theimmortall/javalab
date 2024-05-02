import javax.swing.*;  
import java.awt.*;  
public class gridbag {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("GridBagLayout Example");  
        JPanel panel = new JPanel(new GridBagLayout());  
        GridBagConstraints constraints = new GridBagConstraints();  
        constraints.fill = GridBagConstraints.HORIZONTAL;  
        JButton button1 = new JButton("Button 1");  
        JButton button2 = new JButton("Button 2");  
        constraints.gridx = 0;  
        constraints.gridy = 0;  
        panel.add(button1, constraints);  
        constraints.gridx = 1;  
        panel.add(button2, constraints);  
        frame.add(panel);  
        frame.pack();  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
}  
