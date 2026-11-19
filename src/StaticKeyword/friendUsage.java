package StaticKeyword;

public class friendUsage {
    public static void main(String[] args) {
        // static = makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("adhi");
        Friend friend3 = new Friend("mallu");
        Friend friend4 = new Friend("bekku");
        Friend friend5 = new Friend("hunja");

        Friend.showFriend();

        // you would use the object name directly we can also use freind1.numOfFriends
        // but for static variables its developer standards to use Friend.numOfFriends


        Math.round(3.99); // math is a utility method as we are not
    }
}
