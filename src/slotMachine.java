import java.util.Scanner;
import java.util.Random;

public class slotMachine {
    public static void main(String[] args) {
        // slot machine program

        Scanner scanner = new Scanner(System.in);
        // declare variables
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // welcome message
        System.out.println("******");
        System.out.println("welcome to java slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("******");

        // play if our balance > 0
        while (balance > 0){
            // enter the bet amount
            System.out.println("your balance is: "+balance);
            System.out.print("enter bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            // verify the bet > balance
            if (bet > balance){
                System.out.println("insufficient funds");
                continue;
            }
            // verify bet> 0
            else if(bet <= 0){
                System.out.println("bet must be greater than 0");
                continue;
            }
            // substract bet from balance
            else{
                balance -= bet;
            }

            // spin row
            System.out.println("spinning..");
            row = spinRow();
            printRow(row);
            payout = getPayout(row,bet);
            if (payout > 0){
                System.out.println("you won: "+payout);
                balance += payout;
            } else{
                System.out.println("sorry you lost this round");
            }
            // ask to play again
            System.out.print("do you want to play again (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
            if(!playAgain.equals("Y")){
                break;
            }
        }

        // exit message
        System.out.println("game over your final balance is: "+balance);

        scanner.close();
    }
    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();
        for (int i = 0; i<3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    // print row
    static void printRow(String[] row){
        System.out.println("******");
        System.out.println(" "+String.join(" | ", row));
        System.out.println("******");
    }
    // get payout
    static int getPayout(String[] row, int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
