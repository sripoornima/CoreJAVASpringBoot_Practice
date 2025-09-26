package list;
import java.util.*;
import java.io.*;

public class VectorPractice {
    public static void main(String[] args) {
        // Creating a Vector of Integers
        Vector<Integer> numbers = new Vector<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addElement(40); // Legacy method
        numbers.add(50);

        System.out.println("Initial Vector: " + numbers);

        // Accessing elements
        System.out.println("First element: " + numbers.firstElement());
        System.out.println("Last element: " + numbers.lastElement());
        System.out.println("Element at index 2: " + numbers.get(2));

        // Updating
        numbers.set(1, 200);
        System.out.println("After set: " + numbers);

        // Removing
        numbers.remove(2); // removes element at index 2
        numbers.removeElement(50); // removes element by value
        System.out.println("After removals: " + numbers);

        // Searching
        System.out.println("Contains 200? " + numbers.contains(200));
        System.out.println("Index of 40: " + numbers.indexOf(40));

        // Iterating
        System.out.println("Iterating using for-each:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Iterating using Enumeration (legacy)
        System.out.println("Iterating using Enumeration:");
        Enumeration<Integer> e = numbers.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // Size and Capacity
        System.out.println("Size: " + numbers.size());
        System.out.println("Capacity: " + numbers.capacity()); // default = 10, grows automatically

        // Clearing
        numbers.clear();
        System.out.println("After clear: " + numbers);
    }
}
