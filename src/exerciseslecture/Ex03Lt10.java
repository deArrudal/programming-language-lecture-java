/* 
 * Objective: Display the wheat grain chessboard model. 
 * Implemented by Lucas deArruda
 * Created in 17/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Arrays;

public class Ex03Lt10 {
    public static void main(String[] args) {
        double[][] board = new double[8][8];
        double value = 1;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = value;
                value *= 2;
            }
        }

        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
}
