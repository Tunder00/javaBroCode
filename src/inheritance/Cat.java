package inheritance;

public class Cat extends Animal {
    // even though we do not have eat and other methods but it can use eat method directly from the Animal and uses it
    int lives = 9;

    void speak(){
        System.out.println("cat goes meow");
    }
}
