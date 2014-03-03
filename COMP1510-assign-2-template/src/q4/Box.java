package q4;
/**
 * <p> Demonstrates the relationship between classes and methods, by creating a
 * class that represents a box with a width, height, depth, and fullness. 
 * this class has a constructor with parameters for the height, width and depth;
 * getter and setter methods for all 4 variables; and a to String method. </p>
 * @author Denis Turitsa, Set: C
 * @version 1.0
 */
public class Box {
    /**The height of the box. */
    private int height;
    /**The width of the box. */
    private int width;
    /**The depth of the box. */
    private int depth;
    /**fullness of the box; true if the box is full. */
    private boolean full;
    /**
     * <p>Constructor for a new Box objects. Has parameters for the
     *  dimensions of the box. Fullness is set to false by default. </p>
     * @param boxHeight - height of the box
     * @param boxWidth - width of the box
     * @param boxDepth - depth of the box
     */
    public Box(int boxHeight, int boxWidth, int boxDepth) {
        setHeight(boxHeight);
        width = boxWidth;
        depth = boxDepth;
        full = false;
    }
    /**
     * Returns the current value of the box height.
     * @return height - box height
     */
    public int getHeight() {
        return height;
    }
    /**
     * Updates the height of the box with a new value.
     * @param boxHeight - height of the box
     */
    public void setHeight(int boxHeight) {
        height = boxHeight;
    }
    /**
     * Returns the current value of the box width.
     * @return width - box width
     */
    public int getWidth() {
        return width;
    }
    /**
     * Updates the width of the box with a new value.
     * @param boxWidth - width of the box
     */    
    public void setWidth(int boxWidth) {
        width = boxWidth;
    } 
    /**
     * Returns the current value of the box depth.
     * @return depth - box depth
     */    
    public int getDepth() {
        return depth;
    }
    /**
     * Updates the depth of the box with a new value.
     * @param boxDepth - depth of the box
     */    
    public void setDepth(int boxDepth) {
        depth = boxDepth;
    }
    /**
     * Returns true if the box is full.
     * @return full - is the box full?
     */
    public boolean getFull() {
        return full;
    }
    /**
     * Updates the full variable of the box.
     * @param boxFull - whether or not the box is full
     */
    public void setFull(boolean boxFull) {
        full = boxFull;
    } 
    /**
     * <p>The to String method for the box class. Returns a formatted string.
     * Contains the dimensions of the box and whether or not it's full. </p>
     * @return String - the variables of the box objects in a single string
     */
    public String toString() {
        return "Height: " + height + "\tWidth: " + width
                + "\tdepth" + depth + "\tFull: " + full + "\n";
    }
    
}
