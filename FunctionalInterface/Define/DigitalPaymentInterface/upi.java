package FunctionalInterface.Define.DigitalPaymentInterface;

class upi implements payment {
    private String id;
    public upi(String x) { this.id = x; }
    public void pay(double a) { System.out.println("upi pay " + a + " by " + id); }
}
