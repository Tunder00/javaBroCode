package anonymousClass;

public class usage {
    public static void main(String[] args) {
        // anonymous class = a class that doesn't have a name. cannot be reused
        //                   add custom behavior without having to create a new class.
        //                   often used for one time uses (TimerTask, runnable, callbacks)

        Dog dog1 = new Dog();

        // rather doing this we can do is create a anonymous class
        TalkingDog talkingDog = new TalkingDog();

        dog1.speak();
        talkingDog.speak();

        // this is a anonymous class for one use
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scobby doo says ruh roh");
            }
        };

        dog2.speak();
    }
}
