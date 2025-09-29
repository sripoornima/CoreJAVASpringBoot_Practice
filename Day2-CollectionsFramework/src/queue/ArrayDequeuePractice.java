package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeuePractice {

    public static void main(String[] args) {
        // Create ArrayDeque with Integer generic type
        Deque<Integer> adq = new ArrayDeque<>();

        // Add elements from head and tail
        adq.addFirst(10);  // Head
        adq.addLast(20);   // Tail
        adq.addFirst(5);   // Head
        adq.addLast(30);   // Tail

        // Print the ArrayDeque
        System.out.println("ArrayDeque after additions: " + adq);

        // Retrieve elements from head and tail
        System.out.println("First Element (Head): " + adq.peekFirst());
        System.out.println("Last Element (Tail): " + adq.peekLast());

        // Remove elements from head and tail
        adq.removeFirst();
        adq.removeLast();
        System.out.println("ArrayDeque after removals: " + adq);

        // Iterate over the ArrayDeque
        System.out.println("Iterating through remaining elements:");
        for (Integer num : adq) {
            System.out.println(num);
        }
    }
}
