package toString;

public class usage {
    public static void main(String[] args) {
        // .toString() = method inherited from the object class. [object create class has toString method by default but can be overridden]
        //               used to return a string representation of an object
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car1 = new Car("Ford" ,"Mustang", 2025, "Red");
        Car car2 = new Car("Lamborghini" ,"urus", 2026, "Yellow");

        System.out.println(car1); // a hashcode a unique identifier of a object by default before @override toString method
        System.out.println(car1);

    }
}
