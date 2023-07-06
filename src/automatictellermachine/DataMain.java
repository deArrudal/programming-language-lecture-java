/*
 * Objective: Main menu.
 * Implemented by Lucas deArruda
 * Created in 24/05/2023
 * v1.0
 */

// Package.
package automatictellermachine;

// Libraries.
import java.util.Scanner;

public class DataMain {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ATM System");
        boolean flaginitialization = false;
        DataObject atm = new DataObject(null, 0, 0, 0, 0);
        int option;
        String prompt;

        prompt = "Menu:"
                + "\n1.Initialize ATM"
                + "\n2.Withdraw"
                + "\n3.Statistics"
                + "\n9.Quit"
                + "\nEnter option: ";

        do {
            System.out.print(prompt);
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    if (!flaginitialization) {
                        System.out.println("\tInitialize ATM");
                        atm = DataMethods.initializeATM();
                        flaginitialization = true; // Confirm initialization.
                    } else {
                        System.out.println("\tInvalid option");
                    }
                    break;
                case 2:
                    System.out.println("\tWithdraw");
                    DataMethods.withdrawATM(atm);
                    break;
                case 3:
                    System.out.println("\tStatistics");
                    DataMethods.displayStatistics(atm);
                    break;
                case 9:
                    System.out.println("\tQuit");
                    break;
                default:
                    System.out.println("\tInvalid option");
            }
        } while (option != 9);

        scan.close();
    }
}
