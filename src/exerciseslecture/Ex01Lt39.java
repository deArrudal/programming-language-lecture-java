/* 
 * Objective: Compute how many grains of wheat would be on the chessboard.
 * Implemented by Lucas deArruda
 * Created in 24/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

public class Ex01Lt39 {
    public static void main(String[] args) {
        int square;
        double grains = 0;

        for (square = 1; square <= 64; square++) {
            grains += Math.pow(2, square - 1);
        }

        System.out.printf("Quantity of grains: %.0f", grains);
    }
}
