/* 
 * Objective: Display dice`s roll with sum equals 7.
 * Implemented by Lucas deArruda
 * Created in 24/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

public class Ex01Lt41 {
    public static void main(String[] args) {
        System.out.println("Rolls which the sum result is 7:");

        for (int dice1 = 1; dice1 <= 6; dice1++) {
            for (int dice2 = 1; dice2 <= 6; dice2++) {
                if (dice1 + dice2 == 7)
                    System.out.printf("Roll: %d, %d\n", dice1, dice2);
            }
        }
    }
}
