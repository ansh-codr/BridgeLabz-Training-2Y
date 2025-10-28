public class PayPal implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via PayPal");
    }
}