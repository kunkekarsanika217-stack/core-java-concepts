 class Account {

    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public void setAccountDetails(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }
}

 class SavingsAccount extends Account {

    public void accountType() {
        System.out.println("Account Type   : Savings Account");
        System.out.println("Interest Rate  : 4%");
    }
}

 class CurrentAccount extends Account {

    public void accountType() {
        System.out.println("Account Type   : Current Account");
        System.out.println("Overdraft      : Available");
    }
}

 class LoanAccount extends Account {

    public void accountType() {
        System.out.println("Account Type   : Loan Account");
        System.out.println("Interest Type  : Floating");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();
        savings.setAccountDetails(1001, "Sanika", 50000);
        savings.displayAccountDetails();
        savings.accountType();

        System.out.println("----------------------------");

        CurrentAccount current = new CurrentAccount();
        current.setAccountDetails(1002, "Vaibhav", 120000);
        current.displayAccountDetails();
        current.accountType();

        System.out.println("----------------------------");

        LoanAccount loan = new LoanAccount();
        loan.setAccountDetails(1003, "Neha", -300000);
        loan.displayAccountDetails();
        loan.accountType();
    }
}