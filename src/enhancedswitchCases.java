import java.util.Scanner;

public class enhancedswitchCases {
    public static void main(String[] args) {
        //enhanced switches = replacement of elseif statements
        // (java 14) inside switch we have cases right if it has ':' its normal switch, if it has '->' its a enhanced switch
        // in enhanced switch you may not need to explicitly say break after every case

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("enter the week day (Monday -> saturday): ");
        day = scanner.nextLine().toLowerCase();

        switch (day){
            case "monday","tuesday","wednesday","thursday","friday" -> System.out.println("it is a weekday ");
            case "saturday","sunday" -> System.out.println("it is a weekend ");
            default -> System.out.println("not a day");
        }

        scanner.close();
    }
}
