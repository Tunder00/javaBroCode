package StaticKeyword;

public class Friend {

    static int numOfFriends; // this will become one common variable for all the objects you create
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends ++;
    }
    static void showFriend(){
        System.out.println("you have "+numOfFriends+" total friends"); // as it is a static variable this should not be used
    }
}
