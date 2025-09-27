package list;
import java.util.*;
/*
 * 
 * Create a Java Application where we need to create two ArrayList Objects by 
using Integer as its Generic type, add multiples of 2 to the first ArrayList and 
multiples of 3 to the second ArrayList. Display the values of ArrayList2 which 
are present in ArrayList1.  
 */
public class ArrayListIntersection {
		public static void main(String[]args) {
			Scanner scan=new Scanner(System.in);
			ArrayList<Integer> multiplesofTwo =new ArrayList<>();
			ArrayList<Integer> multiplesofThree =new ArrayList<>();
			for(int i=1;i<=10;i++) {
				if(i%2==0) {
					multiplesofTwo.add(i);
				}
			}
			for(int j=1;j<=10;j++) {
				if(j%3==0) {
					multiplesofThree.add(j);
				}
			}
			
			System.out.println("Multiples Of Two:"+multiplesofTwo);
			System.out.println("Multiples Of Three:"+multiplesofThree);
             //Iterator<Integer> itr1 =  multiplesofTwo.iterator();
	        System.out.print("Common Elements (present in both lists):");

            	 for(Integer x:multiplesofThree) {
            		 if(multiplesofTwo.contains(x))
            		 System.out.print(" "+x+" ");
            	 }
			
		}
}
