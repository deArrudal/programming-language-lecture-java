/* 
 * Objective: Based on the radius, compute the perimeter of a circle.
 * Implemented by Lucas deArruda
 * Created in 16/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.1416; // Constant
        double radius;
        double perimeter;

        System.out.print("Radius [m]: ");
        radius = scan.nextDouble();

        perimeter = 2 * PI * radius;

        System.out.printf("Perimeter [m]: %.2f", perimeter);
        
        scan.close();
    }
}