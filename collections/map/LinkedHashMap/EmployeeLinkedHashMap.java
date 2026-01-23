import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeLinkedHashMap {

    public static void main(String[] args) {

        // LinkedHashMap maintains insertion order
        Map<Integer, Employee> employeeMap = new LinkedHashMap<>();

        // Adding employees
        employeeMap.put(101, new Employee(101, "Sanika", "Java Developer", 55000));
        employeeMap.put(102, new Employee(102, "Amit", "Data Analyst", 60000));
        employeeMap.put(103, new Employee(103, "Rohit", "Backend Developer", 65000));

        // Fetch a specific employee
        System.out.println("Employee with ID 102:");
        System.out.println(employeeMap.get(102));

        // Update employee salary
        Employee emp = employeeMap.get(103);
        emp.setSalary(70000);

        // Display all employees (in insertion order)
        System.out.println("\nAll Employees:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        // Remove an employee
        employeeMap.remove(101);

        System.out.println("\nAfter removing employee ID 101:");
        employeeMap.forEach((id, employee) -> System.out.println(employee));
    }
}