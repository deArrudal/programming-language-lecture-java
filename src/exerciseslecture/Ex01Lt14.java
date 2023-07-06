/*
 * Objective: Given two angles of a triangle, compute the third one.
 * Implemented by Lucas deArruda
 * Created in 16/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double angle1;
        double angle2;
        double angle3;

        System.out.print("First angle [deg]: ");
        angle1 = scan.nextDouble();
        
        System.out.print("Second angle [deg]: ");
        angle2 = scan.nextDouble();

        angle3 = 180 - (angle1 + angle2);

        System.out.printf("Third angle [deg]: %.2f", angle3);
        
        scan.close();
    }
}