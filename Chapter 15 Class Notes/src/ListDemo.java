import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /* The addLast method can be used to populate a list */
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Steve");

        System.out.println(staff);

        //The list is currently T,N,P,S
        /*
         * The list iterator method creates a new list iterator that is positioned at the head of the list
         * You can't iterate through a linked list w/o a list iterator
         * 
         * The | is commonly used to represent the iterator position
         */
        ListIterator<String> iterator = staff.listIterator(); // |T, N, P, S

        /* The next method advances the iterator OVER the next element in the list 
         * 
        */
        iterator.next(); // T |, N, P, S

        /* the next method also returns the element that the iterator passes over */
        String avenger = iterator.next();
        System.out.println(avenger); // Should print Natasha


    }
}
