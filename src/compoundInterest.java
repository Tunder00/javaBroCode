import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        //compound interest = P * Math.pow((1+r/n), n*t)

        Scanner scanner = new Scanner(System.in);

        double principal,rate,amount;
        int timesCompound, years;

        System.out.print("enter principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("enter the rate in %: ");
        rate = scanner.nextDouble() / 100; //converting it to percentage

        System.out.print("enter the times compounded per year: ");
        timesCompound = scanner.nextInt();

        System.out.print("enter the no of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1+rate/timesCompound, timesCompound * years);

        System.out.println("the amount after "+years+" is: $"+amount);
        System.out.printf("the amount after %d will be $%.2f", years, amount);
        scanner.close();
    }
}
