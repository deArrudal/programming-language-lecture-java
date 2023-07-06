/*
 * Objective: Quick sort routine for data_object.
 * Implemented by Lucas deArruda
 * Created in 30/04/2023
 * v1.1
 */

// Package.
package electoralsystem;

public class QuickSort {
    public static void method(DataObject[] array, int low, int high) {
        // Call recursively the quick sort method to both sides.
        if (low < high) {
            int index = partition(array, low, high);

            method(array, low, (index - 1));
            method(array, (index + 1), high);
        }
    }

    public static int partition(DataObject[] array, int low, int high) {
        // Slipt array into two partitions.
        int pivot = array[high].id; // Choose the last element as the pivot.
        int i = low - 1; // Temporary pivot index.

        DataObject swap;

        for (int j = low; j <= (high - 1); j++) {
            if (array[j].id <= pivot) {
                i++; // Move pivot.

                // Swap elements.
                swap = array[j];
                array[j] = array[i];
                array[i] = swap;
            }
        }

        // Move the pivot element to the correct pivot position.
        i++;
        swap = array[high];
        array[high] = array[i];
        array[i] = swap;

        return i;
    }
}
