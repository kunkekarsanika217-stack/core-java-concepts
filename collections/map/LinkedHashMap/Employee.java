class Employee {

    private int id;
    private String name;
    private String role;
    private double salary;

    public Employee(int id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee { " +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Role='" + role + '\'' +
                ", Salary=" + salary +
                " }";
    }
}
