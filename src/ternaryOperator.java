import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        // ternary operator ? = return 1 of 2 options if condition is true
        // variable = (condition)? iftrue : ifFalse;

        Scanner scanner = new Scanner(System.in);

        int score,number,hours;
        double income;

        System.out.print("enter your score: ");
        score = scanner.nextInt();
        String isPass = (score>0) ? "Pass":"Fail";
        System.out.println(isPass);

        System.out.print("enter a number: ");
        number = scanner.nextInt();
        String evenOrOdd = (number%2 == 0) ? "even" : "odd";
        System.out.println(evenOrOdd);

        System.out.print("enter time: ");
        hours = scanner.nextInt();
        String timeOfDay = (hours < 12) ? "A.M" : "P.M";
        System.out.println(timeOfDay);

        System.out.print("enter your inome: ");
        income = scanner.nextDouble();
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

        scanner.close();
    }
}
