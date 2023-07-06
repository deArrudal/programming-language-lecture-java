/* 
 * Objective: Calculate the food duration in days based on a consumption of 50g/day.
 * Implemented by Lucas deArruda
 * Created in 16/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double RATE = 50.0;
        double quantity;
        double days;

        System.out.print("Food quantity [Kg]: ");
        quantity = scan.nextDouble();

        quantity *= 1000; // Convert kilograms to grams.
        days = quantity / RATE;

        System.out.printf("The food will last %.2f days", days);
        
        scan.close();
    }
}