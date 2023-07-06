/* 
 * Objective: Sort and random array in ascending order. 
 * Implemented by Lucas deArruda
 * Created in 16/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Arrays;
import java.util.Random;

public class Ex03Lt06 {
    public static void main(String args[]) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        System.out.println("Unsorted: " + Arrays.toString(array));

        array = sortArray(array);

        System.out.println("Sorted: " + Arrays.toString(array));
    }

    static int[] sortArray(int[] array) {
        int arraysize = array.length;
        int swap;
        boolean flagswap;

        do {
            flagswap = false;

            for (int i = 1; i <= (arraysize - 1); i++) {
                if (array[i - 1] > array[i]) {
                    // Swap values.
                    swap = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = swap;

                    flagswap = true;
                }
            }

            arraysize--; // Reduce scope by 1.

        } while (flagswap != false);

        return array;
    }
}
