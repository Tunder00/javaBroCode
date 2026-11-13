public class nestedifelse {
    public static void main(String[] args) {

        boolean isStudent = true, isSenior = true;
        double price = 9.99;
        if(isStudent){
            if(isSenior) {
                System.out.println("you get senior discount of 20%");
                System.out.println("you get student discount of 10%");
                price *= 0.7;
            }
            else {
                System.out.println("you get student discount of 10%");
                price *= 0.9;
            }
        } else {
            if(isSenior){
                System.out.println("you will get senior discount of 20%");
                price *= 0.8;
            }
            else {
                System.out.println("you will have to pay full amount");
            }
        }
        System.out.println("amount is paid to be " + price);
    }
}
