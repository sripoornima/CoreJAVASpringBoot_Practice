package list;
import java.util.*;
public class Arraylist{
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
   ArrayList<String> l1= new ArrayList<String>();
   System.out.println("Before Adding of values Size Of The ArrayList: "+l1.size());
   System.out.println("Enter the Elements of Arraylist:");
   for(int i=0;i<6;i++) {
	String val=scan.nextLine();
	   l1.add(val);
   }
   System.out.println("The ArrayList: "+l1);
  l1.add(1, "G");
  l1.set(5, "Q");
	System.out.println("Using get method:  "+l1.get(1));
	   System.out.println("After Adding of values Size Of The ArrayList: "+l1.size());
	   System.out.println("The ArrayList: "+l1);
	  ArrayList<String> l2= new ArrayList<String>();  
	   for(int i=0;i<3;i++) {
			String val=scan.nextLine();
			   l2.add(val);
		   }
	   System.out.println(""+l1.retainAll(l2));
	}
}
