package javaconcurrency;
/*
 * Waiting for completion of another thread using join()
 * The join() method allows one thread to wait for the completion of the other. 
 * In the following example, Thread 2 waits for the completion of Thread 1 for 1000 milliseconds by calling Thread.join(1000), 
 * and then starts the execution -
 * The waiting time for Thread.join() is equal to MIN(time taken for the thread to terminate, 
 * number of milliseconds specified in the method argument).
 * The join() method can also be called without an argument. It this case, it simply waits until the thread dies.
 */
public class ThreadJoinExample {

    public static void main(String[] args) {
        // Create Thread 1
        Thread thread1 = new Thread(() -> {
            System.out.println("Entered Thread 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Exiting Thread 1");
        });

        // Create Thread 2
        Thread thread2 = new Thread(() -> {
            System.out.println("Entered Thread 2");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Exiting Thread 2");
        });

        System.out.println("Starting Thread 1");
        thread1.start();

        System.out.println("Waiting for Thread 1 to complete");
        try {
            thread1.join(1000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        System.out.println("Waited enough! Starting Thread 2 now");
        thread2.start();
    }
}