package aggregation;

public class usage {
    public static void main(String[] args) {
        // aggregation = represents a "has-a" relationship between objects
        //               one object contains another object as a part of its structure
        //               but the contained object/s can exist independently

        Book book1 = new Book("harry potter", 360);
        Book book2 = new Book("Psycology of money", 250);
        Book book3 = new Book("Game of thrones", 200);

        System.out.println(book1.displayInfo());
        System.out.println(book2.displayInfo());
        System.out.println(book3.displayInfo());

        System.out.println("*********");
        Book[] books = {book1, book2, book3};

        for(Book book : books){
            System.out.println(book.displayInfo());
        }
        System.out.println("***********");
        //library has a relationship with books can exist without library
        //but library cannot exist without books in it
        // in this example book is a independent object
        Library library = new Library("KA public library", 1971, books);

        library.displayInfo();
    }
}
