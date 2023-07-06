/* 
 * Objective: Compute the value of all the pieces in a chessboard. 
 * Implemented by Lucas deArruda
 * Created in 23/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Random;
import java.util.Arrays;

public class Ex03Lt12 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        int[] countpieces = new int[7];
        String[] pieces = { "Pawn", "Tower", "Bishop", "Knight", "Queen", "King", "Empty" };

        board = fillBoard(board);
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                countpieces[board[i][j]]++;
            }
        }

        for (int i = 0; i < countpieces.length; i++) {
            System.out.println(pieces[i] + ": " + countpieces[i]);
        }

    }

    static int[][] fillBoard(int[][] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(7);
            }
        }
        return array;
    }
}
