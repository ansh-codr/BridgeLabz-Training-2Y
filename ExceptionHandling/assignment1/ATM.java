package assignment1;

public class ATM {
    private int balance;

    public ATM(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed! You tried to withdraw ₹" + amount + ", but your available balance is only ₹" + balance + ".");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! You withdrew ₹" + amount);
        System.out.println("Remaining balance: ₹" + balance);
    }
}
