package assignment5;

import java.util.Random;

public class Transaction {
    public void processTransaction(int amount, int balance) throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        Random random = new Random();
        int scenario = random.nextInt(3);
        if (scenario == 0) {
            throw new NegativeAmountException("Transaction failed: Negative amount not allowed");
        } else if (scenario == 1) {
            throw new InsufficientFundsException("Transaction failed: Insufficient balance");
        } else if (scenario == 2) {
            throw new NetworkFailureException("Transaction failed: Network connection lost");
        }
    }
}
