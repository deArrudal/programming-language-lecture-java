/* 
 * Objective: Compute the factorial of a number.
 * Implemented by Lucas deArruda
 * Created in 23/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt32 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x;
        int factorial = 1;

        System.out.print("Number: ");
        x = scan.nextInt();

        for (int i = x; i > 1; i--) {
            factorial *= i;
        }

        System.out.printf("Factorial of %d: %d", x, factorial);
        
        scan.close();
    }
}
