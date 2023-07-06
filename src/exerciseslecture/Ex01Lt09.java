/*
 * Objective: Return the square of a number.
 * Implemented by Lucas deArruda
 * Created in 10/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base;
        double square;

        System.out.print("Base: ");
        base = scan.nextDouble();
        
        square = Math.pow(base, 2);

        System.out.printf("(%.2f)^2 = %.2f", base, square);
        
        scan.close();
    }
}