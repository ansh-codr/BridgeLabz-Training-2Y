public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        
        paypal.pay(100.0);
        paypal.refund(50.0);
    }
}