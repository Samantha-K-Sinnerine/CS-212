/**
 * This class creates a LinkedList of RomanNumeralListNodes
 * @author Samantha
 */
public class RomanNumeralList {

   /** First node in linked list - dummy node */
   protected RomanNumeralListNode first = new RomanNumeralListNode(null);

   /** Last node in linked list */
   protected RomanNumeralListNode last = first;

   /** Number of Roman numeral data items in the list. */
   protected int length = 0;

   /**
    * Returns the number of Roman numeral nodes currently stored in this LinkedList.
    * @return the number of elements in the list.
    */
   public int getLength() {
      return length;
   }


}
