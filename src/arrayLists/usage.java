package arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class usage {
    public static void main(String[] args) {

        // ArrayList = a resizable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);

        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(1.99);
        list1.add(2.01);

        System.out.println(list1);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("coconut");

        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
        fruits.add("apple");
        System.out.println(fruits);
        fruits.set(1,"pineapple");
        System.out.println(fruits);
        System.out.println(fruits.get(2));

        System.out.println(fruits.size());
        Collections.sort(fruits);
        System.out.println(fruits);

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
