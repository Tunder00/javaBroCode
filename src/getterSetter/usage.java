package getterSetter;

public class usage {
    public static void main(String[] args) {
        // they help protect object data and rules for accessing or modifying them
        // getters = methods that make a field readable.
        // setters = methods that make a field writable

        Car car = new Car("Lamborghini", "yellow", 50000);

        // car.model = "ferrari"; // as private variables we cannot access directly
        // System.out.println(car.color+" "+car.model+" "+car.price); // as private variables we cannot access directly

        System.out.println(car.getColor()+" "+car.getModel()+" "+car.getPrice());

        //car.color = "blue";
        //car.price = 60000;
        // currently we do not have a set model that cannot be changed after creation

        car.setColor("blue");
        car.setPrice(60000);
        System.out.println(car.getColor()+" "+car.getModel()+" "+car.getPrice());
        car.setPrice(-100);

    }
}
