/*
 * Objective: Receive two variables and swap them, printing the output.
 * Implemented by Lucas deArruda
 * Created in 10/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int swap;

        System.out.print("Enter 1st value: ");
        a = scan.nextInt();

        System.out.print("Enter 2nd value: ");
        b = scan.nextInt();
        
        System.out.printf("Before: a: %d, b: %d\n", a, b);

        swap = b;
        b = a;
        a = swap;

        System.out.printf("After: a: %d, b: %d", a, b);
        
        scan.close();
    }
}