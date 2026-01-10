class Vehicle {
    // Fields
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}

// Car class inherits from Vehicle
class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year); // Call parent constructor
        this.doors = doors;
    }

    // Method
    public void displayCarInfo() {
        displayInfo(); // Call parent method
        System.out.println("Number of doors: " + doors);
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        // Creating an object of Car (child class)
        Car myCar = new Car("Toyota", 2025, 4);

        // Display car information (inherited + child class info)
        myCar.displayCarInfo();
    }
}