package polymorphism;

public class BoatI implements VehicleInterface{

    @Override
    public void go(){
        System.out.println("you sail a boat");
    }
}
