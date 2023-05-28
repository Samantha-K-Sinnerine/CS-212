
import javax.swing.*;
import java.awt.*;

/**
 * This class inherits all the methods and attributes of the Jframe Java class and
 * displays the contents (Roman numeral nodes) of each LinkedList in a GUI using a printList method
 * @author Samantha
 */
public class RomanNumeralGUI extends JFrame {

   //Instantiate TextArea objects
   private static TextArea myRomanNumerals = new TextArea();
   private static TextArea unsortedList = new TextArea();
   private static TextArea sortedList = new TextArea();

   /**
    * Creates a GUI with 1 row and 3 columns to display the Roman numerals, unsorted Arabic values and sorted Arabic
    * values
    * @param list1 unsorted LinkedList of Roman numeral nodes to be printed
    * @param list2 sorted LinkedList of Roman numeral nodes to be printed
    */
   public RomanNumeralGUI (UnsortedRomanNumeralList list1, SortedRomanNumeralList list2){
      //Create and set up window
      this.setTitle("Project 2");
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setSize(600,300);
      this.setLocationRelativeTo(null); //Center the window
      this.setVisible(true);
      this.setLayout(new GridLayout(1,3));

      Container myContentPane = this.getContentPane();

      //Formatting TextArea objects
      myRomanNumerals.setBackground(new Color(208, 245, 218));
      myRomanNumerals.setFont(new Font("Serif", Font.PLAIN, 15));
      unsortedList.setBackground(new Color(246, 215, 250));
      unsortedList.setFont(new Font("Serif", Font.PLAIN, 15));
      sortedList.setBackground(new Color(252, 241, 199));
      sortedList.setFont(new Font("Serif", Font.PLAIN, 15));

      //Adding titles and TextAreas to Contentpane
      myRomanNumerals.append("Roman Numerals:"+"\n");
      unsortedList.append("Unsorted Arabic Values:"+"\n");
      sortedList.append("Sorted Arabic Values:"+"\n");
      myContentPane.add(myRomanNumerals);
      myContentPane.add(unsortedList);
      myContentPane.add(sortedList);

      //Output lists to GUI
      printList(sortedList, list2);
      printList(unsortedList, list1);

   }

   /**
    * Prints the contents of a LinkedList to the given TextArea
    * @param s TextArea to display the data
    * @param list LinkedList to be displayed
    */
   private static void printList(TextArea s, RomanNumeralList list){
      RomanNumeralListNode p = list.first.next;
      //increments through each list node in the list and appends it to the text area
      while(p != null){
         if (list instanceof UnsortedRomanNumeralList){
            myRomanNumerals.append(p.data.getRomanNumeral()+"\n");
         }
         s.append(p.data.getArabicValue()+"\n");
         p = p.next;
      }

   }

}
