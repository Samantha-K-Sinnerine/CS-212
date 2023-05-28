/**
 * @author Samantha Sinnerine
 * CSCI-212
 * Lab Section 11E[34718]
 * Project 2
 *
 */

import java.awt.*;
import java.util.StringTokenizer;

/**
 * This class reads lines of text from a file containing Roman numerals, tokenzies it and inserts each Roman numeral
 * into an unsorted and sorted LinkedList as a node. These lists are then displayed on a GUI using the RomanNumeralGUI class
 * 
 */
public class Project2 {

   public static void main(String[] args){

      //generate empty LinkedLists
      UnsortedRomanNumeralList myUnsortedList = new UnsortedRomanNumeralList();
      SortedRomanNumeralList mySortedList = new SortedRomanNumeralList();

      //read a line of text from the file and tokenize it
      TextFileInput in = new TextFileInput("input.txt");
      String line = in.readLine();
      StringTokenizer myTokens = new StringTokenizer(line, ",");

      //populate each LinkedList with RomanNumeral nodes
      while(true) {
         //increment through each Roman numeral (token) in the line
         for (int i = 0; myTokens.hasMoreTokens(); i++) {
            String temp = myTokens.nextToken(); //temporary placeholder for the Roman numeral string
            myUnsortedList.append(temp);
            mySortedList.add(temp);
         }//end for
         line = in.readLine();
         //exit the while loop if all lines containing Roman numerals have been read
         if (line == null) {
            break;
         } else {
            myTokens = new StringTokenizer(line, ",");
         }//end if
      }//end while

      //instantiate a new RomanNumeralGUI object to display the LinkedLists
      RomanNumeralGUI myRomanNumeralGUI = new RomanNumeralGUI(myUnsortedList, mySortedList);
      in.close(); //close input.txt file

      }
   }

