/**
 * This class converts a single Roman numeral string to its Arabic value equivalent,
 * utilizes get and set methods for each value and compares RomanNumeral objects using 
 * compareTo and equals methods
 * 
 * @author Samantha
 */
import java.util.HashMap;
public class RomanNumeral {
   private String romanNumeral;
   private int arabicValue;

   /**
    * Constructs a new RomanNumeral object consisting of a Roman numeral string and its Arabic value equivalent
    * @param r the Roman Numeral to be stored
    * @throws IllegalRomanNumeralException if the input String is not a valid Roman numeral.
    */
   public RomanNumeral(String r){
      //determines if each character in the String is a valid Roman numeral
      if (!r.matches("[MDCLXVI]+")) {
         throw new IllegalRomanNumeralException(r);
      }
      //stores the input Roman numeral as the instance variable romanNumeral
      romanNumeral = r;
      //converts the Roman numeral to its corresponding Arabic value and stores it as the instance variable arabicValue
      arabicValue = romanToInt(romanNumeral);

   }

   /**
    * Returns the Roman numeral string stored in a RomanNumeral object
    * @return the Roman numeral string
    */
   public String getRomanNumeral() {
      return romanNumeral;
   }

   /**
    * Sets the Roman numeral string to the given value and updates the Arabic value
    * @param r the new Roman numeral string to be stored
    */
   public void setRomanNumeral(String r) {
      romanNumeral = r;
      arabicValue = romanToInt(romanNumeral);
   }

   /**
    * Returns the Arabic value equivalent of the Roman numeral string stored in the RomanNumeral object
    * @return the integer Arabic value equivalent
    */
   public int getArabicValue(){
      return arabicValue;
   }

   /**
    * Overrides the equals() method of the Object parent class to compare two RomanNumeral objects
    * @param other the object that the RomanNumeral is being compared to
    * @return true if both objects are equal, false otherwise
    */
   @Override
   public boolean equals(Object other) {
      return (other != null && getClass() == other.getClass()
              && romanNumeral.equals(((RomanNumeral)other).romanNumeral)
              && arabicValue == ((RomanNumeral)other).arabicValue);
   }

   /**
    * Overrides the toString() method of the String class
    * @return the string representation of the RomanNumeral object
    */
   @Override
   public String toString() {
      return romanNumeral;
   }

   /**
    * Compares two RomanNumeral objects based on their Arabic values
    * @param other the RomanNumeral object to compare to
    * @return a negative integer, zero, or a positive integer if the object is less than, equal to, or greater than the given object
    */
   public int compareTo(RomanNumeral other) {
      return Integer.compare(arabicValue, other.arabicValue);
   }

   /**
    * Returns the Arabic value equivalent for any given single character Roman numeral using a HashMap
    * @param rom a single character of a Roman numeral string
    * @return the Arabic value equivalent
    */
   private static int valueOf(char rom) {

      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      map.put('I', 1);
      map.put('V', 5);
      map.put('X', 10);
      map.put('L', 50);
      map.put('C', 100);
      map.put('D', 500);
      map.put('M', 1000);

      return map.get(rom);
   }

   /**
    * Converts a Roman numeral string to its Arabic value equivalent
    * @param s the string representation of a Roman numeral
    * @return the integer Arabic value equivalent
    */
   public static int romanToInt(String s) {
      //if the String passed is empty, return 0 as its value
      if(s==null){
         return 0;
      }
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
   } //romanToInt method

} //RomanNumeral class
