package assignment4;

import java.util.Random;

public class OnlineOrder {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random random = new Random();
        int scenario = random.nextInt(3);
        if (scenario == 0) {
            throw new OutOfStockException("Product is out of stock");
        } else if (scenario == 1) {
            throw new PaymentFailedException("Payment processing failed");
        } else {
            System.out.println("Order placed successfully!");
        }
    }
}
