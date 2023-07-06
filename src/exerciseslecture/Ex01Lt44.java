/* 
 * Objective: Compute the power of a number.
 * Implemented by Lucas deArruda
 * Created in 24/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int exponent;
        double base;
        double result = 1;

        System.out.print("Base number: ");
        base = scan.nextDouble();
        System.out.print("Exponent number: ");
        exponent = scan.nextInt();

        if (exponent < 0) {
            exponent *= -1;
            base = (1 / base);
        }

        for (int i = exponent; i > 0; i--) {
            result *= base;
        }

        System.out.printf("(%.2f)^%d = %.3f", base, exponent, result);
        
        scan.close();
    }
}
