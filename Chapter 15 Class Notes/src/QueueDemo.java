import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        // Create a print queue of strings using a LinkedList
        Queue<String> jobs = new LinkedList<>();

        // Add some print jobs
        jobs.add("Harry: Quarter 2 Expense Report");
        jobs.add("Connor: Recipe for Banana Bread");
        jobs.add("Katherine: Top Secret Document");

        System.out.println("Printing: "+jobs.remove());

        // More print jobs
        jobs.add("Vardhan: Grocery List");
        jobs.add("Katherine: Really Top Secret Document");
        jobs.add("Katherine: Can I get fired for this");

        System.out.println("Printing: "+jobs.remove());
        System.out.println("Printing: "+jobs.remove());

        jobs.add("Boss: Katherine Termination Letter");

        // Print the rest of the jobs in the queue using a for loop
        /*int length = jobs.size();
        //for (int i=0; i<length; i++)
        //{
           //System.out.println("Printing: "+jobs.remove());
        }*/

        //can also use a while loop
        while (jobs.size() > 0){
            System.out.println("Printing: "+jobs.remove());
        }

    }
}
