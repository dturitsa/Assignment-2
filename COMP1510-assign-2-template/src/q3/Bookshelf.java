package q3;

/**
 * <p>Creates 2 Book objects and demonstrates the use of all methods in the 
 * Book class.</p>
 *
 * @author Denis Turitsa, Set C
 * @version 1.0
 */
public class Bookshelf {
    /**
     * <p>This is the main method. Creates two book objects, one using
     *  the constructor with parameters, and one using the constructor 
     *  without parameters. Then updates one of the objects with setter 
     *  methods, and prints out info about the objects using  getter
     *  methods, and the toString method of the Book class.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        //an example of a copyright date
        final int date1 = 1961;
        //another example of a copyright date
        final int date2 = 1997;
        //creates a new Book object with parameters
        Book book1 = new Book("Crime and Punishment", "Fyodor Dostoyevsky", 
                "Modern Library", date1);
        //creates a new Book object without parameters
        Book book2 = new Book();
        book2.setTitle("Harry Potter and the Philosopher's Stone");
        book2.setAuthor("J.K. Rowling");
        book2.setPublisher("Raincoast Books");
        book2.setcDate(date2);
        
        System.out.println("USING THE GETTER METHODS:\n" + book1.getTitle()
                + ", by " + book1.getAuthor() + ".\nPublished by "
                + book1.getPublisher()
                + ", " + book1.getcDate() + "\n");
        System.out.println("USING THE TO STRING METHOD:" + book1.toString()
                + book2.toString());

        System.out.println("Question three was called and ran sucessfully.");
    }

   
}
