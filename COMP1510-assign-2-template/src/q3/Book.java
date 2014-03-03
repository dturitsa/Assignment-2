package q3;

/**
 * The book class creates the framework for a book object which contains
 * the title, author, publisher, and copyright date. This class has getter
 * and setter methods for all these variables. It has two constructors: one
 * with parameters for all of the relevent data about the book, and a
 * constructor without constructor.
 * 
 * @author Denis Turitsa, Set: C
 * @version 1
 */
public class Book {
    /** The title of the book.*/
    private String title;
    
    /** The author of the book.*/
    private String author;
    
    /** The publisher of the book.*/
    private String publisher;
    
    /** The copyright date of the book.*/
    private int cDate;

    /**
     * Constructor for a new Book object; defines its title, author
     * publisher, and copyright date.
     * @param tit - book title
     * @param aut - auhtor's name
     * @param pub - publisher
     * @param cDat - copyright date
     */
    public Book(String tit, String aut, String pub, int cDat) {
        title = tit;
        author = aut;
        publisher = pub;
        cDate = cDat;
    }
    /**
     * Constructor for a new book object with no parameters.
     * The title, author and publisher variables will for the book object will
     *  be null until they are set by the set methods. Copyright date will be
     *   a 0 until it is set.
     * 
     */
    public Book() {
        
    }
    /**
     * Returns the title of the book.
     * @return title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Sets the title of the book.
     * @param tit - title
     */
    public void setTitle(String tit) {
        title = tit;
    }
    /**
     * Returns the author of the book.
     * @return author
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Sets the author of the book.
     * @param aut - author of the book
     */
    public void setAuthor(String aut) {
        author = aut;
    }
    /**
     * Returns the publisher of the book.
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }
    /**
     * Sets the publisher of the book.
     * @param pub - publisher
     */
    public void setPublisher(String pub) {
        publisher = pub;
    }
    /**
     * Returns the copyright date of the book.
     * @return cDate
     */
    public int getcDate() {
        return cDate;
    }
    /**
     * Sets the copyright date of the book.
     * @param cDat - copyright date
     */
    public void setcDate(int cDat) {
        cDate = cDat;
    }
   
    /**
     * Returns a one-line description of the account as a string.
     * @return String containing title, author, publisher, and copyright date.
     */
    public String toString() {
        return ("\n" + title + "\nAuthor: " + author + "\nPublisher: " 
              + publisher + "\tc " + cDate + "\n");

    }
}
