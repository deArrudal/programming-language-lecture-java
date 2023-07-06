/* 
 * Objective: Check if the biggest number is divisible by the smaller one.
 * Implemented by Lucas deArruda
 * Created in 20/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1;
        int x2;
        int swap;

        System.out.print("1st number: ");
        x1 = scan.nextInt();
        
        System.out.print("2nd number: ");
        x2 = scan.nextInt();

        if (x1 >= x2) {
            swap = x1;
            x1 = x2;
            x2 = swap;
        }

        if (x2 % x1 == 0) {
            System.out.printf("%d is multiple of %d", x2, x1);
        } else {
            System.out.printf("%d isn't multiple of %d", x2, x1);
        }

        scan.close();
    }
}