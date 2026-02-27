package multithreading;

public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Thread started.");
        System.out.println("Current State inside run(): " + Thread.currentThread().getState());

        try {
            // Thread goes to TIMED_WAITING state
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread finished.");
    }
}