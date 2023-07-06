/*
 * Objective: Compute the parallelepiped volume.
 * Implemented by Lucas deArruda
 * Created in 10/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length;
        double width;
        double height;
        double volume;

        System.out.print("Lenght [m]: ");
        length = scan.nextDouble();

        System.out.print("Width [m]: ");
        width = scan.nextDouble();
        
        System.out.print("Height [m]: ");
        height = scan.nextDouble();

        volume = length * width * height;

        System.out.printf("Volume [m^3]: %.2f", volume);
        
        scan.close();
    }
}