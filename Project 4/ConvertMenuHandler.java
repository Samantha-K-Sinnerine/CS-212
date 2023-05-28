import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements an ActionListener class that handles the "Convert" menu item action.
 * It prompts the user to enter a Roman numeral, converts it to an Arabic numeral using the RomanNumeral class,
 * and displays the result using a message dialog box.
 */
public class ConvertMenuHandler implements ActionListener {
   JFrame jframe;
   public ConvertMenuHandler (JFrame jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) {
      String input = JOptionPane.showInputDialog(null, "Enter a Roman Numeral: ");
      //try-catch block to validate each character in Roman numeral string, displays an error message if invalid
      try {
         RomanNumeral r = new RomanNumeral(input);
         JOptionPane.showMessageDialog(null, "The Arabic value equivalent of "+input+" is "+ r.getArabicValue());
      } catch (IllegalRomanNumeralException irne){
         JOptionPane.showMessageDialog(null,"Invalid Roman Numeral: "+ input);
         System.out.println("Invalid character(s) in Roman Numeral: "+ input);
      }
   } //actionPerformed
}