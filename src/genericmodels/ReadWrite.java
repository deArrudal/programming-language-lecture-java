/*
 * Objective: Write formatted data into a text file, the read from it.
 * Implemented by Lucas deArruda
 * Created in 10/05/2023
 * v1.0
 */

// Package.
package genericmodels;

// Libraries.
import java.io.*;
import java.util.*;

public class ReadWrite {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] data = new int[25][2];

        for (int i = 0; i < data.length; i++) {
            data[i][0] = random.nextInt(11);
            data[i][1] = random.nextInt(101);
        }

        writeData(data);
        data = readData();

    }

    public static void writeData(int[][] data) {
        // Save data in a "Output.txt" file, located in the User's Download folder.
        String filename = System.getProperty("user.home") + "/Downloads/Output.txt";
        File file = new File(filename);

        try {
            if (file.exists()) {
                file.delete();
            }

            file.createNewFile();

            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < data.length; i++) {
                printWriter.printf("%d\t%2$4d\n", data[i][0], data[i][1]);
            }

            printWriter.close();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static int[][] readData() {
        String filename = System.getProperty("user.home") + "/Downloads/Output.txt";
        File file = new File(filename);

        ArrayList<String> ids = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] splitline = line.split("\\t");
                ids.add(splitline[0].trim());
                values.add(splitline[1].trim());
            }

            scan.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        int[][] data = new int[ids.size()][2];

        for (int i = 0; i < data.length; i++) {
            data[i][0] = Integer.parseInt(ids.get(i));
            data[i][1] = Integer.parseInt(values.get(i));
        }

        return data;
    }
}
