import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        // while loop
        Scanner scanner = new Scanner(System.in);

        String name = "";


        while (name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " +name);

//        while(1 == 1){
//            System.out.println("help stuck in a infinite loop");
//        } infinite loop

        String response="";
        while(!response.equals("Q")){
            System.out.println("you are playing a game");
            System.out.print("press Q to quit: ");
            response = scanner.nextLine();
        }
        System.out.println("you quit the game");

        int age = 0;
        while(age <= 0) {
            System.out.print("enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("your age is "+age);

        int age1 = 0;
        do{
            System.out.println("age is "+age1);
        }while(age1 < 0);

        scanner.close();
    }
}
