package abstraction;

public abstract class Shape {

    abstract double area(); // this is an abstract method which should be implemented in child classes

    // this is a concrete method this may or maynot be implemented in child
    void display(){
        System.out.println("this is a shape");
    }
}
