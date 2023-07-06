/*
 * Objective: CRUD methods.
 * Implemented by Lucas deArruda
 * Created in 30/04/2023
 * v1.0
 */

// Package.
package electoralsystem;

// Libraries.
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class DataMethods {
    public static DataObject[] createData(int[] properties, DataObject[] votes) {
        // Read vote information.
        Random random = new Random(); // Create a random generator.
        int section;
        int vote;

        for (int i = 0; i < votes.length; i++) {
            // Generate a random section.
            section = random.nextInt(properties[0]);

            // Generate a random vote.
            vote = random.nextInt(properties[1]);

            votes[i] = new DataObject(section, vote);
        }

        System.out.println("\tData generated");

        return votes;
    }

    public static DataObject[] sortData(DataObject[] votes) {
        // Sort votes by section.
        QuickSort.method(votes, 0, (votes.length - 1));

        System.out.println("\tData sorted");

        return votes;
    }

    public static void saveData(int[] properties, DataObject[] votes, String filename) {
        // Store data in ".txt" file.
        File file = new File(filename);

        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print("PROPERTIES\n");
            printWriter.printf("%1$10s\t%2$10s\n", "sections", "votes");
            printWriter.printf("%1$10d\t%2$10d\n", properties[0], properties[1]);

            printWriter.print("VOTES\n");
            printWriter.printf("%1$10s\t%2$10s\n", "section", "vote");
            for (int i = 0; i < votes.length; i++) {
                printWriter.printf("%1$10d\t%2$10d\n",
                        votes[i].id, votes[i].value);
            }

            printWriter.close();

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println("\tData Saved");
    }

    public static void menuStatistics(int[] properties, DataObject[] votes) {
        // Display voting statistics.
        int option;
        String prompt;

        prompt = "\tMenu"
                + "\n\t1.Votes per section"
                + "\n\t2.Votes per candidates"
                + "\n\t3.Sections with higher and lower number of voters"
                + "\n\t4.List of most voted candidates"
                + "\n\t9.Return"
                + "\n\tEnter the desired option: ";

        do {
            System.out.print(prompt);
            option = DataMain.scan.nextInt();
            DataMain.scan.nextLine(); // Clear scanner.

            switch (option) {
                case 1:
                    System.out.println("\t\t1.Votes per section");
                    displayBySection(properties, votes);
                    break;
                case 2:
                    System.out.println("\t\t2.Votes per candidates");
                    displayByCandidate(properties, votes);
                    break;
                case 3:
                    System.out.println(
                            "\t\t3.Sections with higher and lower number of voters");
                    displayByMaxMin(properties, votes);
                    break;
                case 4:
                    System.out.println("\t\t4.List of most voted candidates");
                    displayByTop(properties, votes);
                    break;
                case 9:
                    System.out.println("\t\t9.Return");
                    break;
                default:
                    System.out.println("\t\tInvalid option");
            }

        } while (option != 9);
    }

    public static void displayBySection(int[] properties, DataObject[] votes) {
        // Display votes by section.
        int[] sections = new int[properties[0]];

        for (int i = 0; i < votes.length; i++) {
            sections[votes[i].id] += 1;
        }

        for (int j = 0; j < properties[0]; j++) {
            System.out.printf("\t\tSection %d: %d\n", j, sections[j]);
        }
    }

    public static void displayByCandidate(int[] properties, DataObject[] votes) {
        // Display votes by candidates.
        int[] candidates = new int[properties[1]];

        for (int i = 0; i < votes.length; i++) {
            candidates[votes[i].value] += 1;
        }

        for (int j = 0; j < properties[1]; j++) {
            System.out.printf("\t\tCandidate %d: %d\n", j, candidates[j]);
        }
    }

    public static void displayByMaxMin(int[] properties, DataObject[] votes) {
        // Display sections with most and least votes.
        int[] sections = new int[properties[0]];

        for (int i = 0; i < votes.length; i++) {
            sections[votes[i].id] += 1;
        }

        DataObject max = new DataObject(0, sections[0]);
        DataObject min = new DataObject(0, sections[0]);

        for (int j = 1; j < properties[0]; j++) {
            if (sections[j] > max.value) {
                max.id = j;
                max.value = sections[j];
            } else if (sections[j] < min.value) {
                min.id = j;
                min.value = sections[j];
            }
        }

        System.out.printf("\t\tMaximum: Section %d, %d\n\t\tMinimum: Section %d, %d\n",
                max.id, max.value, min.id, min.value);
    }

    public static void displayByTop(int[] properties, DataObject[] votes) {
        // Display the list of candidates with most votes.
        DataObject[] candidates = new DataObject[properties[1]]; // Reuse object.

        // Store votes in "Data_object.id" and candidate id in "Data_object.value".
        for (int i = 0; i < properties[1]; i++) {
            candidates[i] = new DataObject(0, i);
        }

        for (int j = 0; j < votes.length; j++) {
            candidates[votes[j].value].id += 1;
        }

        QuickSort.method(candidates, 0, (properties[1] - 1));

        int display_size = 10; // Top ten candidates.
        if (properties[1] < display_size) {
            display_size = properties[1] / 2;
        }

        for (int k = (properties[1] - 1); k > ((properties[1] - 1) - display_size); k--) {
            System.out.printf("\t\tCandidate %d, %d\n",
                    candidates[k].value, candidates[k].id);
        }
    }
}
