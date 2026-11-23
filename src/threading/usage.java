package threading;

import java.sql.SQLOutput;
import java.util.Scanner;

public class usage {
    public static void main(String[] args) {
        // Threading = allows a program to run multiple tasks simultaneously
        //             helps improve performance with time-consuming operations
        //             file I/O, network communications, or any background tasks

        // How to create a thread
        // option 1: extend the thread class (simpler [limited] )
        // option 2: implement the runnable interface (better) [we will be using this]

        // we are running on main thread and lets say we need to wait 10sec for user input if not just stop

        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // this helpss to close with the main thread completes execution.
        thread.start();

        System.out.println("you have 10 secs to enter your name.");
        // the below caode will be running in the main thread so we will not be able to show the user input so we will create a runnable interface
//        for (int i =1; i<=5; i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("thread was interrupted");
//            }
//            if(i == 5){
//                System.out.println("times up!");
//            }
//        } //so we will keep this code in myRunnable

        System.out.print("enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);

        scanner.close();
    }
}
