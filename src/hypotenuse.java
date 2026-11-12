import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {

        //hypotenuse C = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        double a,b,c;

        System.out.print("enter side a: ");
        a = scanner.nextDouble();
        System.out.print("enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("the hypotenuse will be: "+c+"cm");

        scanner.close();
    }
}
