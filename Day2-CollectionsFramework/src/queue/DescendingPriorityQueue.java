package queue;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

/*
 * Create a Java Application where we need to create a PriorityQueue Object with 
 * Integer as its generic, add few elements to it and retrieve the values in 
 * descending order.
 */
public class DescendingPriorityQueue {

    public static void main(String[] args) {
        // Max Heap using reverseOrder comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter numbers to add to PriorityQueue (-1 to stop):");
        while (true) {
            int input = scan.nextInt();
            if (input == -1) {
                break;
            }
            pq.offer(input);
        }

        // Printing internal structure (not sorted yet)
        System.out.println("Internal PriorityQueue: " + pq);

        // Retrieve in descending order
        System.out.print("Values in Descending Order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        scan.close();
    }
}
