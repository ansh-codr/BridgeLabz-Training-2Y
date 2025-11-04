public class BackgroundJobExecutor {
    static void task(int n) {
        System.out.println("Task " + n + " started");
        System.out.println("Task " + n + " completed");
    }

    public static void main(String[] args) {
        task(1);
        task(2);
        task(3);
        System.out.println("All tasks done");
    }
}