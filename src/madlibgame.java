import java.util.Scanner;

public class madlibgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("enter a adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("enter a NOUN (ANIMAL/PERSON): ");
        noun1 = scanner.nextLine();
        System.out.print("enter a adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("enter a verb (action): ");
        verb1 = scanner.nextLine();
        System.out.print("enter a adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\ntoday i went to a "+adjective1+ "zoo");
        System.out.println("in a exhibit i saw a "+noun1+".");
        System.out.println(noun1 + "was " +adjective2+ " and "+verb1+"!");
        System.out.println("I was "+adjective3+"!");

        scanner.close();
    }
}
