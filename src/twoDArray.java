import java.util.Scanner;
import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {
        //2D array = an array where each element is an array.
        // useful in storing a matrix f data

        String[] fruits = {"apple", "orange","banana"};
        String[] vegetables = {"potato", "onion","carrot"};
        String[] meats = {"pork", "chicken","fish"};

        String[][] groceries = {{"apple", "orange","banana"}, {"potato", "onion","carrot"}, {"pork", "chicken","fish"}};
        groceries[0][0] = "pineapple";
        groceries[1][0] = "cucumber";
        groceries[1][2] = "baan";
        groceries[2][1] = "eggs";

        for(String[] foods : groceries){
            for(String food: foods){
                System.out.print(food+" ");
            }
            System.out.println();
        }

        // 2d array that resemble number pad
        char[][] telephone = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}
        };

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
