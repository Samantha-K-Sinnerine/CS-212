/**
 * This class inherits all the attributes of the RomanNumeralList class and contains an append method
 * @author Samantha
 */
public class UnsortedRomanNumeralList extends RomanNumeralList{

   /**
    * Appends a new Roman numeral node to the end of the LinkedList
    * @param r the new Roman numeral string to be appended
    */
   public void append(String r) {
      RomanNumeralListNode n = new RomanNumeralListNode(r);
      last.next = n;
      last = n;
      length++;
   } // method append(String)

}
