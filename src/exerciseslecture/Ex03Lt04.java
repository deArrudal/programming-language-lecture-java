/* 
 * Objective: Compute the statistics of a test scores.
 * Implemented by Lucas deArruda
 * Created in 13/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import javax.swing.JOptionPane;

public class Ex03Lt04 {
    public static void main(String[] args) {
        double[] scores = new double[10];
        double average = 0;
        int numbertop = 0; // number of tests above average.
        String position = "";

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Test score: "));

            average += scores[i];
        }

        average /= scores.length;

        for (int j = 0; j < scores.length; j++) {
            if (scores[j] > average) {
                numbertop++;
            } else if (scores[j] < average) {
                position += j + " ";
            }
        }

        JOptionPane.showMessageDialog(null, "Average: " +
                average + "\nNumber of test above average: " + numbertop +
                "\nIndexes with score below average: " + position);
    }
}
