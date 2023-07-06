/*
 * Objective: Entry point and principal menu.
 * Implemented by Lucas deArruda
 * Created in 24/04/2023
 * v1.1
 */

// Package.
package transitsystem;

// Libraries.
import java.util.Scanner;

public class DataMain {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Transit System Analysis 2020");
        int option;
        String prompt;
        DataObject[] cities = new DataObject[5];

        prompt = "Menu"
                + "\n1.Insert data"
                + "\n2.Search by interval"
                + "\n3.Search by maximum/minimum"
                + "\n4.Search cities above average"
                + "\n9.Quit"
                + "\nEnter the desired option: ";

        do {
            System.out.print(prompt);
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\t1.Insert data");
                    cities = DataMethods.createData(cities);
                    break;
                case 2:
                    System.out.println("\t2.Search by interval");
                    DataMethods.displayByInterval(cities);
                    break;
                case 3:
                    System.out.println("\t3.Search by maximum/minimum");
                    DataMethods.displayByMaxMin(cities);
                    break;
                case 4:
                    System.out.println("\t4.Search cities above average");
                    DataMethods.displayByAverage(cities);
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
