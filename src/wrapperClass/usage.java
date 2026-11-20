package wrapperClass;

public class usage {
    public static void main(String[] args) {
        // wrapper classes = Allow primitive values (int, double, char, boolean)
        //                   to be used as objects. "wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of collections framework and static utility methods.

        // int a = 123;

        // below is wrapping primitives as a object below is how it was done in older java versions
        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character('$');
        // Boolean d = new Boolean(true);

        // newer version is directly assigning values to the wrapper class also called as autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean w = d;

        String a1 = Integer.toString(123);
        String b1 = Double.toString(3.14);
        String c1 = Character.toString('@');
        String d1 = Boolean.toString(false);

        String x1 = a1 + b1 + c1 + d1;
        System.out.println(x1);

        //parsing
        int a2 = Integer.parseInt("123");
        double b2 = Double.parseDouble("3.14");
        char c2 = "Pizza".charAt(0); // character doesnt have parse character
        boolean d2 = Boolean.parseBoolean("true");

        // now we cannot add these together
        // String x2 = a2+b2+c3+d2;


        char letter = 'g';
        // char letter = '$';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
        System.out.println(Character.isLowerCase(letter));
    }
}
