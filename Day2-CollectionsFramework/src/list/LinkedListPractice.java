package list;
import java.util.*;

public class LinkedListPractice {
    public static void main(String[] args) {
    	int i;
        LinkedList<Integer> Integerlist = new LinkedList<>();
        System.out.println("Lets first know the Size of the LINKEDLIST:"+ Integerlist.size());
    System.out.println("Enter the elements:");
    for ( i=0;i<6;i++) {
    	System.out.println("Element "+i+":");
    	Scanner in =new Scanner(System.in);
    	int elements=in.nextInt();
     	Integerlist.add(elements);
    }

        System.out.println("Initial List: " + Integerlist);
        //Set
        Integerlist.set(1, 100); 
        System.out.println("List after Set: " + Integerlist);
        System.out.println("After adding elements of the LinkedList: " + Integerlist.size());

       // Accessing elements
        System.out.println("First element: " + Integerlist.getFirst());
        System.out.println("Last element: " + Integerlist.getLast());
        System.out.println("Element at index 2: " + Integerlist.get(2));

        // Removing
        Integerlist.remove(4);
        Integerlist.removeFirst();
        Integerlist.removeLast();
        System.out.println("After removals: " + Integerlist);
        	
        
        //Searching
        System.out.println("Index of 99: " + Integerlist.indexOf(2));
        System.out.println("Contains 50? " + Integerlist.contains(50));
        
        
        //Iteration
        System.out.println("Iterating with for-each: ");
        for (Integer num : Integerlist) {
            System.out.println(num + " ");
        }
        
        //Clearing
        Integerlist.clear();
        System.out.println("List after clear(): " + Integerlist);
    }
}

