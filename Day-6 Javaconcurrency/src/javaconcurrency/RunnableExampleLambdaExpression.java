package javaconcurrency;
/*
 * 
 * This example can be made even shorter by using Java 8’s lambda expression -
 * 
 */
public class RunnableExampleLambdaExpression {


	    public static void main(String[] args) {
	        System.out.println("Inside : " + Thread.currentThread().getName());

	        System.out.println("Creating Runnable...");
	        Runnable runnable = () -> {
	            System.out.println("Inside : " + Thread.currentThread().getName());
	        };

	        System.out.println("Creating Thread...");
	        Thread thread = new Thread(runnable);

	        System.out.println("Starting Thread...");
	        thread.start();

	    }
	}