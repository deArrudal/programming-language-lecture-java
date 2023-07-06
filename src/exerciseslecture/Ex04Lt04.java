/* 
 * Objective: Compute the series S = n/1 + (n-1)/2 + ... + 1/n using recursion. 
 * Implemented by Lucas deArruda
 * Created in 17/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex04Lt04 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        double sum;

        System.out.print("Number of terms: ");
        n = scan.nextInt();

        sum = f(n, 1);

        System.out.printf("Value: %.2f", sum);
        
        scan.close();
    }

    static double f(int x, int i) {
        if (x == 1) {
            return 1.0 / i;
        } else {
            return ((x*1.0) / i) + f(x - 1, i + 1);
        }
    }
}
