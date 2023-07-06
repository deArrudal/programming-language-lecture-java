/* 
 * Objective: Print the first ten multiples of a number.
 * Implemented by Lucas deArruda
 * Created in 23/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt34 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Number: ");
        n = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, i * n);
        }

        scan.close();
    }
}
