/* 
 * Objective: Compute the series S = 1 + 2 + ... + n using recursion. 
 * Implemented by Lucas deArruda
 * Created in 16/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex04Lt02 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        int sum;

        System.out.print("Number of terms: ");
        n = scan.nextInt();

        sum = f(n);

        System.out.printf("Value: %d", sum);
        
        scan.close();
    }

    static int f(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + f(x - 1);
        }
    }
}
