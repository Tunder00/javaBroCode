package polymorphism;

public class BikeI implements VehicleInterface{

    @Override
    public void go(){
        System.out.println("you ride a bike");
    }
}
