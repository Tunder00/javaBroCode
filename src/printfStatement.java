import java.util.Scanner;

public class printfStatement {
    public static void main(String[] args) {
        //printf() = used to print formatted outputs
        // %[flags][width][.precision][specifier-character]

        Scanner scanner = new Scanner(System.in);

        String name = "Kalyan";
        char firstLetter = 'K';
        int age = 23;
        double height = 173.2;
        boolean isEmployed = true;
        //specifier character
        System.out.printf("hello %s\n", name);
        System.out.printf("your name starts with %c\n", firstLetter);
        System.out.printf("your are %d years old\n", age);
        System.out.printf("your are %f cm tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;

        System.out.printf("%f\n",price1);
        System.out.printf("%f\n",price2);
        System.out.printf("%f\n",price3);
        //precision
        System.out.printf("%.1f\n",price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.3f\n",price3);
        //flags + or , or ( or space
        System.out.printf("%+.2f\n",price1);
        System.out.printf("%+.2f\n",price2);
        System.out.printf("%+.2f\n",price3);
        System.out.println("---------------");
        System.out.printf("%,.2f\n",price1);
        System.out.printf("%,.2f\n",price2);
        System.out.printf("%,.2f\n",price3);
        System.out.println("---------------");
        System.out.printf("%(.2f\n",price1);
        System.out.printf("%(.2f\n",price2);
        System.out.printf("%(.2f\n",price3);
        System.out.println("---------------");
        System.out.printf("% .2f\n",price1);
        System.out.printf("% .2f\n",price2);
        System.out.printf("% .2f\n",price3);
        System.out.println("---------------");


        //width
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n",id1); //add 0 padding 4 digits
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);
        System.out.println("------------");
        System.out.printf("%4d\n",id1); //add space padding 4 digits
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);
        System.out.println("------------");
        System.out.printf("%-4d\n",id1); //left justify
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);

        scanner.close();
    }
}
