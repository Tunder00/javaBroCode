import java.util.Scanner;

public class overloadMethods {
    public static void main(String[] args) {
        // overloading methods =  methods with same name but different parameters

        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));

        String Pizza = bakePizza("flat bread","mozzarella","pepperoni");
        System.out.println(Pizza);


    }
    static double add(double a, double b) {
        return a+b;
    }
    static double add(double a, double b, double c) {
        return a+b+c;
    }
    static double add(double a, double b, double c, double d) {
        return a+b+c;
    }
    static String bakePizza(String bread){
        return bread + " Pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese+ " " + bread + " Pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping+" "+cheese+ " " + bread + " Pizza";
    }

}
