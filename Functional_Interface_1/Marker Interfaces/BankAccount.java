public class BankAccount implements SensitiveData {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String toString() {
        return "Account: " + accountNumber + ", Balance: $" + balance;
    }
}