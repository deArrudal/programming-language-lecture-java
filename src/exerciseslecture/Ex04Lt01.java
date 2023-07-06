/* 
 * Objective: Compute the series S = 1 + 2 + ... + 100 using recursion. 
 * Implemented by Lucas deArruda
 * Created in 16/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

public class Ex04Lt01 {
    public static void main(String args[]) {
        int sum;

        sum = f(100);

        System.out.printf("Value: %d", sum);
    }

    static int f(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + f(x - 1);
        }
    }
}
