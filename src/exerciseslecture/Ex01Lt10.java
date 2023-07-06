/*
 * Objective: Return the difference of two numbers.
 * Implemented by Lucas deArruda
 * Created in 10/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        double b;
        double diff;

        System.out.print("Enter 1st value: ");
        a = scan.nextDouble();
        
        System.out.print("Enter 2nd value: ");
        b = scan.nextDouble();

        diff = a - b;

        System.out.printf("The difference is: %.2f", diff);
        
        scan.close();
    }
}