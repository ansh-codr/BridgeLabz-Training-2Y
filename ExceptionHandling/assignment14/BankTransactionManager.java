package assignment14;

public class BankTransactionManager {
    public void verifyAccount(String accountNumber) throws AccountNotFoundException {
        if (!accountNumber.equals("ACC123")) {
            throw new AccountNotFoundException("Account not found");
        }
    }

    public void processTransaction(double amount, double balance) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
    }

    public void executeTransaction(String accountNumber, double amount, double balance) throws Exception {
        verifyAccount(accountNumber);
        processTransaction(amount, balance);
        System.out.println("Transaction successful");
    }
}
