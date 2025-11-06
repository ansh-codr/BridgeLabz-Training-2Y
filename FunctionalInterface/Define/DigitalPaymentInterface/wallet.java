package FunctionalInterface.Define.DigitalPaymentInterface;

class wallet implements payment {
    private double bal;
    public wallet(double x) { this.bal = x; }
    public void pay(double a) {
        if (bal >= a) { bal -= a; System.out.println("wallet pay " + a + ", left " + bal); }
        else { System.out.println("no money"); }
    }
}
