import java.util.Scanner;
public class breakContinue {
    public static void main(String[] args) {
        //break = break out of a loop (stop)
        // continue = skip current iteration of loop (skip)

        for(int i=0; i<10; i++){

            if(i == 5){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=0; i<10; i++){

            if(i == 5){
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
