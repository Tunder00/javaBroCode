package timer_timerTasks;

import java.util.Timer;
import java.util.TimerTask;

public class usage {
    public static void main(String[] args) {
        // timer = class that schedules tasks at specific times periodically
        //         useful for: sending notifications, scheduled updates, repetitive actions

        // TimerTask = represents the task that will be executed by the timer
        //             you will extend the TimerTask class to define your task
        //             Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = 3;


            @Override
            public void run(){
                System.out.println("Hello");
                count--;
                if(count <= 0){
                    System.out.println("task complete!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);

    }
}
