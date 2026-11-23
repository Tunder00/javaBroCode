package AlaramClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class usage {
    public static void main(String[] args) {
        // java Alaram clock

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "src\\AlaramClock\\alarm_sound.wav";

        while (alarmTime == null ) {
            try {
                System.out.print("enter a alaram time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for: " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("invalid format please use HH:MM:SS.");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
