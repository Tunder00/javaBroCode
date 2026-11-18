import java.util.Arrays;

public class arraysJava {
    public static void main(String[] args) {
        // array = collection of values of same data type
        // think of it as a variable that can store more than one value
        // index value of array starts at 0

        String fruit1 = "apple";
        String[] fruits = {"Apple", "orange", "banana", "coconut"};

        System.out.println(fruit1);
        System.out.println(fruits); // we will get a address as this is non priitive datatype
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        fruits[0] = "pineapple";
        System.out.println(fruits[0]);
//        System.out.println(fruits[4]); //exception error

        int numOfFruits = fruits.length; // to get length of array
        System.out.println(numOfFruits);

        for (int i=0; i<fruits.length; i++){
            System.out.print(fruits[i] + ", ");
        }

        System.out.println();
        //enhanced for
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        System.out.println("-------");
        Arrays.sort(fruits);
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        Arrays.fill(fruits, "pineapple");
        for(String fruit: fruits){
            System.out.println(fruit);
        }

    }
}