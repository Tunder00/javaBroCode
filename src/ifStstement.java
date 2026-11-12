import java.util.Scanner;

public class ifStstement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("enter your name ");
        name = scanner.nextLine();

        System.out.print("enter your age ");
        age = scanner.nextInt();

        System.out.print("are you a student (true/false) ");
        isStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("you dont have a name??" );
        }else{
            System.out.println("hello "+name+"!");
        }


        if(age >= 65){
            System.out.println("print you are senior.");
        } else if(age >= 18){
            System.out.println("you are adult");
        } else if (age < 0 ) {
            System.out.println("you haven't been born");
        } else if (age == 0){
            System.out.println("you are a baby.");
        } else {
            System.out.println("you are a child.");
        }

        if(isStudent){
            System.out.println("you are a student");
        } else{
            System.out.println("you are not a student");
        }

        scanner.close();
    }
}
