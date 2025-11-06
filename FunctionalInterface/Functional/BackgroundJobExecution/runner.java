package FunctionalInterface.Functional.BackgroundJobExecution;

public class runner {
    public static void main(String[] a) {
        Runnable r = () -> System.out.println("job done");
        Thread t = new Thread(r);
        t.start();
        try { t.join(); } catch (Exception e) {}
    }
}
