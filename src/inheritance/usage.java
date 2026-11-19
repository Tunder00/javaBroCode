package inheritance;

import java.util.Scanner;

public class usage {
    public static void main(String[] args) {
        // inheritance = one class inherits the attributes and methods
        //               from another class.
        //               Child <- parent <- Grandparent
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        dog.speak();
        System.out.println(cat.isAlive);
        System.out.println(cat.lives);
        cat.speak();
        dog.eat();
        cat.eat();
        // dog.photosynthesize() / cat.photosynthesize() will not work

        System.out.println(plant.isAlive);
        plant.photosynthesize();

    }
}
