/*
 * Objective: Compute the area of triangle.
 * Implemented by Lucas deArruda
 * Created in 09/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base;
        double height;
        double area;

        System.out.print("Base [m]: ");
        base = scan.nextDouble();
        
        System.out.print("Height [m]: ");
        height = scan.nextDouble();

        area = (base * height) / 2;

        System.out.printf("Area [m^2]: %.2f", area);
        
        scan.close();
    }
}