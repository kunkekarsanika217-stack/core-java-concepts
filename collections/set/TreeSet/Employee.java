import java.util.TreeSet;

public class Employee {

    public static void main(String[] args) {

        // TreeSet to store unique employee IDs in sorted order
        TreeSet<Integer> employeeIds = new TreeSet<>();

        employeeIds.add(105);
        employeeIds.add(101);
        employeeIds.add(110);
        employeeIds.add(103);
        employeeIds.add(101); // Duplicate - will be ignored
         
        // Display employee IDs
        System.out.println("Employee IDs (Sorted & Unique):");
        for (Integer id : employeeIds) {
            System.out.println(id);
        }
    }
}