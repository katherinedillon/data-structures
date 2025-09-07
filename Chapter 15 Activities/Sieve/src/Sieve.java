import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer? ");
        int n = in.nextInt();

        // Your work goes here
        Set<Integer> listNums = new HashSet<>();

        for (int i = 2; i <= n; i++) {
            listNums.add(i);
        }

        int count = 2;

        while (count <= n) {
            Iterator<Integer> iterator = listNums.iterator();
            while (iterator.hasNext()) {
                int value = iterator.next();
                if ((value % count == 0) && (value > count))  {
                    iterator.remove();
                    //System.out.println(value);
                }

            }
            count++;

        }
        System.out.print(listNums);
    }
}