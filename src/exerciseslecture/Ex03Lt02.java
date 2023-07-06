/* 
 * Objective: Compute the maximum, minimum and average values of an array.
 * Implemented by Lucas deArruda
 * Created in 13/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex03Lt02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] x = new int[100];
        int max;
        int min;
        double average;

        System.out.printf("Value %d: ", 1);
        x[0] = scan.nextInt();
        max = x[0];
        min = x[0];
        average = x[0];

        for (int i = 1; i < x.length; i++) {
            System.out.printf("Value %d: ", i + 1);
            x[i] = scan.nextInt();

            if (x[i] > max) {
                max = x[i];
            } else if (x[i] < min) {
                min = x[i];
            }

            average += x[i];
        }

        average /= x.length;

        System.out.printf("Maximum: %d\nMinimum: %d\nAverage: %.2f",
                max, min, average);

        scan.close();
    }
}
