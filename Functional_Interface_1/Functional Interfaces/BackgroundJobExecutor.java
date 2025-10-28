public class BackgroundJobExecutor {
    
    public static void main(String[] args) {
        
        Runnable job1 = () -> {
            System.out.println("Task 1 started");
            System.out.println("Task 1 completed");
        };
        
        Runnable job2 = () -> {
            System.out.println("Task 2 started");
            System.out.println("Task 2 completed");
        };
        
        Runnable job3 = () -> {
            System.out.println("Task 3 started");
            System.out.println("Task 3 completed");
        };
        
        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);
        Thread t3 = new Thread(job3);
        
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("All tasks started");
    }
}