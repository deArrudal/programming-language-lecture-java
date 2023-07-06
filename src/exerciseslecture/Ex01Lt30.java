/* 
 * Objective: Compute the User's age.
 * Implemented by Lucas deArruda
 * Created in 24/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year0;
        int month0;
        int day0;
        int year1;
        int month1;
        int day1;
        int diffyear;
        int diffmonth;
        int diffday;

        System.out.print("Birth day: ");
        day0 = scan.nextInt();

        System.out.print("Birth month: ");
        month0 = scan.nextInt();

        System.out.print("Birth year: ");
        year0 = scan.nextInt();

        System.out.print("Current day: ");
        day1 = scan.nextInt();

        System.out.print("Current month: ");
        month1 = scan.nextInt();

        System.out.print("Current year: ");
        year1 = scan.nextInt();

        if (day0 > day1) {
            // Borrows days from previous month.
            month1 -= 1;
            if (month1 < 8) {
                // Check if the month is February.
                if (month1 == 2) {
                    // Check if year is a Leap year.
                    if (((month1 % 4 == 0) && (month1 % 100 != 0)) || (month1 % 400 == 0)) {
                        day1 += 29;
                    } else {
                        day1 += 28;
                    }
                } else if ((month1 == 0) || (month1 % 2 != 0)) {
                    day1 += 31;
                } else {
                    day1 += 30;
                }
            } else if (month1 % 2 == 0) {
                day1 += 31;
            } else {
                day1 += 30;
            }
        }

        if (month0 > month1) {
            year1 -= 1; // Borrows months from previous year.
            month1 += 12;
        }

        diffday = day1 - day0;
        diffmonth = month1 - month0;
        diffyear = year1 - year0;

        System.out.printf("Age: %d years, %d months, %d days",
                diffyear, diffmonth, diffday);

        scan.close();
    }
}
