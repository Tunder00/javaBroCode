import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {

        // linear search
        int[] numbers = {1,2,4,5,7,8,9,0};
        String[] fruits = {"apple","orange","banana"};
        int target = 0;
        String target1 = "pinapple";
        boolean isFound = false;
        boolean isFoundFruit = false;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] == target){
                System.out.println("element found at index "+i);
                isFound = true;
                break;
            }
        }

        for(int i=0; i<fruits.length;i++){
            if(fruits[i].equals(target1)){
                System.out.println("element found at index "+i);
                isFoundFruit = true;
                break;
            }
        }


        if(!isFound){
            System.out.println("element not found in array");
        }
        if(!isFoundFruit){
            System.out.println("fruit not found in array");
        }

        Scanner scanner = new Scanner(System.in);
        String target2;
        boolean isFoundFruit1 = false;
        System.out.print("enter a fruit to search for: ");
        target2 = scanner.nextLine();
        for(int i=0; i<fruits.length;i++){
            if(fruits[i].equals(target2)){
                System.out.println("element found at index "+i);
                isFoundFruit1 = true;
                break;
            }
        }
        if(!isFoundFruit1){
            System.out.println("fruit not found in array");
        }

    }
}
