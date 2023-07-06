/*
 * Objective: Compute an employee's new salary.
 * Implemented by Lucas deArruda
 * Created in 09/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary;
        double raise;
        double newsalary;

        System.out.print("Base salary [$]: ");
        salary = scan.nextDouble();
        
        System.out.print("Raise [%]: ");
        raise = scan.nextDouble();

        newsalary = salary * (1 + raise / 100);

        System.out.printf("New Salary [$]: %.2f", newsalary);
        
        scan.close();
    }
}