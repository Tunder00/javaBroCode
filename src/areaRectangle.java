import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("enter width: ");
        width = scanner.nextDouble();
        System.out.print("enter height: ");
        height = scanner.nextDouble();
        area = width * height;
        System.out.print("the area is: " +area+ "cm²");

        scanner.close();
    }
}
