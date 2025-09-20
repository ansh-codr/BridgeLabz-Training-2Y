// Hierarchical Inheritance Sample 1: Bank Account Types

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account [acc=" + getAccountNumber() + ", balance=" + getBalance() + ", rate=" + interestRate + "]");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account [acc=" + getAccountNumber() + ", balance=" + getBalance() + ", limit=" + withdrawalLimit + "]");
    }
}

class FixedDepositAccount extends BankAccount {
    private int termMonths;

    public FixedDepositAccount(String accountNumber, double balance, int termMonths) {
        super(accountNumber, balance);
        this.termMonths = termMonths;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account [acc=" + getAccountNumber() + ", balance=" + getBalance() + ", term=" + termMonths + " months]");
    }
}

public class BankAccountHierarchicalMain {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[] {
            new SavingsAccount("SA-001", 50000, 0.04),
            new CheckingAccount("CA-002", 20000, 10000),
            new FixedDepositAccount("FD-003", 150000, 12)
        };
        for (BankAccount acc : accounts) {
            acc.displayAccountType();
        }
    }
}
