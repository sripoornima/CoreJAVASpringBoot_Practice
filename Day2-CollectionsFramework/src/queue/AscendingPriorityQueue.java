package queue;

import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create a Java Application where we need to create a PriorityQueue Object with 
integer as its generic, add few elements to it and retrieve the values in ascending 
order. 
 * 
 */
public class AscendingPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers to add to PriorityQueue (-1 to stop):");
		while(true) {
			int input=scan.nextInt();
			if(input==-1) {
				break;
			}
			pq.offer(input);
		}
        System.out.println("PriorityQueue: " + pq); 
        System.out.print("Values in Ascending Order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
	}

}
