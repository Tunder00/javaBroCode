import java.util.Scanner;

public class variableScope {
    static int x = 3; // class variable ,, local variables are 1st priority than class
    public static void main(String[] args) {
        // variable scope = where a variable can be accessed
        // local scope
        int x = 1; //local a variable can access inside a method not in another methods this is inside the method main can only be accessed
        System.out.println(x);

        doSomething();
    }
    static void doSomething(){
        int x = 2; //local
        System.out.println(x);
    }
}
