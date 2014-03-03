package q2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p>This program takes the height and radius of a cylinder from the user
 * and outputs the surface area and volume of the cylinder, formatted to 
 * four decimal places. It demonstrates the use of the math class and
 * decimal format.</p>
 *
 * @author Denis Turitsa, set C
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>This is the main method. 
     * takes the height and radius of a cylinder from the user
     * and outputs the surface area and volume of the cylinder, formatted to 
     * four decimal places.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        //height of the cylinder, input by the user
        double height;
        //radius of the cylinder, input by the user
        double radius;
        //Computed volume of the cylinder
        double volume;
        //Computed Surface area of the cylinder
        double sArea;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the height of a cylinder: ");
        height = scan.nextFloat();
        System.out.println("Please enter the radius of a cylinder: ");
        radius = scan.nextFloat();
        scan.close();
        
        volume = Math.PI * Math.pow(radius, 2) * height;
        sArea = 2 * Math.PI * radius * (radius + height);
        
        DecimalFormat fmt = new DecimalFormat("0.0000");
        System.out.println("Cylinder volume: " + fmt.format(volume));
        System.out.println("Cylinder surface area: " + fmt.format(sArea));
        System.out.println("Question two was called and ran sucessfully.");
    }

};
