class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}

class Director extends Manager {
    private double budget;

    public Director(String name, int id, double salary, String department, double budget) {
        super(name, id, salary, department);
        this.budget = budget;
    }

    public void displayDirectorInfo() {
        displayManagerInfo();
        System.out.println("Budget: $" + budget);
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        // Create a Director object
        Director director = new Director("Alice", 101, 120000, "IT", 500000);

        // Display info from all levels
        director.displayDirectorInfo();
    }
}