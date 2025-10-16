package javaconcurrency;
/*
 * 
 // Pausing execution of a Thread using sleep()
 * The sleep() method 
 * provided by Thread class allows you to pause the execution 
 * of the currently executing thread for the specified number of milliseconds.
 * This example consists of a for loop which iterates over the messages array, 
 * prints the current message, waits for 2 seconds by calling Thread.sleep(),and then proceeds with the next iteration.
 * sleep() method throws InterruptedException if any thread interrupts the current thread. 
 * InterruptedException is a checked exception and it must be handled.
 */
public class ThreadSleepExample {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        String[] messages = {"If I can stop one heart from breaking,",
                "I shall not live in vain.",
                "If I can ease one life the aching,",
                "Or cool one pain,",
                "Or help one fainting robin",
                "Unto his nest again,",
                "I shall not live in vain"};

        Runnable runnable = () -> {
            System.out.println("Inside : " + Thread.currentThread().getName());

            for(String message: messages) {
                System.out.println(message);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }
        };

        Thread thread = new Thread(runnable);

        thread.start();
    }
}