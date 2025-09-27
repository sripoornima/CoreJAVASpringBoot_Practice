package list;
import java.util.*;
public class LinkedListMiddleElementRemoval {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> linkedlist = new LinkedList<>();
		System.out.println("Enter the LinkedList Elements:");
		for(int i=1;i<=3;i++) {
			linkedlist.add(scan.nextInt());
		}
		System.out.println("LINKED LIST--->"+linkedlist);
		
	}

}
