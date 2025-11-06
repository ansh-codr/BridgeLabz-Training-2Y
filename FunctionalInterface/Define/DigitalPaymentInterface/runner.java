package FunctionalInterface.Define.DigitalPaymentInterface;

public class runner {
    public static void main(String[] a) {
        payment p1 = new upi("x@y");
        payment p2 = new card("1111");
        payment p3 = new wallet(1000);
        p1.pay(100);
        p2.pay(200);
        p3.pay(300);
    }
}
