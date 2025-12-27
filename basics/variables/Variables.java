public class Variables {

    // Instance variables (unique to each student)
    int studentId;
    String studentName;

    // Static variable (shared across all students)
    static String schoolName = "Greenwood High";

    // Method demonstrating local variable
    public void displayStudentInfo() {
        String grade = "A"; // local variable

        System.out.println("Student ID    : " + studentId);
        System.out.println("Student Name  : " + studentName);
        System.out.println("School Name   : " + schoolName);
        System.out.println("Grade         : " + grade);
    }

    //StartOfMainMethod
    public static void main(String[] args) {
        // Accessing static variable without object
        System.out.println("Welcome to " + Variables.schoolName);
        System.out.println("-------------------------");

        // Creating objects for instance variables
        Variables s1 = new Variables();
        s1.studentId = 1;
        s1.studentName = "Anaya";

      Variables s2 = new Variables();
        s2.studentId = 2;
        s2.studentName = "Rohan";

        // Display student details
        s1.displayStudentInfo();
        System.out.println("-------------------------");
        s2.displayStudentInfo();
    }
 
}