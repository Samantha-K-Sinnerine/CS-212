/*
Samantha Sinnerine
CSCI-212
Lab Section 11E[34718]
Project 1
*/

import java.awt.*;
import java.util.*;

public class Project1 {

   public static void main(String[] args) {

      //instantiate a new RomanNumeralGUI object
      RomanNumeralGUI myRomanNumeralGUI = new RomanNumeralGUI();

      Container myContentPane = myRomanNumeralGUI.getContentPane();
      //TextArea objects used to display the Roman numerals and their Arabic value equivalence
      TextArea myRomanNumerals = new TextArea();
      TextArea myArabicValues = new TextArea();

      //Formatting TextArea objects
      myRomanNumerals.setBackground(new Color(227, 205, 247));
      myArabicValues.setBackground(new Color(205, 232, 247));
      myRomanNumerals.append("Roman Numerals:"+"\n");
      myArabicValues.append("Arabic Values:"+"\n");
      myContentPane.add(myRomanNumerals);
      myContentPane.add(myArabicValues);

      TextFileInput in = new TextFileInput("input.txt");
      String line = in.readLine();
      StringTokenizer myTokens = new StringTokenizer(line,",");

      //populates the TextArea objects of the content pane with each Roman numeral substring
      //and their Arabic value equivalence
      while(true){
         //increments through each Roman numeral (token) in the line
         for(int i=0; myTokens.hasMoreTokens(); i++){
            String romanNumeral = myTokens.nextToken();
            //adds a valid Roman numeral and its Arabic value to the corresponding text areas
            if(isValidRomanNumeral(romanNumeral)){
               myRomanNumerals.append(romanNumeral+"\n");
               myArabicValues.append(romanToInt(romanNumeral)+"\n");
            }
         }
         line = in.readLine();
         //exits the while loop if all lines containing Roman numerals have been read
         if (line == null){
            break;
         }else{
            myTokens = new StringTokenizer(line,",");
         }
      }//end while

      in.close(); //close input.txt file
   }

   public static boolean isValidRomanNumeral(String s){
      //determines if the Roman numeral passed as String s is empty
      if (s == null || s.length() == 0) {
         throw new IllegalArgumentException("Invalid Roman Numeral: null");
      }

      //verifies that each character in the String s is a Roman numeral
      for(int i=0; i<s.length(); i++){
         if(valueOf(s.charAt(i)) == -1){
            throw new IllegalArgumentException("Invalid character in Roman Numeral");
         }
      }
      return true; //Roman numeral is valid
   }

   //returns the Arabic value equivalence for any given single character Roman numeral
   private static int valueOf(char rom) {
      if (rom == 'I')
         return 1;
      if (rom == 'V')
         return 5;
      if (rom == 'X')
         return 10;
      if (rom == 'L')
         return 50;
      if (rom == 'C')
         return 100;
      if (rom == 'D')
         return 500;
      if (rom == 'M')
         return 1000;
      return -1;
   }

   //converts String s that represents a Roman numeral to its integer Arabic value
   public static int romanToInt(String s) {

      //initializes the variable result to the Arabic value of the last Roman numeral in String s
      int result = valueOf(s.charAt(s.length()-1));

      //calculates the sum of the Arabic values for each Roman Numeral in String s
      for (int i = (s.length() - 2); i >= 0; i--) {
         int currentArabicValue = valueOf(s.charAt(i));
         int nextArabicValue = valueOf(s.charAt(i + 1));
         //determines if the Arabic value of the Roman numeral at current position i is greater than or equal to that of
         //the succeeding Roman numeral at position i+1
         if (currentArabicValue >= nextArabicValue) {
            result += currentArabicValue;
         } else {
            result -= currentArabicValue;
         } //end if
      } //end for

      return result;
   }
}