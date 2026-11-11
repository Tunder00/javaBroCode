public class variables {
    public static void main(String[] args) {
        // primitive: int, double, char, boolean [stored in stack]
        // reference: String, array, object [reference stored in stack, actually stored in heap]
        int age = 30;
        int year = 2026;
        int quantity = 1;

        System.out.println("the year is " + year + " your age is " + age + " you have quantity of " + quantity);

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A'; //single characters
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Kalyan";
        String food = "pallav";
        String email = "my@mail.com";
        String car = "mustang";
        String color = "yellow";

        System.out.println("hello " + name);
        System.out.println("your favourite food is "+food);

        System.out.println("your choice is a " +color+ " " + year+ " " +car);
        System.out.println("the price is " + currency +price);

        if (forSale){
            System.out.println("the car is not for sale");
        }
        else{
            System.out.println("the car is for sale");
        }
    }
}
