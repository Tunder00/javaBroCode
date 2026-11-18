import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args) {
        // nested loop is loop inside a loop
        // used often in matrices or DSA

        for (int i =1; i<=3; i++) {
            for (int j =1; j<=9; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        int rows, columns;
        char symbol;

        System.out.print("enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("enter the number of columns: ");
        columns = scanner.nextInt();
        System.out.print("enter a symbol to use: ");
        symbol = scanner.next().charAt(0);

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(symbol+ " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
