import java.util.Comparator;

/**
 * This class is a custom comparator for RomanNumeral objects.
 * It implements the Comparator interface and overrides its compare() method
 * to compare two RomanNumeral objects based on their numeric value.
 */
public class RomanNumeralComparator implements Comparator<RomanNumeral> {
   /**
    * Compares two RomanNumeral objects based on their Arabic value.
    * @param rom1 the first RomanNumeral object to be compared.
    * @param rom2 the second RomanNumeral object to be compared.
    * @return a negative integer, zero, or a positive integer if the first RomanNumeral is less than,
    * equal to, or greater than the second.
    */
   public int compare(RomanNumeral rom1, RomanNumeral rom2){
      return rom1.compareTo(rom2);
   }
}
