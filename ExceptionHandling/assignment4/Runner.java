package assignment4;

public class Runner {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder();
        try {
            order.placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
