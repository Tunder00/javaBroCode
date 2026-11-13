import java.util.Scanner;

public class tempratureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp, newtemp;
        String unit;

        System.out.print("enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("enter convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;
        System.out.printf("%.2f ° %s",newtemp,unit);

        scanner.close();
    }
}
