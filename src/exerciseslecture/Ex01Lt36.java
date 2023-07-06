/* 
 * Objective: Compute the n terms of the series S = 1/1! + 1/2! + ...
 * Implemented by Lucas deArruda
 * Created in 23/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

class Ex01Lt36 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        int factorial = 1;
        double sum = 1;

        System.out.print("Number of terms: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += (1.0 / factorial);
        }

        System.out.printf("Value: %.2f", sum);

        scan.close();
    }
}
