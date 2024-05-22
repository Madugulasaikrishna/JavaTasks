//Bank Account Program


public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: INR " + balance);
    }
}


//savings account class
public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance of INR 100 required!");
        } else {
            super.withdraw(amount);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of INR 500:");
        // Create a BankAccount object (A/c No. "BA1234") with initial balance of INR 500
        BankAccount bankAccount1 = new BankAccount("BA1234", 500);

        // Display account details
        System.out.println("Account Details:");
        bankAccount1.displayAccountDetails();

        // Deposit INR 1000 into account BA1234
        System.out.println("Deposit INR 1000 into account BA1234:");
        bankAccount1.deposit(1000);
        System.out.println("New balance after depositing INR 1000: INR " + bankAccount1.getBalance());

        // Withdraw INR 600 from account BA1234
        System.out.println("Withdraw INR 600 from account BA1234:");
        bankAccount1.withdraw(600);
        System.out.println("New balance after withdrawing INR 600: INR " + bankAccount1.getBalance());

        // Create a SavingsAccount object (A/c No. "SA1234") with initial balance of INR 450
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of INR 450:");
        SavingsAccount savingsAccount1 = new SavingsAccount("SA1234", 450);

        // Display account details
        System.out.println("Account Details:");
        savingsAccount1.displayAccountDetails();

        // Withdraw INR 300 from SA1234
        System.out.println("Withdraw INR 300 from SA1234:");
        savingsAccount1.withdraw(300);
        System.out.println("Balance after trying to withdraw INR 300: INR " + savingsAccount1.getBalance());

        // Create a SavingsAccount object (A/c No. "SA1000") with initial balance of INR 300
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of INR 300:");
        SavingsAccount savingsAccount2 = new SavingsAccount("SA1000", 300);

        // Display account details
        System.out.println("Account Details:");
        savingsAccount2.displayAccountDetails();

        // Withdraw INR 250 from SA1000 (balance falls below INR 100)
        System.out.println("Try to withdraw INR 250 from SA1000!");
        savingsAccount2.withdraw(250);
        System.out.println("Balance after trying to withdraw INR 250: INR " + savingsAccount2.getBalance());
    }
}
