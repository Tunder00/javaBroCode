import java.util.Scanner;
public class logicalOperator {
    public static void main(String[] args) {
        // && = AND multiple condition should be true
        // || = OR any one condition can be true
        // ! = NOT opposite of whatever the input is

        Scanner scanner = new Scanner(System.in);

        double temp;
        boolean isSunny;

        temp = scanner.nextDouble();
        isSunny = scanner.nextBoolean();

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD. ");
            System.out.println("The sun is out. ");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good");
            System.out.println("its cloudy");
        } else if (temp > 30 || temp < 0) {
            System.out.println("weather is bad");
        }


        //validate user name
        // should be btwn 4-12 chars, should not contain spaces or underscores

        String userName;
        System.out.print("enter username: ");
        scanner.nextLine(); // to skip temp enter
        userName = scanner.nextLine();

        if (userName.length() < 4 || userName.length() > 12) {
            System.out.println("username must be btwn 4-12 chars");
        }
        else if(userName.contains(" ") || userName.contains("_")) {
            System.out.println("username must not contain spaces or underscores");
        }
        else {
            System.out.println("welcome "+userName);
        }

        scanner.close();
    }
}
