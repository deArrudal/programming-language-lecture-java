/* 
 * Objective: Compute the average and sum of odd values between 10 and 200.
 * Implemented by Lucas deArruda
 * Created in 13/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex03Lt01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] x = new int[50];
        int countaverage = 0;
        int sumodd = 0;
        double average = 0;

        for (int i = 0; i < x.length; i++) {
            System.out.printf("Value %d: ", i + 1);
            x[i] = scan.nextInt();

            if ((x[i] >= 10) && (x[i] <= 200)) {
                average += x[i];
                countaverage += 1;
            }

            if ((x[i] % 2) != 0) {
                sumodd += x[i];
            }
        }

        average /= countaverage;

        System.out.printf("Average of values between 10 and 200: %.2f"
                + "\nSum of odd numbers: %d", average, sumodd);

        scan.close();
    }
}