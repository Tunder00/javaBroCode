public class stringmethods {
    public static void main(String[] args) {
        String name = "Kalyan B N";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("a");
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        name = "    Kalyan B N    ";
        name = name.trim();
        System.out.println(name);

        name = name.replace("a","b");
        System.out.println(name);

        name = "";
        if(name.isEmpty()){
            System.out.println("no name");
        }
        else{
            System.out.println("hellow "+name);
        }

        name = "Kalyan B N";
        if(name.contains(" ")){
            System.out.println("has spaces");
        }else {
            System.out.println("doesnt contain spaces");
        }

        if(name.equals("password")){
            System.out.println("your name cant be password");
        } else{
            System.out.println("hello "+name);
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("your name cant be password");
        } else {
            System.out.println("hellow "+name);
        }
    }
}
