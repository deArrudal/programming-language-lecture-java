/*
 * Objective: Compute the roots of a second order equation.
 * Implemented by Lucas deArruda
 * Created in 09/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        double delta;
        double x1;
        double x2;

        System.out.print("Enter x^2 term: ");
        a = scan.nextInt();

        System.out.print("Enter x^1 term: ");
        b = scan.nextInt();

        System.out.print("Enter x^0 term: ");
        c = scan.nextInt();

        delta = b * b - (4 * a * c);
        delta = Math.sqrt(delta);
        
        if (delta >= 0) {
            x1 = (-b + delta) / (2 * a);
            x2 = (-b - delta) / (2 * a);
            
            System.out.printf("x1: %.2f\n", x1);
            System.out.printf("x2: %.2f", x2);
        } else {
            System.out.printf("No real roots");     
        }

        scan.close();
    }
}