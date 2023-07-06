/* 
 * Objective: Check if a number is divisible by 2 and 3.
 * Implemented by Lucas deArruda
 * Created in 17/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;

        System.out.print("Insert number: ");
        x = scan.nextInt();

        if ((x % 2 == 0) && (x % 3 == 0)) {
            System.out.printf("%d is divisible by 2 and 3", x);
        } else {
            System.out.printf("%d isn't divisible by 2 and 3", x);
        }

        scan.close();
    }
}