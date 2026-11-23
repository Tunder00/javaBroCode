package multiThreading;

public class usage {
    public static void main(String[] args) {
        // Multithreading = enables a program to run multiple threads concurrently
        //                  (Thread = a set of instructions that run independently)
        //                  useful for background tasks or time-consuming operations

        // MyRunnable myRunnable = new MyRunnable();
        // Thread thread = new Thread(myRunnable);

        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("game starts");

        // both run concurrently
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join(); // this helps to join our main thread with the threads we create
        } catch (InterruptedException e){
            System.out.println("main thread was interrupted");
        }
        System.out.println("game over");
    }
}
