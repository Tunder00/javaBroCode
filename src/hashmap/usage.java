package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class usage {
    public static void main(String[] args) {

        // HashMap = a data structure that stores key-value pairs
        //           keys are unique, but values can be duplicated
        //           does not maintain any order, but is memory efficient
        //           Hashmap<key, value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple",0.50);
        map.put("orange",0.75);
        map.put("banana",0.25);
        map.put("coconut",1.05);
        // map.put("orange",10000000.00); // this will overwrite because keys should be unique

        System.out.println(map); // prints the key value pairs

        map.remove("apple");
        System.out.println(map);

        System.out.println(map.get("orange")); // to get value associated with the key
        System.out.println(map.containsKey("banana")); // this returns a boolean
        System.out.println(map.containsKey("pineapple")); // this returns a boolean

        if(map.containsKey("coconut")){
            System.out.println(map.get("coconut"));
        } else {
            System.out.println("ey not found");
        }
        // as we do not have pineapple else will be executed
        if(map.containsKey("pineapple")){
            System.out.println(map.get("coconut"));
        } else {
            System.out.println("ey not found");
        }

        System.out.println(map.containsValue(1.05)); // this also returns the boolean
        System.out.println(map.size());
        System.out.println(map);

        for(String key : map.keySet()){
            System.out.println(key + " : $"+map.get(key));
        }
    }
}
