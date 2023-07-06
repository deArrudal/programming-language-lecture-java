
/* 
 * Objective: Compute the series S = (a[end] - a[0]) + (a[end-1] - a[1]) + ... 
 * Implemented by Lucas deArruda
 * Created in 13/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex03Lt05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        int sumarray = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Value: ");
            array[i] = scan.nextInt();
        }

        for (int j = 0; j < array.length / 2; j++) {
            sumarray += array[j] - array[(array.length - 1) - j];
        }

        System.out.printf("Sum = %d", sumarray);
        scan.close();
    }
}
