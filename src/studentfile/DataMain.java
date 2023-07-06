/*
 * Objective: Entry point and principal menu.
 * Implemented by Lucas deArruda
 * Created in 27/04/2023
 * v1.1
 */
// Package.
package studentfile;

// Libraries.
import java.util.Scanner;

public class DataMain {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Student System");
        int option;
        String prompt;
        DataObject[] students = new DataObject[10];

        prompt = "Menu"
                + "\n1.Insert data"
                + "\n2.Display data"
                + "\n9.Quit"
                + "\nEnter the desired option: ";

        do {
            System.out.print(prompt);
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\t1.Insert data");
                    students = DataMethods.createData(students);
                    break;
                case 2:
                    System.out.println("\t2.Display data");
                    DataMethods.displayData(students);
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
