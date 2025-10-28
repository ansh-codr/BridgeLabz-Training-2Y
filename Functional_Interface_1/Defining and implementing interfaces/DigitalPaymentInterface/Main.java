public class Main {
    public static void main(String[] args) {
        PaymentInterface upi = new UPI();
        PaymentInterface creditCard = new CreditCard();
        PaymentInterface wallet = new Wallet();
        
        System.out.println("Digital Payment System Demo:");
        upi.pay(100.50);
        creditCard.pay(250.75);
        wallet.pay(50.25);
    }
}