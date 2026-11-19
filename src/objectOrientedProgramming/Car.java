package objectOrientedProgramming;

public class Car {

    String make = "Lamborghini";
    String model = "urus";
    int year = 2025;
    double price = 50000.00;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("you started the engine. ");
    }
    void stop(){
        isRunning = false;
        System.out.println("you stop the engine.");
    }
    void drive(){
        System.out.println("you drive the "+model);
    }
    void brake(){
        System.out.println("you break the "+model);
    }
}
