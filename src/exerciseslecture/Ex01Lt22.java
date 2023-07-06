/* 
 * Objective: Sort two numbers in crescent order.
 * Implemented by Lucas deArruda
 * Created in 17/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;

        System.out.print("1st number: ");
        a = scan.nextInt();
        
        System.out.print("2nd number: ");
        b = scan.nextInt();

        if (a == b) {
            System.out.println("Invalid numbers");
        } else if (a > b) {
            System.out.printf("Sorted numbers: %d, %d", b, a);
        } else {
            System.out.printf("Sorted numbers: %d, %d", a, b);
        }

        scan.close();
    }
}