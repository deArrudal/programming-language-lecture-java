/* 
 * Objective: Compute the terms of a series S = 1/1 + 2/4 + ... + i/i^2.
 * Implemented by Lucas deArruda
 * Created in 24/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

public class Ex01Lt45 {
    public static void main(String[] args) {
        double sum = 1;

        for (int i = 2; i <= 15; i++) {
            sum += (i * 1.0) / (i * i);
        }

        System.out.printf("Value: %.2f", sum);

    }
}
