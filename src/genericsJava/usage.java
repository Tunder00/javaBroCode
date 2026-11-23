package genericsJava;

import java.util.ArrayList;

public class usage {
    public static void main(String[] args) {
        // Generics = a concept where you can write a class, inheritance or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        ArrayList<String> fruits = new ArrayList<>(); // here we are sending <String> but in ArrayList object it will be defined as <T> here t is just a place holder for the data type
        //<T> can also be replaced with any character basically it's a dummy value before the datatype is known
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");


        Box<String> box1 = new Box<>();
        box1.setItem("banana");
        System.out.println(box1.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(3);
        System.out.println(box2.getItem());

        // <T, u> we can have multiple also

        Product<String, Double> product1 = new Product<>("Apple",200.00);
        Product<String, Integer> product2 = new Product<>("Ticket",15);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());

    }
}
