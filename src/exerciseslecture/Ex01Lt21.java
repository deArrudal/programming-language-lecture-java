/* 
 * Objective: Compute the average score.
 * Implemented by Lucas deArruda
 * Created in 17/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double n4;
        double average;

        System.out.print("1st score: ");
        n1 = scan.nextDouble();

        System.out.print("2nd score: ");
        n2 = scan.nextDouble();

        System.out.print("3rd score: ");
        n3 = scan.nextDouble();

        System.out.print("4th score: ");
        n4 = scan.nextDouble();

        average = (n1 + n2 + n3 + n4) / 4;

        if (average >= 6.0) {
            System.out.printf("Score: %.2f\nSituation: Approved", average);
        } else if (average >= 3.0) {
            System.out.printf("Score: %.2f\nSituation: Exam", average);
        } else {
            System.out.printf("Score: %.2f\nSituation: Failed", average);
        }

        scan.close();
    }
}