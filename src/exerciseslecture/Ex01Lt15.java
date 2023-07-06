/* 
 * Objective: Compute the hypotenuse of a right triangle.
 * Implemented by Lucas deArruda
 * Created in 16/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base;
        double height;
        double hypotenuse;

        System.out.print("Base [m]: ");
        base = scan.nextDouble();
        
        System.out.print("Height [m]: ");
        height = scan.nextDouble();

        hypotenuse = Math.sqrt((base * base) + (height * height));

        System.out.printf("Hypotenuse [m]: %.2f", hypotenuse);
        
        scan.close();
    }
}