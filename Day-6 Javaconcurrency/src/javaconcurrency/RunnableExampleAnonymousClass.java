package javaconcurrency;
/*
 * Note that, instead of creating a class which implements Runnable and then instantiating that class to
 *  get the runnable object, you can create an anonymous runnable by using Java’s anonymous class syntax.
 *  Anonymous classes enable you to make your code more concise. 
 *  They enable you to declare and instantiate a class at the same time. - From Java doc.
 * 
 * 
 */
public class RunnableExampleAnonymousClass {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside : " + Thread.currentThread().getName());
            }
        };

        System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);

        System.out.println("Starting Thread...");
        thread.start();
    }
}