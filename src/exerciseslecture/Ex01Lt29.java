/* 
 * Objective: Calculate the return of a invesment.
 * Implemented by Lucas deArruda
 * Created in 20/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int investimenttype;
        double inputvalue;
        double outputvalue;

        System.out.print("Type of investiment [1-savings, 2-fixed rate]: ");
        investimenttype = scan.nextInt();

        if ((investimenttype != 1) || (investimenttype != 2)) {
            System.out.print("Invalid code");
            System.exit(0);
        }

        System.out.print("Initial value [$]: ");
        inputvalue = scan.nextDouble();

        outputvalue = inputvalue;

        if (investimenttype == 1) {
            outputvalue = inputvalue * 1.03;
        } else if (investimenttype == 2) {
            outputvalue = inputvalue * 1.05;
        }

        System.out.printf("Return value after 30 days: $%.2f", outputvalue);

        scan.close();
    }
}