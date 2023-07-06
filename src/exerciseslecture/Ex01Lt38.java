/* 
 * Objective: From a set of 10 numbers, find the smallest and largest ones.
 * Implemented by Lucas deArruda
 * Created in 24/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int max;
        int min;

        System.out.print("Number: ");
        n = scan.nextInt();

        max = n;
        min = n;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Number: ");
            n = scan.nextInt();

            if (n > max) {
                max = n;
            } else if (n < min) {
                min = n;
            }
        }

        System.out.printf("Maximum value: %d\nMinimum value: %d", max, min);
        
        scan.close();
    }
}
