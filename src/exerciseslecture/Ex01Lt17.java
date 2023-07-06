/* 
 * Objective: Compute the fuel necessary for a trip.
 * Implemented by Lucas deArruda
 * Created in 16/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double FUELRATE = 12.00;
        double velocity;
        double time;
        double distance;
        double fuel;

        System.out.print("Average speed [km/h]: ");
        velocity = scan.nextDouble();
        
        System.out.print("Trip duration [h]: ");
        time = scan.nextDouble();

        distance = velocity * time;
        fuel = distance / FUELRATE;

        System.out.printf("Necessary fuel [l]: %.2f", fuel);
        
        scan.close();
    }
}