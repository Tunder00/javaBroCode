package arrayOfObjects;

public class useCar {

    public static void main(String[] args) {

        Car car1 = new Car("Mustang","Red");
        Car car2 = new Car("chorvetee","blue");
        Car car3 = new Car("lamborghini","Yellow");

//        Car[] cars = new Car[3];
        Car[] cars = {car1,car2,car3};

        for (int i=0; i< cars.length; i++){
            cars[i].drive();
        }

        System.out.println("*****");

        for (Car car: cars){
            car.drive();
        }

        System.out.println("**********");

        Car[] cars1 = {new Car("Mustang", "red"),
                        new Car("chorvette","blue")
                        , new Car("charger", "yellow")};  // this is called as creating anonymous objects

        for (Car car: cars){
            car.color = "black";
        }
        for (Car car: cars){
            car.drive();
        }
    }
}
