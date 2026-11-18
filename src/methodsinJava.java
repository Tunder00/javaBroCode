public class methodsinJava {
    // method = a block of reusable code to be executed when called
    public static void main(String[] args) {
//        System.out.println("Happy birthday to you");
//        System.out.println("Happy birthday to you");
//        System.out.println("you are x years old");
//        System.out.println("Happy birthday to you");
//        System.out.println("Happy birthday to you");
//        System.out.println("you are x years old");
//        System.out.println("Happy birthday to you");
//        System.out.println("Happy birthday to you");
//        System.out.println("you are x years old");
        // we can do it like this

        String name = "Kalyan";
        int age = 23;

        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);

        double result = square(3);
        System.out.println(result);
        System.out.println(cube(3));
        System.out.println(getFullName("Kalyan","B N"));
        int age1 = 18;
        if(ageCheck(age1)){
            System.out.println("you can signup");
        } else {
            System.out.println("no you cant signup");
        }

    }
    static void happyBirthday(String name, int age){
        System.out.printf("Happy birthday to you \n");
        System.out.printf("Happy birthday to you %s\n", name);
        System.out.printf("you are %d years old \n", age);
        System.out.printf("Happy birthday to you \n");
    }
    static double square(double number){
        return number*number;
    }
    static double cube(double number){
        return number*number*number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        } else{
            return false;
        }
    }
}
