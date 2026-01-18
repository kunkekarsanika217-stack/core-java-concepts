import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        // Creating a LinkedList of Strings
        LinkedList<String> names = new LinkedList<>();

        // Adding elements
        names.add("Sanika");
        names.add("Amit");
        names.add("Rohit");
        names.addFirst("Admin");     // add at beginning
        names.addLast("Guest");      // add at end

        // Display LinkedList
        System.out.println("LinkedList Elements:");
        System.out.println(names);

        // Accessing elements
        System.out.println("First Element: " + names.getFirst());
        System.out.println("Last Element: " + names.getLast());

        // Removing elements
        names.removeFirst();
        names.removeLast();
        names.remove("Amit");

        // Display after removal
        System.out.println("After Removing Elements:");
        System.out.println(names);

        // Iterating using for-each loop
        System.out.println("Iterating LinkedList:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}