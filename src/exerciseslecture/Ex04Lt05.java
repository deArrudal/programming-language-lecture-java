/* 
 * Objective: Compute the series S = 1! + 2! + ... + n! using recursion.
 * Implemented by Lucas deArruda
 * Created in 23/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex04Lt05 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scan = new Scanner(System.in);
        int n;
        double sum;

        System.out.print("Number of terms: ");
        n = scan.nextInt();

        sum = f(1, 1, n); // f(x, fat(x), n)

        System.out.printf("Value: %.2f", sum);
        
        scan.close();
    }

    static int f(int x, int factorial, int n) {
        if (x == n) {
            return factorial;
        } else {
            return factorial + f(x + 1, factorial * (x + 1), n);
        }
    }
}