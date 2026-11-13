import java.util.Scanner;

public class weightconverter {
    public static void main(String[] args) {

        //weight conversion program

        Scanner scanner = new Scanner(System.in);

        //declare the variables
        double weight, newWeight;
        int choice;

        // prompt for user choice 1. lbs -> kgs 2. kgs -> lbs
        System.out.println("weight conversion program.");
        System.out.println("1. convert to lbs to kgs");
        System.out.println("2. convert to kgs to lbs");
        System.out.print("choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("your weight in kgs is %.2fKgs",newWeight);
        } else if (choice == 2) {
            System.out.print("enter weight in Kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("your weight in lbs is %.2fKgs",newWeight);
        }
        //else invalid choice
        else {
            System.out.println("Invalid choice!!");
        }

        scanner.close();
    }
}
