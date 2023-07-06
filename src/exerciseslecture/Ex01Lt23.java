/* 
 * Objective: Insert a number into a sorted sequence.
 * Implemented by Lucas deArruda
 * Created in 02/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        int x;

        System.out.println("Insert a crescent set of numbers");
        
        System.out.print("1st number: ");
        a = scan.nextInt();

        System.out.print("2nd number: ");
        b = scan.nextInt();

        System.out.print("3rd number: ");
        c = scan.nextInt();

        if ((a > b) || (a > c) || (b > c)) {
            System.out.println("Invalid sequence");
            System.exit(0);
        }

        System.out.print("Target number: ");
        x = scan.nextInt();

        if (x <= b) {
            if (x <= a) {
                System.out.printf("Sorted numbers: %d, %d, %d, %d", x, a, b, c);
            } else {
                System.out.printf("Sorted numbers: %d, %d, %d, %d", a, x, b, c);
            }
        } else {
            if (x <= c) {
                System.out.printf("Sorted numbers: %d, %d, %d, %d", a, b, x, c);
            } else {
                System.out.printf("Sorted numbers: %d, %d, %d, %d", a, b, c, x);
            }
        }

        scan.close();
    }
}