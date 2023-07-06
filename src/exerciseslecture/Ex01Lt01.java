/*
 * Objective: Compute the area of a square.
 * Implemented by Lucas deArruda
 * Created in 09/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double side;
        double area;

        System.out.print("Side [m]: ");
        side = scan.nextDouble();

        area = side * side;

        System.out.printf("Area [m^2]: %.2f", area);
        
        scan.close();
    }
}