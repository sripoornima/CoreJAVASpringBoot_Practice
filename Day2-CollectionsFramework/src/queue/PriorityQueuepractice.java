package queue;
import java.util.*;
import java.lang.*;
/*
 * 
 * 
 * Create a Java Application where we need to create a PriorityQueue Object with 
integer as its generic, add few elements to it and print the PriorityQueue. 
 */
public class PriorityQueuepractice {

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

       // scan.close();
        
        
	}

}
