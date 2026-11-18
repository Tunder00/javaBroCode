import java.util.Scanner;
import java.util.Arrays;

public class userInputArray {
    public static void main(String[] args) {

        String[] foods = {"Pizza", "Taco", "Hamburger"}; //once you set a size you cannot change
        String[] foods1 = {}; //empty array
        System.out.println(foods1.length);
//        foods1[0] = "pizza"; // cannot be done

        String[] foods2 = new String[3];
        System.out.println(foods2.length);
        foods2[0] = "pizza";
        foods2[1] = "tco";
        foods2[2] = "dose";

        for(String food: foods2){
            System.out.println(food);
        }


        //user input array
        Scanner scanner = new Scanner(System.in);

        String[] foods3;
        int size;

        System.out.print("what number of food you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods3 = new String[size];

        for (int i=0; i<foods3.length; i++){
            System.out.print("enter a food: ");
            foods3[i] = scanner.nextLine();
        }

        for(String food3: foods3){
            System.out.println(food3);
        }

        scanner.close();
    }
}
