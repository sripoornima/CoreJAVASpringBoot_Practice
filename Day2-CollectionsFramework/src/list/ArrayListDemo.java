package list;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ------------------------------
        // CREATE (Add elements)
        // ------------------------------
        ArrayList<String> list = new ArrayList<>();
        list.add("A");                // add at end
        list.add("B");
        list.add("C");
        list.add(1, "D");             // add at specific index
        System.out.println("After adding elements: " + list);

        // ------------------------------
        // READ (Access elements)
        // ------------------------------
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Does list contain 'B'? " + list.contains("B"));
        System.out.println("Index of 'C': " + list.indexOf("C"));

        // ------------------------------
        // UPDATE (Modify elements)
        // ------------------------------
        list.set(2, "Z");             // replace element at index 2
        System.out.println("After updating index 2 to 'Z': " + list);

        // ------------------------------
        // DELETE (Remove elements)
        // ------------------------------
        list.remove(1);               // remove element at index 1
        System.out.println("After removing element at index 1: " + list);
        list.remove("C");             // remove by value
        System.out.println("After removing element 'C': " + list);

        // ------------------------------
        // ITERATION / EXPLORATORY
        // ------------------------------
        System.out.println("Iterating using for-each loop:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("Iterating using lambda (Java 8+):");
        list.forEach(s -> System.out.println(s));

        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
