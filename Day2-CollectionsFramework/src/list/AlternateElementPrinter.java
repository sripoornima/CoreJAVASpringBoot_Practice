package list;
import java.util.*;
/*
 * Create a Java Application where we need to create an ArrayList Object by using 
Integer as its Generic type, add 100 elements to it, and print all the elements 
alternatively by using Iterator.  
 */
public class AlternateElementPrinter {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("Adding elements by auto increment");

		for(int i=1;i<=100;i++) {
			list.add(i);
		}
		System.out.println("The ArrayList with 100 elements:"+list);
		
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
            System.out.print(itr.next() + " ");

		 if (itr.hasNext()) {
             itr.next();
         }
		}
	
	}

}
