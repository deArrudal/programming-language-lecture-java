/* 
 * Objective: Compute the n terms of the Fibonacci sequence.
 * Implemented by Lucas deArruda
 * Created in 23/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt37 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        int fib0;
        int fib1;
        int fib2;

        System.out.print("Number of terms: ");
        n = scan.nextInt();

        fib0 = 0;
        System.out.printf("f(0) = %d\n", fib0);

        if (n != 0) {
            fib1 = 1;
            System.out.printf("f(1) = %d\n", fib1);

            if (n > 1) {
                for (int i = 2; i <= n; i++) {
                    fib2 = fib0 + fib1;

                    System.out.printf("f(%d) = %d\n", i, fib2);

                    fib0 = fib1;
                    fib1 = fib2;
                }
            }
        }

        scan.close();
    }
}
