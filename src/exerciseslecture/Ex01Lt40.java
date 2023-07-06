/* 
 * Objective: Find all prime numbers inside an given interval.
 * Implemented by Lucas deArruda
 * Created in 24/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flagprime;
        int n1;
        int n2;
        int swap;

        System.out.print("1st number: ");
        n1 = scan.nextInt();

        System.out.print("2nd number: ");
        n2 = scan.nextInt();

        if (n1 > n2) {
            swap = n1;
            n1 = n2;
            n2 = swap;
        }

        System.out.printf("Prime numbers between %d and %d:\n", n1, n2);

        for (int i = n1; i <= n2; i++) {
            if (i <= 1) {
                continue; // Skip numbers below 1.
            }

            flagprime = true;

            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    flagprime = false;
                    break;
                }
            }

            if (flagprime) {
                System.out.printf("%d\n", i);
            }
        }

        scan.close();
    }
}
