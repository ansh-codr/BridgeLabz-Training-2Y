package FunctionalInterface.Define.DigitalPaymentInterface;

class card implements payment {
    private String num;
    public card(String x) { this.num = x; }
    public void pay(double a) { System.out.println("card pay " + a + " by " + num); }
}
