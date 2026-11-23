package AlaramClock;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alramTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alramTime, String filePath, Scanner scanner){
        this.alramTime = alramTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run(){
        // LocalTime now = LocalTime.now();
        // System.out.println(now);
        while(LocalTime.now().isBefore(alramTime)){
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();
                // int hours = now.getHour();
                // int minutes = now.getMinute();
                // int seconds = LocalTime.now().getSecond();
                // System.out.println(hours+" : "+minutes+" : "+seconds);

                System.out.printf("\r%02d:%02d:%02d",
                                    now.getHour(),
                                    now.getMinute(),
                                    now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("thread was interrupted.");
            }
        }
        System.out.println("\n*alaram noises*");
        // Toolkit.getDefaultToolkit().beep(); just to get a beep
        playSound(filePath);

    }
    private void playSound(String filePath){
        File audioFile = new File(filePath);
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.print("press enter to stop the alarm: ");
            scanner.nextLine();
            clip.stop();
            // Thread.sleep(5000);
            scanner.close();
        } catch (UnsupportedAudioFileException e) {
            System.out.println("file format not supported.");
        } catch (LineUnavailableException e) {
            System.out.println("audio is unavailable");
        } catch (IOException e){
            System.out.println("error reading audio file ");
        }
    }
}
