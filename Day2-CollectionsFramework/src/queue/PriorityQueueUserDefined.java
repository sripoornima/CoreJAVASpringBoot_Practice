package queue;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * Create a Java Application where we need to create a PriorityQueue Object with 
 * user-defined class as its generic, add n objects to the Object and print the values 
 * in ascending order of integers.
 */

// Step 1: Define a User-defined class
class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Step 2: Implement Comparable for sorting by id (ascending)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class PriorityQueueUserDefined {

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 3: Add user inputs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Student ID (integer): ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            pq.offer(new Student(id, name));
        }

        // Step 4: Print students in ascending order of ID
        System.out.println("\nStudents in Ascending Order of ID:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        sc.close();
    }
}
