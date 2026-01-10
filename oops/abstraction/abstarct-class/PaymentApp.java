// Abstract class
 abstract class Payment {

    // common variable
    protected double amount;

    // constructor
    public Payment(double amount) {
        this.amount = amount;
    }

    // abstract method (must be implemented by child classes)
    public abstract void processPayment();

    // concrete method (common for all)
    public void printReceipt() {
        System.out.println("Payment of $" + amount + " completed successfully.");
    }
}

 class CreditCardPayment extends Payment {

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

 class UPIPayment extends Payment {

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment...");
    }
}

public class PaymentApp {
    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment(1500);
        payment1.processPayment();
        payment1.printReceipt();

        System.out.println();

        Payment payment2 = new UPIPayment(800);
        payment2.processPayment();
        payment2.printReceipt();
    }
}