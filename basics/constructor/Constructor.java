class Employee {

    private int id;
    private String name;
    private double salary;

    // Default constructor
    public Employee() {
        this.id = 0;
        this.name = "Not Assigned";
        this.salary = 0.0;
    }

    // Parameterized constructor (id, name)
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }

    // Parameterized constructor (id, name, salary)
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println(id + " | " + name + " | " + salary);
    }
}

public class Constructor {

    public static void main(String[] args) {

        Employee emp1 = new Employee();                         // default constructor
        Employee emp2 = new Employee(101, "Amit");              // parameterized constructor
        Employee emp3 = new Employee(102, "Neha", 75000.50);    // overloaded constructor

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}