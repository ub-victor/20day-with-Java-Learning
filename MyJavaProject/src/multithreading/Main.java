package multithreading;

public class Main {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        // State after creation
        System.out.println("State after creation: " + t1.getState());

        // Start thread
        t1.start();

        // State after start
        System.out.println("State after start(): " + t1.getState());

        try {
            // Small delay to observe state
            Thread.sleep(500);
            System.out.println("State during execution: " + t1.getState());

            // Wait until thread completes
            t1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final state
        System.out.println("State after completion: " + t1.getState());
    }
}