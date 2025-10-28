public class Wallet implements PaymentInterface {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " made through Digital Wallet");
    }
}