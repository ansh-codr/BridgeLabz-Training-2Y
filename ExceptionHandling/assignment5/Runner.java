package assignment5;

public class Runner {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        try {
            transaction.processTransaction(5000, 10000);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}
