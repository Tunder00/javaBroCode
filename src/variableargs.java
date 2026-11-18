import java.util.Scanner;

public class variableargs {
    public static void main(String[] args) {
        // varargs = allow a method to accept a varying number of arguments
        // makes methods more flexible no need of overloading java will pack arguments into an array

        System.out.println(add(2,3,4,5,6,7,8,9,10,11,12));
        System.out.println(average(1,2,3,4,5,6,7));
        System.out.println(average());
    }
//    static double add(int a, int b){
//        return a+b;
//    }
//    static double add(int a, int b, int c){
//        return a+b+c;
//    }
//    static double add(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
//    static double add(int a, int b, int c, int d, int e){
//        return a+b+c+d+e;
//    }
//    static double add(int a, int b, int c, int d, int e, int f){
//        return a+b+c+d+e+f;
//    }
//    static double add(int a, int b, int c, int d, int e, int f, int g){
//        return a+b+c+d+e+f+g;
//    }
// instead of all above we can declare once and send any number of argumnets
    static int add(int... numbers){

        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }
    static double average(double... numbers){
        double sum = 0;
        if(numbers.length == 0){
            return 0; // done to surpass the zero division error
        }
        for (double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
