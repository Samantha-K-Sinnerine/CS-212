import javax.swing.*;
import java.awt.*;

//the class RomanNumeralGUI inherits all the methods and attributes of the Jframe Java class
public class RomanNumeralGUI extends JFrame {

   //constructor to initialize a new RomanNumeralGUI
   public RomanNumeralGUI (){
      this.setTitle("Roman Numeral to Arabic Value Calculator");
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setSize(500,300);
      this.setLocation(550,200);
      this.setVisible(true);
      this.setLayout(new GridLayout(1,2));
   };
}
