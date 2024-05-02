
// importing Java AWT class  
import java.awt.*;
import java.awt.event.*;

// extending Frame class to our class AWTExample1  
public class Mybuttons extends Frame implements ActionListener {

   Button b1, b2, b3;

   Mybuttons() {
      this.setLayout(null);

      b1 = new Button("yellow");
      b2 = new Button("green");
      b3 = new Button("blue");

      b1.setBounds(100, 100, 70, 40);
      b2.setBounds(100, 160, 70, 40);
      b3.setBounds(100, 220, 70, 40);

      this.add(b1);
      this.add(b2);
      this.add(b3);

      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);

      addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
            System.exit(0);
         }
      });
   }

   public void actionPerformed(ActionEvent e) {
      String str = e.getActionCommand();
      if (str.equals("yellow")) {
         this.setBackground(Color.yellow);
      }
      if (str.equals("green")) {
         this.setBackground(Color.green);
      }
      if (str.equals("blue")) {
         this.setBackground(Color.blue);
      }
   }



   // main method
   public static void main(String args[]) {

      // creating instance of Frame class
      Mybuttons b = new Mybuttons();
      b.setSize(400,400);
      b.setTitle("MyButtons");
      b.setVisible(true);

   }

}