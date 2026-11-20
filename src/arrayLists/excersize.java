package arrayLists;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class excersize {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine(); // clear input buffer

        for(int i = 1; i<= numOfFood; i++){
            System.out.print("enter food number "+i+": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}
