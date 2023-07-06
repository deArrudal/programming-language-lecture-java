/* 
 * Objective: Compute theaverage speed.
 * Implemented by Lucas deArruda
 * Created in 20/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int laps;
        double lapdistance;
        double time;
        double speed;

        System.out.print("Number of laps: ");
        laps = scan.nextInt();

        System.out.print("Lap size [m]: ");
        lapdistance = scan.nextDouble();

        System.out.print("Duration [min]: ");
        time = scan.nextDouble();

        time /= 60; // Convert minutes to hours.
        speed = ((laps * lapdistance) / 1000) / time;

        System.out.printf("Average speed: %.2f Km/h", speed);
        scan.close();
    }
}
