package inheritance;

public class Dog extends Animal{
 // even though we do not have eat and other methods but it can use eat method directly from the Animal and uses it

    int lives = 1;
    void speak(){
        System.out.println("the dog goes woof");
    }
}
