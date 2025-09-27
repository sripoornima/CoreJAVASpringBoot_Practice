package list;
import java.util.*;

public class ArraylistIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("diya");
        names.add("zara");
        names.add("dev");

        System.out.println("Using Iterator:");
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);

            // Safe removal using Iterator
            if (name.equals("zara")) {
                it.remove();
            }
        }

        System.out.println("After removal: " + names);
    }
}
