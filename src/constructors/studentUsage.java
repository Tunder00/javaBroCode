package constructors;
import java.util.Scanner;
import java.util.Random;

public class studentUsage {
    public static void main(String[] args) {
        // constructor  = a special method within a class to initilize objects
        //          you can pass arguments to a constructors
        //          and set up initial values
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Student student1 = new Student("spongebob", 30, 3.2);
        Student student2 = new Student("patrick", 34, 1.5);
        Student student3 = new Student("john", 26, 2.6);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
    }
}
