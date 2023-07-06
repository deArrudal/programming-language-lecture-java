/* 
 * Objective: Sum all odd numbers between a and b.
 * Implemented by Lucas deArruda
 * Created in 23/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt35 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int swap;
        int sum = 0;

        System.out.print("First number:");
        a = scan.nextInt();

        System.out.print("Second number:");
        b = scan.nextInt();

        if (a > b) {
            swap = a;
            a = b;
            b = swap;
        }

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.printf("Sum of odd numbers between %d and %d: %d",
                a, b, sum);

        scan.close();
    }
}
