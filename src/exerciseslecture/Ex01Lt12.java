/* 
 * Objective: Compute current age and future age.
 * Implemented by Lucas deArruda
 * Created in 16/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year0;
        int year1;
        int age;

        System.out.print("Birth year: ");
        year0 = scan.nextInt();
        
        System.out.print("Current year: ");
        year1 = scan.nextInt();

        age = year1 - year0;

        System.out.printf("Age: %d\nAge in 17 years: %d", age, (age + 17));
        
        scan.close();
    }
}