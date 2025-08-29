import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings) //strings.size() is a valid statement
    {
        ListIterator<String> iterator = strings.listIterator();

        LinkedList<String> reversed = new LinkedList<>();
        
        while (iterator.hasNext())
        {
           iterator.next();
        }

        int count=0;
        while (count < strings.size())
        {
            count++;
            iterator.previous();
            String n = iterator.next();
            
            reversed.add(n);
            System.out.println(reversed);

        }
        
        strings = reversed;


    }
}