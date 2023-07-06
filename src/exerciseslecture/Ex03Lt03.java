/* 
 * Objective: Concatenate two int arrays.
 * Implemented by Lucas deArruda
 * Created in 13/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;
import java.util.Arrays;

public class Ex03Lt03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n1 = new int[3];
        int[] n2 = new int[3];
        int[] n3 = new int[(n1.length + n2.length)];
        int size = n1.length;

        for (int i = 0; i < (2 * size); i++) {
            if (i < size) {
                System.out.print("Enter 1st array value: ");
                n1[i] = scan.nextInt();

                n3[i] = n1[i];
            } else {
                System.out.print("Enter 2nd array value: ");

                n2[i - size] = scan.nextInt();
                n3[i] = n2[i - size];
            }
        }
        System.out.printf("Array 1: %s\nArray 2: %s\nArray 3: %s",
                Arrays.toString(n1), Arrays.toString(n2), Arrays.toString(n3));
                
        scan.close();
    }
}
