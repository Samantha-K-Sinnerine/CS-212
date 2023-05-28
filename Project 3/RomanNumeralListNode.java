/**
 * This class creates list nodes that consist of a RomanNumeral and a reference to the next RomanNumeral
 * @author Samantha
 */
public class RomanNumeralListNode {
   protected RomanNumeral data;
   protected RomanNumeralListNode next;

   /**
    * Constructs a new RomanNumeralListNode with the given Roman numeral string
    * @param r the Roman numeral string to be stored in the list node
    */
   public RomanNumeralListNode(RomanNumeral r){
      data = r;
      next = null;
   }
}
