package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class usage {
    public static void main(String[] args) {
        // Exception = an event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        // Scanner scanner = new Scanner(System.in); //this can be done it try also
        try{
            System.out.println( 1/ 0);
        } catch(ArithmeticException e){
            System.out.println("you cant divide by zero idiot");
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("that wasn't a number");
        } catch (Exception e){
            // this catches all exception its better to handle specific ones
            System.out.println("something went wrong");
        } finally {
            // scanner.close(); //this may noty be required because we have declaerwd it in the try the java will take caer of closing it.
            System.out.println("this always executes");
        } // finally can be usefull with file closing and this always executes

    }
}
