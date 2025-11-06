package FunctionalInterface.DefaultMethods.PaymentGatewayIntegration;

interface payproc {
    void pay(double a);
    default void refund(double a) { System.out.println("refund " + a); }
}
