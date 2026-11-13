import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        //.substring() used to extract a portion of string
        String email = "kalyan@mail.com";
        String username = email.substring(0,6);
        String domain = email.substring(7,15);
        System.out.println(username);
        System.out.println(domain);
        String dynamicUsername = email.substring(0, email.indexOf("@"));
        String dynamicdomain = email.substring(email.indexOf("@")+1);
        System.out.println(dynamicUsername);
        System.out.println(dynamicdomain);


        Scanner scanner = new Scanner(System.in);
        String input,inputUsername,inputDomain;

        System.out.print("enter your name: ");
        input = scanner.nextLine();

        if(input.contains("@")){
            inputUsername = input.substring(0, input.indexOf("@"));
            inputDomain = input.substring(input.indexOf("@")+1);

            System.out.println(inputUsername);
            System.out.println(inputDomain);
        } else {
            System.out.println("emails must contain @");
        }

        scanner.close();
    }
}
