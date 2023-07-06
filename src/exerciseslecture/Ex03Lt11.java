/* 
 * Objective: Fill an matrix following a specific pattern. 
 * Implemented by Lucas deArruda
 * Created in 23/03/2023
 * v1.0
 */

//Package.
package exerciseslecture;

// Libraries.
import java.util.Arrays;

public class Ex03Lt11 {
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        int arraysize = array.length;

        for (int k = 0; k < 4; k++) {
            for (int i = k; i < arraysize - k; i++) {
                for (int j = k; j < arraysize - k; j++) {
                    array[i][j] += 1;
                }
            }
        }

        for (int i = 0; i < arraysize; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
