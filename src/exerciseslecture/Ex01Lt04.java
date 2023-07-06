/*
 * Objective: Covert Celsius to Fahrenheit.
 * Implemented by Lucas deArruda
 * Created in 09/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.print("Celsius [ºC]: ");
        celsius = scan.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("Fahrenheit [ºF]: %.2f", fahrenheit);
        
        scan.close();
    }
}