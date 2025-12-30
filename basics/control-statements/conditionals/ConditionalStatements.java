public class ConditionalStatements {

    public static void main(String[] args) {

        // Simple if
        int age = 20;
        if (age >= 18) {
            System.out.println("Eligible for voting");
        }

        // if-else
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // if-else-if ladder
        int marks = 68;
        if (marks >= 75) {
            System.out.println("Distinction");
        } else if (marks >= 60) {
            System.out.println("First Class");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}