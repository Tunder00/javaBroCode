package methodOverriding;

public class Fish extends Animal{

    @Override //its a good practice to add override so every dev understands and annotations also checks the system errors in names
    void move(){
        System.out.println("this animal is swimming.");
    }
}
