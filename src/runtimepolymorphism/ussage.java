package runtimepolymorphism;

import java.util.Scanner;

public class ussage {
    public static void main(String[] args) {
        // runtime polymorphism = when the method that gets executed is decided
        //                        at runtime based on the actual type of object.

        // Animal animal = new Animal() // abstract class cannot be created

        Animal animal; // we will decide which animal ongo

        Scanner scanner = new Scanner(System.in);

        System.out.print("would you like dog or cat as a pet: (1. dog, 2. cat): ");
        int choice = scanner.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else {
            System.out.println("invalid choice");
        }


    }
}
