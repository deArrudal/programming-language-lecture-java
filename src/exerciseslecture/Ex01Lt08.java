/*
 * Objective: Determine the investiment return after a month.
 * Implemented by Lucas deArruda
 * Created in 10/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base;
        double percentage;
        double total;

        System.out.print("Invested value [$]: ");
        base = scan.nextDouble();
        
        System.out.print("Percentage [%]: ");
        percentage = scan.nextDouble();

        total = base * (1 + percentage / 100);

        System.out.printf("Investiment return [$]: %.2f", total);
        
        scan.close();
    }
}