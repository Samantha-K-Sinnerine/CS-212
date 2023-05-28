/**
 * This class inherits all the attributes of the RomanNumeralList class and contains an add method
 * @author Samantha
 */

public class SortedRomanNumeralList extends RomanNumeralList{

   /**
    * Adds a new node to the LinkedList such that the list remains sorted in ascending order by Arabic values
    * @param r the new Roman numeral string to be added
    */
   public void add(String r){
      RomanNumeralListNode a,b;
      a= first;
      b= a.next;
      //create a new list node from given Roman numeral string
      RomanNumeralListNode in = new RomanNumeralListNode(r);

      /*increments through the LinkedList until the Arabic value of the given Roman numeral is greater than
      that of any such RomanNumeral in the list*/
      while(b !=null && b.data.compareTo(in.data) <= 0){
         a = a.next;
         b = b.next;
      }
      //inserts the new node between a and b
      in.next = b;
      a.next = in;

   }

}
