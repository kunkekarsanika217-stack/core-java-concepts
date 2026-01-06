public class StaticKeyword {

    // Static variable (shared across all objects)
    static int applicationVersion;

    // Static block (executes once when the class is loaded)
    static {
        applicationVersion = 1;
        System.out.println("Static block executed: Application version initialized");
    }

    // Static method (can be called without creating an object)
    public static void displayVersion() {
        System.out.println("Application Version: " + applicationVersion);
    }

    public static void main(String[] args) {
        StaticKeyword.displayVersion();
    }
}