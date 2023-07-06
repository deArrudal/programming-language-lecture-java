/* 
 * Objective: Compute the month`s sales, total sales and sales by products. 
 * Implemented by Lucas deArruda
 * Created in 17/03/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;
import java.util.Arrays;

public class Ex03Lt08 {
    public static void main(String[] args) {
        int[][] sales = new int[4][3];
        int[] monthly = new int[3];
        int[] weekly = new int[4];
        int total = 0;

        sales = registerSales(sales);

        for (int row = 0; row < sales.length; row++) {// Weekly loop.
            for (int col = 0; col < sales[0].length; col++) { // Monthly loop.
                total += sales[row][col];
                weekly[row] += sales[row][col];
                monthly[col] += sales[row][col];
            }
        }

        System.out.print("Sum [months]: " + Arrays.toString(monthly) +
                "\nSum [weeks]: " + Arrays.toString(weekly) +
                "\nTotal sales: " + total);
    }

    static int[][] registerSales(int[][] array) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array[0].length; i++) {// Monthly loop.
            for (int j = 0; j < array.length; j++) { // Weekly loop.
                System.out.printf("Month: %d    Week: %d\nSales: ",
                        (i + 1), (j + 1));
                array[j][i] = scan.nextInt();
            }
        }
        scan.close();

        return array;
    }
}
