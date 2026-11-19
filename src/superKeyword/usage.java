package superKeyword;

public class usage {
    public static void main(String[] args) {
        // super = refers to the parent class (subclass <- superclass)
        //         used in constructors and method overriding
        //         calls the parent constructor to initialize the attributes

        Person person1 = new Person("Naruto", "uzumaki");
        Student student1 = new Student("itachi","uchiha",5);
        Employee employee1 = new Employee("sakura","haruno",15000);

        person1.showName();

        student1.showName();
        student1.showGpa();

        employee1.showName();
        employee1.showSalary();
    }
}
