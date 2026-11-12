import java.util.Scanner;

public class circlePractice {
    public static void main(String[] args) {

        //circumference = 2.Math.PI * radius;
        // area = Math.PI * Math.Pow(radius, 2);
        //volume = (4.0/3.0) * Math.PI.Math.pow(radius,3);

        Scanner scanner = new Scanner(System.in);

        double radius, circumference, area, volume;

        System.out.print("enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("circumference will be: "+circumference+"cm");
        System.out.println("area will be: "+area+"cm²");
        System.out.println("volume will be: "+volume+"cm³");

        System.out.printf("circumference will be: %.1f cm\n",circumference);
        System.out.printf("area will be: %.1f cm²\n",area);
        System.out.printf("volume will be: %.1f cm³\n",volume);

        scanner.close();
    }
}
