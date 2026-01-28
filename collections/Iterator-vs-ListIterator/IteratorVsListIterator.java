import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorVsListIterator {

    public static void main(String[] args) {

        List<String> technologies = new ArrayList<>();
        technologies.add("Java");
        technologies.add("Spring");
        technologies.add("Hibernate");

        System.out.println("Original List: " + technologies);

        // ---------------- Iterator Example ----------------
        System.out.println("\nUsing Iterator (Forward traversal + Remove):");

        Iterator<String> iterator = technologies.iterator();
        while (iterator.hasNext()) {
            String tech = iterator.next();
            System.out.println(tech);

            if ("Hibernate".equals(tech)) {
                iterator.remove(); // Safe removal
            }
        }

        System.out.println("After Iterator operation: " + technologies);

        // ---------------- ListIterator Example ----------------
        System.out.println("\nUsing ListIterator (Forward & Backward + Add & Update):");

        ListIterator<String> listIterator = technologies.listIterator();

        while (listIterator.hasNext()) {
            String tech = listIterator.next();

            if ("Spring".equals(tech)) {
                listIterator.set("Spring Boot");  // Update
                listIterator.add("Microservices"); // Add
            }
        }

        System.out.println("After ListIterator forward traversal: " + technologies);

        System.out.println("\nBackward traversal using ListIterator:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
