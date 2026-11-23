package countdownTimer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class usage {
    public static void main(String[] args) {

        // Java timer countdown timer program
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter no. of seconds to count down from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        // anonymous class
        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("Happy new year");
                    timer.cancel(); // if we remove this what will happen is infinite loop of task
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); // task, delay, period

    }
}
