public class Calculator {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Add integer and double
    public double add(int a, double b) {
        return a + b;
    }

    // Main method to test
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add 2 integers: " + calc.add(10, 20));
        System.out.println("Add 3 integers: " + calc.add(5, 15, 25));
        System.out.println("Add 2 doubles: " + calc.add(2.5, 4.5));
        System.out.println("Add int + double: " + calc.add(5, 3.2));
    }
}