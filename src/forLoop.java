import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) throws InterruptedException{
        // for loop is a certain number of time not like while

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<10; i++ /*initialization; condition; increment or decrement*/){
            System.out.println(i);
        }

        System.out.print("enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i =1; i<=max; i++){
            System.out.println(i);
        }

        System.out.print("how many seconds do you need count down from: ");
        int start = scanner.nextInt();
        for(int i=start; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy new year!!!");

        scanner.close();
    }
}
