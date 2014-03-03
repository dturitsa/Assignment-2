package q1;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * <p>Takes the side lengths of a triangle from the user,
 * computes and prints out the area, and perimeter of the triangle.</p>
 *
 * @author Denis Turitsa, Set C
 * @version 1.0
 */
public class TriangleArea {

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.
     * Takes the side lengths of a triangle from the user, computes the
     * area and perimeter of the triangle. Then prints it out to 3 decimal 
     * places</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {   
        //The triangle's first side.
        float s1;
        /*The triangle's second side.*/
        float s2;
        /*The triangle's third side.*/
        float s3;
        //perimeter of the triangle
        float perim;
        //area of the triangle
        float area;
        //half of the perimeter of the triangle
        float hPerim;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the three sides of a triangle: ");
        s1 = scan.nextFloat();
        s2 = scan.nextFloat();  
        s3 = scan.nextFloat();
        scan.close();
        perim = s1 + s2 + s3;
        
        hPerim = perim / 2;
        area = (float) Math.sqrt(hPerim * (hPerim - s1) * (hPerim - s2)
                * (hPerim - s3));
        DecimalFormat fmt = new DecimalFormat("0.000");
        System.out.println("perimeter is: " + fmt.format(perim));   
        System.out.println("area is: " + fmt.format(area));   
        
        System.out.println("Question one was called and ran sucessfully.");
    }

};
