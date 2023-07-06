/* 
 * Objective: Compute the n terms of the series S = 1 + 1/2 + 1/3 + ...
 * Implemented by Lucas deArruda
 * Created in 23/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt33 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        double sum = 1;

        System.out.print("Number of terms: ");
        n = scan.nextInt();

        for (int i = 2; i <= n; i++) {
            sum += (1.0 / i);
        }

        System.out.printf("Value: %.2f", sum);
        
        scan.close();
    }
}
