package assignment14;

public class Runner {
    public static void main(String[] args) {
        BankTransactionManager bank = new BankTransactionManager();
        try {
            bank.executeTransaction("ACC123", 5000, 10000);
        } catch (AccountNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
