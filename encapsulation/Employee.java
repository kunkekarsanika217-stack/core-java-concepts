public class Employee {

    // Private data (hidden)
    private int employeeId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

// Public getter (read-only access)
    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    // Controlled update (business logic applied)
    public void applyIncrement(double percentage) {
        if (percentage > 0 && percentage <= 20) {
            salary += salary * percentage / 100;
        } else {
            System.out.println("Invalid increment percentage");
        }
    }
}