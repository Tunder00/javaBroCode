package abstraction;

public class usage {
    // abstraction = used to define abstract classses and methods.
    //               Abstraction is the process of hiding implementation details
    //               and showing only the essential features;
    //               abstract classes can't be initiated directly
    //               can contain 'abstract' methods (which must be implemented)
    //               can contain 'concrete' methods (which are inherited)
    public static void main(String[] args) {

//      Shape shape = new Shape(); this is not possible
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);

        circle.display();
        System.out.println(circle.area());
        triangle.display();
        System.out.println(triangle.area());
        rectangle.display();
        System.out.println(rectangle.area());
    }
}
