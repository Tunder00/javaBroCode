package composition;

public class usage {
    public static void main(String[] args) {
        // composition = represents a part of relationship between objects.
        //               For example an engine is part of a car.
        //               Allows complex objects to be constructed from smaller objects

        // in here the engine is tightly coupled with car if a car is gone engine is also gone.
        Car car = new Car("corvette", 2025, "v8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
