package polymorphism;

public class CarI implements VehicleInterface{

    @Override
    public void go(){
        System.out.println("you drive a car");
    }
}
