import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        // Create a priority queue of strings
        // A priority queue needs to be composed of Comparable objects
        Queue<String> students = new PriorityQueue<>();

        students.add("Neel");
        students.add("Jonathan");
        students.add("Cam");
        students.add("Kaitlyn");
        students.add("Dylan");

        // The next highest priority object is moved to the front of the queue when the head of the queue is removed
        while (students.size() > 0){
            System.out.println("Printing: "+students.remove());
        }

        // Create a todo list
        // The WorkOrder class has a priority and description
        Queue<WorkOrder> toDo = new PriorityQueue<>();

        //Lower priority = more important
        toDo.add(new WorkOrder(3, "Water Plants"));
        toDo.add(new WorkOrder(2, "Make Dinner"));
        toDo.add(new WorkOrder(1, "Conquer World"));
        toDo.add(new WorkOrder(9, "Video Games"));
        toDo.add(new WorkOrder(1, "Study for Test"));

        // Onjects are NOT stored in priority order
        System.out.println(toDo);

        // However, objects are removed in priority order
        while (toDo.size() > 0){
            System.out.println(toDo.remove());
        }
    }
}
