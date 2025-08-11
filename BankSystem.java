import java.util.ArrayList;

class Account {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;

    // Constructor
    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: " + initialBalance);
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + " | Balance: " + balance);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount + " | Balance: " + balance);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    // Show balance
    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Transaction history
    public void showTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        Account acc = new Account("Nitesh Sharma", 5000);

        acc.deposit(2200);
        acc.withdraw(1000);
        acc.deposit(3300);
        acc.withdraw(8500); // Example of insufficient funds

        acc.showBalance();
        acc.showTransactionHistory();
    }
}
