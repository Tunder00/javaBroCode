package enums;

import java.sql.SQLOutput;
import java.util.Scanner;

public class usage {
    public static void main(String[] args) {
        // enums = (enumeration) a special kind of class that
        //         represents a fixed set of constants
        //         They improve code readability and are easy to maintain
        //         More efficient with switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            // System.out.println(day);
            // System.out.println(day.getDayNumber());

            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("Its a week day");
                case SATURDAY,
                     SUNDAY,
                     PIZZADAY-> System.out.println("its a weekend");
            }
        } catch (IllegalArgumentException e){
            System.out.println("Please enter a valid day in week.");
        }

        scanner.close();
    }
}
