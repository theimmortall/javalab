import javax.swing.*;  
import java.awt.*;  
 
public class cardlayout {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("CardLayout Example");  
        CardLayout cardLayout = new CardLayout();  
        JPanel cardPanel = new JPanel(cardLayout);  
        JButton button1 = new JButton("Card 1");  
        JButton button2 = new JButton("Card 2");  
        JButton button3 = new JButton("Card 3");  
        cardPanel.add(new JButton("Card 1"));  
        cardPanel.add(new JButton("Card 2"));  
        cardPanel.add(new JButton("Card 3"));  
        frame.add(cardPanel);  
        frame.pack();  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        button1.addActionListener(e -> cardLayout.show(cardPanel, "Card 2"));  
        button2.addActionListener(e -> cardLayout.show(cardPanel, "Card 3"));  
        button3.addActionListener(e -> cardLayout.show(cardPanel, "Card 1"));  
    }  
}  