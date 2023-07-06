/* 
 * Objective: Build an array with diagonal equals index^2. 
 * Implemented by Lucas deArruda
 * Created in 17/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Random;
import java.util.Arrays;

public class Ex03Lt09 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    array[i][j] = (int) Math.pow(array.length, i);

                } else {
                    array[i][j] = random.nextInt(101);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
