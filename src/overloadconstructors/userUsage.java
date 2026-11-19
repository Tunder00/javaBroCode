package overloadconstructors;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;

public class userUsage {
    // overloaded constructors = allow a class to have multiple constructors
    // with different parameter lists.
    // enable objects to be initialised in various ways

    public static void main(String[] args) {

        user user1 = new user("thunder");
        user user2 = new user("sandy","sandy@mail.com");
        user user3 = new user("mandy","mandy@mail.com", 23);
        user user4 = new user();

        System.out.println(user1.userName);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.userName);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.userName);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.userName);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
