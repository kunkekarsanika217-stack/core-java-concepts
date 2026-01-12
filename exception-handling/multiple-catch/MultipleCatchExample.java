public class MultipleCatchExample {

    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};

            int result = numbers[2] / 0;   // May throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Cannot divide by zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles invalid array index access
            System.out.println("Error: Array index is out of bounds.");

        } catch (Exception e) {
            // Handles any other unexpected exception
            System.out.println("Error: Something went wrong.");

        } finally {
            // Always executed
            System.out.println("Program execution completed.");
        }
    }
}