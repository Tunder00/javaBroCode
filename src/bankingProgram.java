import java.util.Scanner;

public class bankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // java banking program for beginners

        //declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            // display menu
            System.out.println("*****");
            System.out.println("Banking program");
            System.out.println("*****");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****");

            // get and process users choice
            System.out.print("enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("not a valid choice");
            }
        }

        // exit message
        System.out.println("thankyou have a nice day");

        scanner.close();
    }
    //show balance()
    static void showBalance(double balance){
        System.out.println("*****");
        System.out.printf("your balance is $%.2f\n", balance);
        System.out.println("*****");
    }

    // deposit()
    static double deposit(){
        double amount;
        System.out.print("enter amount to be deposited: ");
        amount = scanner.nextDouble();
        if (amount < 0){
            System.out.println(" amount cant be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

    // withdraw()
    static double withdraw(double balance) {
        double amount;
        System.out.print("enter amount to withdrawn: ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("insufficient funds");
            return 0;
        }
        else if(amount < 0){
            System.out.println("amount cant be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

}
