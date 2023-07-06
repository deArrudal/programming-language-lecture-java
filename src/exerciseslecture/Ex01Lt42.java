/* 
 * Objective: Compute the terms of a series S = 1/1 + 2/3 + ... + i/(2*i - 1).
 * Implemented by Lucas deArruda
 * Created in 24/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 1;

        for (int i = 2; i <= 50; i++) {
            sum += i / (2.0 * i - 1.0);
        }

        System.out.printf("Value: %.2f", sum);
        
        scan.close();
    }
}
