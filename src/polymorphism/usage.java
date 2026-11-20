package polymorphism;

public class usage {
    public static void main(String[] args) {
        // polymorphism = poly = many
        //                morph = shapes/ forms
        //                objects that can identify as other objects.
        //                objects can be treated as objects of common super class

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        // Car[] cars = {car,bike,boat}; incompatible types
        // Bike[] bikes = {car,bike,boat}; incompatible types
        // Boat[] boats = {car,bike,boat}; incompatible types

        Vehicle[] vehicles = {car,bike,boat}; // because all of these are a vehicle themselves

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
        System.out.println("**********");
        // polymorphism achieved with abstract classes Interfaces
        CarI cari = new CarI();
        BikeI bikei = new BikeI();
        BoatI boati = new BoatI();

        cari.go();
        bikei.go();
        boati.go();

        VehicleInterface[] vehiclesi = {bikei,cari,boati};

        for(VehicleInterface vehiclei: vehiclesi){
            vehiclei.go();
        }

    }
}
