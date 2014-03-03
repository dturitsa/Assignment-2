package q4;

/**
 * <p>Demonstrates the methods of the Box class by creating two Box
 * objects, updates them with setter methods, retrieves the value  of their
 * variables with getter methods, and prints out information about them using
 * the toString method.</p>
 *
 * @author Denis Turitsa, Set C
 * @version 1.0
 */
public class BoxTest {
    /**
     * <p>This is the main method. Creates two new Box objects, updates
     * them with getter methods, then prints out information about them
     * using the to String method, and getter methods.</p>
     * 
     *@param args command line arguments.
     */
    public static void main(String[] args) {
        //height of a box
        final int heightA = 4;
        //height of a box
        final int heightB = 10;
        //width of a box
        final int widthA = 3;
        //width of a box
        final int widthB = 11;
        //depth of a box
        final int depthA = 6;
        //depth of a box
        final int depthB = 16;
        
        Box box1 = new Box(heightA, widthA, depthA);
        Box box2 = new Box(heightA, widthA, depthA);
        System.out.println("USING THE TO STRING METHOD:\n" + box1.toString()
                + box2.toString());  
        box2.setHeight(heightB);
        box2.setWidth(widthB);
        box2.setDepth(depthB);
        box2.setFull(true);
        System.out.println("UPDATED BOX2:\n" + box2.toString());
        System.out.println("\nUSING THE GETTER METHODS:\nbox1 dimensions are: "
                + box1.getHeight() + "x" + box1.getWidth() + "x"
                + box1.getDepth() + "\t Full = " + box1.getFull() + "\n"); 
        System.out.println("Question four was called and ran sucessfully.");
    }

};
