/*
 * Objective: Comandos basicos de Java.
 * Implemented by Lucas deArruda
 * Created in 10/05/2023
 * v1.0
 */

// Package.
package genericmodels;

// Libraries
import javax.swing.JOptionPane;
import java.util.Arrays;

class ComandosJava {
    // Procedimento main
    public static void main(String[] args) {
        // Variables.
        boolean flag = true;
        char letter = 'a';
        int x = 5;
        double y = 2.0;
        float z;
        String text = "abc";

        // Arrays.
        int[] array = { 1, 2, 3, 4, 5 }; // Initial values.
        int[] array_empty = new int[5];
        double[][] matrix = { { 1, 1 }, { 2, 2 } };
        double[][] matrix_empty = new double[2][2];

        // Mathematical operators.
        x = x + 0;
        x = x - 0;
        x = x * 1;
        x = x / 1; // Integer division 5/1 = 5
        y = y / 1.0; // Division 2.0 / 1.0 = 2.0
        y = Math.pow(y, 2); // Power function (2.0)^2 = 2.0 * 2.0 = 4.0
        y = Math.sqrt(y); // Square root function sqrt(4.0) = 2.0

        // Logic operators.
        flag = !flag; // Not.
        flag = flag || true; // Or.
        flag = flag && true; // And.
        flag = flag != true; // Not equal.
        flag = flag == true; // Equal.
        flag = x > y; // Greater than.
        flag = x < y; // Lower than.
        flag = x >= x;
        flag = x <= x;

        // Conditional statements.
        if (x > y) {
            // Statement.
        } else if (x == y) {
            // Statement.
        } else {
            // Statement.
        }

        switch (letter) {
            case 'a':
                // Statement.
                break;
            case 'b':
                // Statement.
                break;
            default:
                // Statement.
        }

        // Loops.
        for (int i = 0; i <= 10; i++) {
            // Statement.
        }

        while (flag == false) {
            // Statement.
        }

        do {
            // Statement.
        } while (flag == false);

        // Inputs/Outputs.
        z = Float.parseFloat(JOptionPane.showInputDialog("Value: "));
        // Alternatives: Integer.parseInt() ou Double.parseDouble()

        System.out.print(x + " ");
        System.out.println(y); // Add new line.
        JOptionPane.showMessageDialog(null, z); // Pop-up box.

        // Array length.
        int size = array_empty.length;
        for (int i = 0; i < size; i++) {
            array_empty[i] = 0;
        }

        System.out.println(Arrays.toString(array)); // Print array in a single line.

        // Multidimensional arrays.
        int row = matrix_empty.length; // Rows.
        int col = matrix_empty[0].length; // Columns.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix_empty[i][j] = 0;
            }
        }

        for (int i = 0; i < col; i++) {
            System.out.println(Arrays.toString(matrix_empty[0]));
        }

        // Methods.
        procedure(text);
        matrix_empty = function(matrix);

        // Recursion S = 1 + 2 + 3 + ... + 100.
        x = recursion(100);
        System.out.println(x);

    }

    // Procedure.
    static void procedure(String x) {
        // Declaração de variáveis.
        // Comandos.
        System.out.println(x);
    }

    // Function.
    static double[][] function(double[][] x) {
        // Declaração de variáveis.
        // Comandos.
        return x; // Retorna uma matriz do tipo double.
    }

    // Recursion.
    static int recursion(int n) {
        if (n == 1) { // Condição de parada ou retorno.
            return 1;
        } else { // Chama a própria função.
            // f(x) = x + f(x - 1)
            return n + recursion(n - 1);
        }
    }
}