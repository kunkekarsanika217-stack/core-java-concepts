import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {

        System.out.println("=== Checked Exception Example ===");
        readFile("data.txt");

        System.out.println("\n=== Unchecked Exception Example ===");
        divideNumbers(10, 0);
    }

    //  Checked Exception
    // FileNotFoundException is a checked exception
    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: File not found.");
        }
    }

    //  Unchecked Exception 
    // ArithmeticException is an unchecked exception
    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;   // Runtime exception if b = 0
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: Cannot divide by zero.");
        }
    }
}
