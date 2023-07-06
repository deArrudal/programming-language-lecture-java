/*
 * Objective: Sorting methods.
 * Implemented by Lucas deArruda
 * Created in 02/05/2023
 * v1.1
 */
// Package.
package votingmodel;

public class DataSort {
    public static void sortCandidate(DataVoter[] array, int low, int high) {
        // Call recursively the quick sort method to both sides.
        if (low < high) {
            int index = partCandidate(array, low, high);

            sortCandidate(array, low, (index - 1));
            sortCandidate(array, (index + 1), high);
        }
    }

    public static int partCandidate(DataVoter[] array, int low, int high) {
        // Slipt array into two partitions.
        int pivot = array[high].section; // Choose the last element as the pivot.
        int i = low - 1; // Temporary pivot index.

        DataVoter swap;

        for (int j = low; j <= (high - 1); j++) {
            if (array[j].section <= pivot) {
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
