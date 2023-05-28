
import javax.swing.*;
import java.awt.*;

/**
 * This class inherits all the methods and attributes of the Jframe Java class and
 * displays a GUI containing 2 dropdown menus (File and Convert) and 2 Text Area columns.
 * @author Samantha
 */
public class RomanNumeralGUI extends JFrame {

   //Instantiate TextArea objects and Menu Bar
   public TextArea myRomanNumerals = new TextArea();
   public TextArea myArabicValues = new TextArea();
   private static JMenuBar menuBar = new JMenuBar();
   private static JMenuItem item;

   /**
    * Creates a GUI with 1 row and 2 columns to display the sorted Roman numerals and Arabic values
    */
   public RomanNumeralGUI(){
      //Create and set up window
      setTitle("Project 4");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(600,300);
      setLocationRelativeTo(null); //Center the window
      setJMenuBar(menuBar);
      createFileMenu();
      createConvertMenu();
      setLayout(new GridLayout(1,2));
      setVisible(true);


      Container myContentPane = this.getContentPane();

      //Formatting TextArea objects
      myRomanNumerals.setBackground(new Color(208, 245, 218));
      myRomanNumerals.setFont(new Font("Serif", Font.PLAIN, 15));
      myArabicValues.setBackground(new Color(246, 215, 250));
      myArabicValues.setFont(new Font("Serif", Font.PLAIN, 15));

      //Adding titles and TextAreas to Contentpane
      myRomanNumerals.append("Sorted Roman Numerals:"+"\n");
      myArabicValues.append("Sorted Arabic Values:"+"\n");
      myContentPane.add(myRomanNumerals);
      myContentPane.add(myArabicValues);
   }

   /**
    * Adds a File dropdown menu to the menubar with menu items "Open" and "Quit"
    */
   private void createFileMenu(){

      JMenu fileMenu = new JMenu("File");
      // Creates a file menu handler object with a reference to the current JFrame (this)
      FileMenuHandler fmh  = new FileMenuHandler(this);

      // Creates a new menu item object with the label "Open"
      item = new JMenuItem("Open");
      item.addActionListener( fmh );
      fileMenu.add( item );

      // Adds a horizontal separator line
      fileMenu.addSeparator();

      // Creates a new menu item object with the label "Quit"
      item = new JMenuItem("Quit");
      item.addActionListener( fmh );
      fileMenu.add( item );

      menuBar.add(fileMenu);
   }

   /**
    * Adds a Convert dropdown menu to the menubar with the menu item "Roman to Arabic"
    */
   private void createConvertMenu(){
      JMenu convertMenu = new JMenu("Convert");
      // Creates a convert menu handler object with a reference to the current JFrame (this)
      ConvertMenuHandler cmh  = new ConvertMenuHandler(this);

      // Creates a new menu item object with the label "Roman to Arabic"
      item = new JMenuItem("Roman to Arabic");
      item.addActionListener( cmh );
      convertMenu.add( item );

      menuBar.add(convertMenu);
   }

}
