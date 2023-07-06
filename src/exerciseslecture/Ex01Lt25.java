/* 
 * Objective: Compute the duration of a game.
 * Implemented by Lucas deArruda
 * Created in 17/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        String tmp;
        int time0;
        int time1;
        int hour;
        int minute;

        System.out.print("Initial time [hh:mm]: ");
        input = scan.nextLine();
        tmp = input.substring(0, 2);
        time0 = Integer.parseInt(tmp) * 60; // Convert hours to minutes.
        tmp = input.substring(3, 5);
        time0 += Integer.parseInt(tmp); // Add minutes.

        System.out.print("Final time [hh:mm]: ");
        input = scan.nextLine();
        tmp = input.substring(0, 2);
        time1 = Integer.parseInt(tmp) * 60; // Convert hours to minutes.
        tmp = input.substring(3, 5);
        time1 += Integer.parseInt(tmp); // Add minutes.

        if (time1 < time0) {
            time1 += 1440; // Add one day in minutes.
        }

        // Check if the game has more than 24 hours.
        if ((time1 - time0 > 1440) || (time1 == time0)) {
            System.out.println("Invalid duration");
        } else {
            minute = (time1 - time0) % 60;
            hour = (time1 - time0) / 60;

            System.out.printf("Duration: %d hours, %d minutes",
                    hour, minute);
        }

        scan.close();
    }
}