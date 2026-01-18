import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        // Creating a HashSet to store unique employee names
        Set<String> employeeNames = new HashSet<>();

        // Adding elements to HashSet
        employeeNames.add("Sanika");
        employeeNames.add("Amit");
        employeeNames.add("Rahul");
        employeeNames.add("Neha");

        // Duplicate element (will be ignored by HashSet)
        employeeNames.add("Sanika");

        // Displaying HashSet elements
        System.out.println("Employee Names:");
        for (String name : employeeNames) {
            System.out.println(name);
        }

        // Checking if an element exists
        if (employeeNames.contains("Amit")) {
            System.out.println("\nAmit is present in the HashSet.");
        }

        // Removing an element
        employeeNames.remove("Rahul");

        // Displaying HashSet after removal
        System.out.println("\nAfter removing Rahul:");
        System.out.println(employeeNames);

        // Size of HashSet
        System.out.println("\nTotal Employees: " + employeeNames.size());
    }
}