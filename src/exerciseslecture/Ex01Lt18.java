/* 
 * Objective: Compute the maximum difference between two numbers.
 * Implemented by Lucas deArruda
 * Created in 17/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1;
        double x2;
        double difference;

        System.out.print("1st number: ");
        x1 = scan.nextDouble();
        
        System.out.print("2nd number: ");
        x2 = scan.nextDouble();

        difference = x1 - x2;
        if (x2 > x1) {
            difference = x2 - x1;    
        }

        System.out.printf("Difference: %.2f", difference);
        
        scan.close();
    }
}