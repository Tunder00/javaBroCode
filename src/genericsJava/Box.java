package genericsJava;

public class Box <T> {

    // t is just a dev standard to store type
    T item; // we are setting data type dynamically when creaing object

    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}
