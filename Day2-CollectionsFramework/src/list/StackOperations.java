package list;
import java.util.*;
import java.io.*;
public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack); // [10, 20, 30]

        // Peek top
        System.out.println("Top element: " + stack.peek()); // 30

        // Pop elements
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Stack after pop: " + stack); // [10, 20]

        // Search
        System.out.println("Index of 10 from top: " + stack.search(10)); // 2
    }
}
