package list;
import java.util.*;
/*
 *Create a Java Application where we need to create an ArrayList Object by using 
   Integer as its Generic type. Add a few elements to it and print the list in forward 
   and backward directions by using ListIterator. 
 */
public class ListIteratorDemo {

	public static void main(String[]args) {
		ArrayList<Integer> list=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Element:"+i+" ");
			list.add(scan.nextInt());
		}
		ListIterator<Integer> itr=list.listIterator();

		System.out.println("Arraylist:"+list);
		System.out.println("Forward Traversing using ListIterator:");
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println("");
		
		System.out.println("Backward Traversing using ListIterator:");
		while(itr.hasPrevious()) {
			System.out.print(itr.previous());
		}
	}
}
