/*
 * Objective: Entry point and principal menu.
 * Implemented by Lucas deArruda
 * Created in 30/04/2023
 * v1.1
 */

// Package.
package electoralsystem;

// Libraries.
import java.util.Scanner;

public class DataMain {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Election 2021");
        int option;
        String prompt;
        int[] properties = { 5, 10 }; // Number of section and candidates.
        DataObject[] votes = new DataObject[200]; // NUmber of votes.
        String filename = System.getProperty("user.home") + "/Downloads/Output.txt";

        prompt = "Menu"
                + "\n1.Insert data"
                + "\n2.Sort by section"
                + "\n3.Save data"
                + "\n4.Display statistics"
                + "\n9.Quit"
                + "\nEnter the desired option: ";

        do {
            System.out.print(prompt);
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\t1.Insert data");
                    votes = DataMethods.createData(properties, votes);
                    break;
                case 2:
                    System.out.println("\t2.Sort by section");
                    votes = DataMethods.sortData(votes);
                    break;
                case 3:
                    System.out.println("\t3.Save data");
                    DataMethods.saveData(properties, votes, filename);
                    break;
                case 4:
                    System.out.println("\t4.Display statistics");
                    DataMethods.menuStatistics(properties, votes);
                    break;
                case 9:
                    System.out.println("\t9.Quit");
                    break;
                default:
                    System.out.println("\tInvalid option");
            }

        } while (option != 9);

        scan.close();
    }
}
