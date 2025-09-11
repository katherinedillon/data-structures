import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map <String, String> listStudents = new HashMap<>();
        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            

            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                System.out.println("Name?");
                String name = in.next().toUpperCase();

                System.out.println("Grade?");
                String grade = in.next().toUpperCase();

                listStudents.put(name,grade);


            } else if (input.equals("R"))
            {
                System.out.println("Name?");
                String name = in.next().toUpperCase();

                listStudents.remove(name);

            } else if (input.equals("M"))
            {
                System.out.println("Name?");
                String name = in.next().toUpperCase();

                System.out.println("Grade?");
                String grade = in.next().toUpperCase();

                listStudents.put(name,grade);
                
            } else if (input.equalsIgnoreCase("P"))
            {
                System.out.println(listStudents);
            } else
            {
                done = true;
            }
        }
    }
}
