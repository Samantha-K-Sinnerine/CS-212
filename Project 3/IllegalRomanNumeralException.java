/**
 * This class extends the IllegalArgumentException class and is thrown when an invalid Roman numeral character is detected.
 */

public class IllegalRomanNumeralException extends IllegalArgumentException{

   public IllegalRomanNumeralException(String invalidRomanNumeral){
      super("Invalid character in Roman Numeral: "+ invalidRomanNumeral);
   }

}
