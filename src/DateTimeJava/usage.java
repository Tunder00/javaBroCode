package DateTimeJava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class usage {
    public static void main(String[] args) {
        // how to work with dates and times using java
        // local date, local time, local date time, utc timestamp

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        // custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newDateTime = dateTime.format(formatter);

        System.out.println(newDateTime);


        LocalDate date1 = LocalDate.of(2026, 12, 25);
        LocalDateTime dateTime1 = LocalDateTime.of(2026,12,25,12,0,0);
        LocalDateTime dateTime2 = LocalDateTime.of(2027,12,25,12,0,0);

        System.out.println(date1);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

        if(dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1+" is earlier than "+dateTime2);
        } else if(dateTime1.isAfter(dateTime2)) {
            System.out.println(dateTime1+" is later than "+dateTime2);

        } else if(dateTime1.isEqual(dateTime2)){
            System.out.println(dateTime1+" is equal to "+dateTime2);
        }
    }
}
