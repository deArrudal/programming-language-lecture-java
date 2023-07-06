/* 
 * Objective: Determine the biggest of two numbers.
 * Implemented by Lucas deArruda
 * Created in 17/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1;
        double x2;
        double max;

        System.out.print("1st number: ");
        x1 = scan.nextDouble();

        System.out.print("2nd number: ");
        x2 = scan.nextDouble();

        max = x1;
        if (x2 > x1) {
            max = x2;
        }

        System.out.printf("Biggest number: %.2f", max);

        scan.close();
    }
}