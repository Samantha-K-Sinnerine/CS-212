/*Samantha Sinnerine
CSCI-212 Lab Section 34718
Project 0
*/

import javax.swing.*;

public class Project0 {

    public static void main (String[] args){

        while(true) {

            //counter variables for the number of lower/ upper case e's entered by the user
            int lowerCase_e = 0, upperCase_E = 0;

            //stores the message inputted by the user in the String object "input"
            String input = JOptionPane.showInputDialog(null, "Please enter a sentence");

            //terminates the program if the user enters any upper/lower case permutations of the word "stop"
            if (input.equalsIgnoreCase("stop")) {
                System.exit(1);
            }

            //increments through each character in the String object 'input' and counts the number of lower/upper case e's
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'e') {         //determines if the character at index i is a lowercase 'e'
                    lowerCase_e++;                    //increments the counter variable for the number of lowercase e's found in the String
                } else if (input.charAt(i) == 'E') {  //determines if the character at index i is an uppercase 'E'
                    upperCase_E++;                    //increments the counter variable for the number of uppercase E's found in the String
                }
            }//ends for loop

            //displays to the user the number of lowercase e's and uppercase E's entered in the String
            JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lowerCase_e + "\nNumber of upper case e's: " + upperCase_E);
        }
    }
}
