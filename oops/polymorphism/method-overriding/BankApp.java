class Bank {

    public double getInterestRate() {
        return 0.0;
    }
}

// Child class
 class SBI extends Bank {

    @Override
    public double getInterestRate() {
        return 6.5;
    }
}

// Child class
 class HDFC extends Bank {

    @Override
    public double getInterestRate() {
        return 7.2;
    }
}

// Child class
 class ICICI extends Bank {

    @Override
    public double getInterestRate() {
        return 6.8;
    }
}

public class BankApp {

    public static void main(String[] args) {

        Bank bank;

        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate());

        bank = new HDFC();
        System.out.println("HDFC Interest Rate: " + bank.getInterestRate());

        bank = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank.getInterestRate());
    }
}