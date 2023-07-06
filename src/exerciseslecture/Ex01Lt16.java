/*
 * Objective: Compute an employee's salary.
 * Implemented by Lucas deArruda
 * Created in 16/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt16 {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                final double DEPENDENTRATE = 100.0;
                final double DISCOUNT = 5.0;
                int dependents;
                double hours;
                double hourlyrate;
                double salary;

                System.out.print("Worked hours: ");
                hours = scan.nextDouble();

                System.out.print("Hourly rate [$]: ");
                hourlyrate = scan.nextDouble();
                
                System.out.print("Number of dependents: ");
                dependents = scan.nextInt();

                salary = hourlyrate * hours;
                salary *= (1 - DISCOUNT / 100);
                salary += (DEPENDENTRATE * dependents);

                System.out.printf("Salary due: $%.2f", salary);
                
                scan.close();
        }
}
