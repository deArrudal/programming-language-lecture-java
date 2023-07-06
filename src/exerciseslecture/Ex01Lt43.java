/* 
 * Objective: Compute how many years will take to Ana's height surpass Maria's.
 * Implemented by Lucas deArruda
 * Created in 24/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

public class Ex01Lt43 {
    public static void main(String[] args) {
        double anaheight;
        double anagrowth;
        double mariaheight;
        double mariagrowth;
        double years;

        anaheight = 110.00; // [cm]
        anagrowth = 3.00; // [cm/year]

        mariaheight = 150.00; // [cm]
        mariagrowth = 2.00; // [cm/year]

        years = (mariaheight - anaheight) / (anagrowth - mariagrowth);

        System.out.printf("Will take %.2f years.", years);
    }
}
