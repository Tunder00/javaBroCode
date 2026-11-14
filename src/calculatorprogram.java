import java.util.Scanner;
public class calculatorprogram {
    public static void main(String[] args) {
        //calculator program

        Scanner scanner = new Scanner(System.in);

        double num1, num2, result = 0;
        char operator;
        boolean validOperation = true;


        System.out.print("enter the 1st number: ");
        num1 = scanner.nextDouble();

        System.out.print("enter a character ( +,  -, *,  /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("enter the 2nd number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("cannot divide by 0");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
        }

        if(validOperation) {
            System.out.println(result);
        }

        scanner.close();
    }
}
