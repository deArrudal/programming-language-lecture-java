/* 
 * Objective: Compute the real roots of a quadratic equation.
 * Implemented by Lucas deArruda
 * Created in 17/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt20 {
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
        if (delta >= 0) {
            delta = Math.sqrt(delta);
            x1 = (-b + delta) / (2 * a);
            x2 = (-b - delta) / (2 * a);
            
            System.out.printf("Real roots\nx1: %.2f\nx2: %.2f", x1, x2);
        } else {
            System.out.println("No real roots");
        }

        scan.close();
    }
}