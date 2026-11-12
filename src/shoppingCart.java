import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("what item would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("Enter the price: ");
        price = scanner.nextDouble();

        System.out.print("what is the quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("you have bought " +quantity+ " "+item+"/s ");
        System.out.println("your total is "+currency+total);

        scanner.close();
    }
}
