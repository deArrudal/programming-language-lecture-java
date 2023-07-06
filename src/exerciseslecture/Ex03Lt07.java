/* 
 * Objective: Find the index of an entry using binary search. 
 * Implemented by Lucas deArruda
 * Created in 16/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ex03Lt07 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        int value;
        int index;

        array = buildArray(array);
        System.out.println("Sorted:" + Arrays.toString(array));

        System.out.print("Target value: ");
        value = scan.nextInt();

        index = searchValue(array, array.length, value);
        if (index == -1) { // Not found.
            System.out.println("Target value not found.");
        } else { // Found.
            System.out.printf("Index: %d", index);
        }

        scan.close();
    }

    static int searchValue(int[] array, int arraysize, int target) {
        // Given a target value, perform a binary search in the array.
        int low = 0;
        int high = arraysize - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (array[mid] < target) {
                low = mid + 1;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1; // Return not found.
    }

    static int[] buildArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        array = sortArray(array, array.length);

        return array;
    }

    static int[] sortArray(int[] array, int arraysize) {
        int swap;
        boolean flagswap;

        do {
            flagswap = false;

            for (int i = 1; i <= (arraysize - 1); i++) {
                if (array[i - 1] > array[i]) {
                    swap = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = swap;

                    flagswap = true;
                }
            }

            arraysize--;

        } while (flagswap != false);

        return array;
    }
}
