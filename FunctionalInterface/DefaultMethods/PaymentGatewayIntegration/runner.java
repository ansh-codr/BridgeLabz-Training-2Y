package FunctionalInterface.DefaultMethods.PaymentGatewayIntegration;

public class runner {
    public static void main(String[] a) {
        xpay p = new xpay();
        p.pay(100);
        p.refund(50);
    }
}
