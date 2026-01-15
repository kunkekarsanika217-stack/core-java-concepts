import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Display method
    public void displayEmployee() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ArrayListDemo {

    public static void main(String[] args) {

        // Creating ArrayList using List interface (Best Practice)
        List<Employee> employeeList = new ArrayList<>();

        // Adding elements
        employeeList.add(new Employee(101, "Sanika"));
        employeeList.add(new Employee(102, "Amit"));
        employeeList.add(new Employee(103, "Riya"));

        // Displaying elements
        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            emp.displayEmployee();
        }

        // Removing an element
        employeeList.remove(1); // removes Amit

        System.out.println("\nAfter Removal:");
        employeeList.forEach(Employee::displayEmployee);

        // Checking size
        System.out.println("\nTotal Employees: " + employeeList.size());
    }
}