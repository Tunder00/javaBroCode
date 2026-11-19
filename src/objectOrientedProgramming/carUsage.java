package objectOrientedProgramming;

import java.util.Scanner;
import java.util.Random;


public class carUsage {
    public static void main(String[] args) {
        // object = an entity that holds data (attributes) [stored in heap]
        //          and can perform actions (methods)
        //          it's a reference data type
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car car = new Car();
        Car car2 = new Car();

        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.start();
        System.out.println(car.isRunning);

        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();

        System.out.println("******");
        System.out.println(car.make + " "+car.model);
        System.out.println(car2.make + " "+car2.model);
    }
}
