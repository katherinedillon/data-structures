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
        String avenger = iterator.next(); // T, N |, P, S
        System.out.println(avenger); // Should print Natasha
        
        //The add method inserts an element at the iterator position.
        //The iterator is then positioned after the element that was added

        iterator.add("Clint"); // T, N, C |, P, S
        iterator.add("Bruce"); //T, N, C, B |, P, S
        System.out.println(staff);

        /*The remove method can ONLY be called after calling next() or previous()*/
        //iterator.remove(); this line would cause an IllegalStateException
        //The remove element returns the element returned after calling next or previous
        iterator.next(); //T, N, C, B, P |, S
        iterator.remove(); //Peter is removed -> TNCB|S
        System.out.println(staff);

        /*The set method updates the element returned by the last call to next or previous */

        iterator.previous(); // TNC|BS moves the iterator to its previous position
        iterator.set("Thor"); //Bruce is replaced by Thor -> TNC|TS
        System.out.println(staff);

        /*The hasNext() method is used to determine if there is a next node after the iterator. 
        The hasNext is often used in the condition of a while loop */

        /*one way to iterate */
        iterator = staff.listIterator(); //|TNCTS
        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Natasha")){ //TN|CTS
                iterator.remove(); //T|CTS
            }
        } //TCTS|

        /*2nd way (enhanced for loop) */
        for(String n: staff)
        {
            System.out.print(n+"");
        }
        System.out.println();

        /* ConcurrentModificationException
         * 
         * You cannot modify a linked list using an iterator
         * UNLESS you use an iterator to do the modification (iterator.remove() NOT staff.remove())
         */ 
        iterator = staff.listIterator(); //|TCTS
        while (iterator.hasNext()){
            String n = iterator.next();
            if (n.equals("Tony")){
                //staff.remove("Tony"); ConcurrentModificationException
            }
        }


        /* There is an iterator imbedded in the for loop so you cannot add like this */
        for (String n: staff)
        {
            if (n.equals("Tony"))
                staff.add("T'Challa");
        }

        System.out.println(staff);

    }
}
