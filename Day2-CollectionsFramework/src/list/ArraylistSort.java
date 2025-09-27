package list;

import java.util.*;
import java.util.Collections;

public class ArraylistSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan =new Scanner(System.in);
        System.out.println("Add Elements in the ArrayList:");
        for(int i=1;i<=3;i++) {
        	int n=scan.nextInt();  
        	numbers.add(n);
        }
        
      
        // Sorting in ascending order
        Collections.sort(numbers);

        // Printing the sorted list
        numbers.forEach(System.out::println);
    }
}
