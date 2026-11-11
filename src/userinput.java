import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = scanner.nextLine();

        System.out.print("enter your age");
        int age = scanner.nextInt();

        System.out.print("enter your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("are you a studen (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+name);
        System.out.println("you are " +age+ " years old");
        System.out.println("your gpa: " +gpa);
        System.out.println("Student:  " +isStudent);

        if(isStudent){
            System.out.println("you are enrolled as student");
        }
        else {
            System.out.println("you are not enrolled");
        }

        //comon issues

        int age1 = scanner.nextInt();
        scanner.nextLine(); //to skip the enter character to be input for color
        String color = scanner.nextLine();
        System.out.println(age1);
        System.out.println(color);

        scanner.close();
    }
}
