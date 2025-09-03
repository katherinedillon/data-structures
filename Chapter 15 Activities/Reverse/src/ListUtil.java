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

        ListIterator<String> iterator1 = strings.listIterator();
        ListIterator<String> iterator2 = strings.listIterator();
        

        while (iterator2.hasNext())
        {
           iterator2.next();
        }

        int count=0;
        while (count < strings.size() / 2)
        {
            count++;
            String x = iterator1.next();
            String y = iterator2.previous();


            iterator1.set(y);
            iterator2.set(x);

        }
        System.out.println(strings);
        

          
    }

}