/*
 * Objective: ATM methods.
 * Implemented by Lucas deArruda
 * Created in 24/05/2023
 * v1.1
 */

// Package.
package automatictellermachine;

// Libraries.
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class DataMethods {
    public static DataObject initializeATM() {
        // Initialize the ATM machine.
        DataObject atm;
        int atmamount = 0;
        int atmqtd = 5; // Max. number of withdrawals.
        int[][] bills = { { 2, 5, 10, 20, 50, 100, 200 }, // Available bills.
                { 100, 100, 100, 100, 100, 100, 100 } }; // Bills' quantity.

        for (int i = 0; i < bills[0].length; i++) {
            atmamount += bills[0][i] * bills[1][i];
        }

        atm = new DataObject(bills, atmamount, atmqtd, 0, 0);

        System.out.println("\tOperation completed successfully");

        return atm;
    }

    public static void withdrawATM(DataObject atm) {
        // Perform a withdrawal operation.
        boolean flagwithdraw = false;
        int confirm;
        int value;
        int valuecheck;
        int[] bills;
        String prompt;

        if ((atm.withdrawqtd > atm.atmqtd) || (atm.atmamount - atm.withdrawamount <= 0)) {
            System.out.println("\tDaily withdrawal limit reached");
            return;
        }

        do {
            System.out.print("\tEnter value: ");
            value = DataMain.scan.nextInt();
            DataMain.scan.nextLine();

            if ((value < 2) || (value == 3)) {
                System.out.println("\tInvalid value");
            } else if (value > 3000) {
                System.out.println("\tWithdrawal limit: $3000.00");
            } else if (value > (atm.atmamount - atm.withdrawamount)) {
                System.out.println("\tWithdrawal exceeds available amount");
            } else {
                bills = countBills(atm, value);

                // Check if the countBills() returned the correct value.
                valuecheck = atm.bills[0][0] * bills[0];
                for (int i = 1; i < bills.length; i++) {
                    valuecheck += atm.bills[0][i] * bills[i];
                }
                if (valuecheck != value) {
                    System.out.println("\tInsufficient bills");
                    continue;
                }

                prompt = "\tBill $" + atm.bills[0][0] + ": " + bills[0];
                for (int i = 1; i < bills.length; i++) {
                    prompt += "\n\tBill $" + atm.bills[0][i] + ": " + bills[i];
                }
                prompt += "\n\tConfirm withdrawal [1.yes/9.no]: ";

                System.out.print(prompt);
                confirm = DataMain.scan.nextInt();
                DataMain.scan.nextLine();

                if (confirm != 1) {
                    System.out.println("\tOperation cancelled");
                } else { // Confirm withdrawal.
                    for (int i = 0; i < bills.length; i++) {
                        atm.bills[1][i] -= bills[i];
                    }

                    atm.withdrawamount += value;
                    atm.withdrawqtd++;
                    flagwithdraw = true;

                    System.out.println("\tWithdrawal completed.");
                }
            }
        } while (!flagwithdraw);
    }

    public static int[] countBills(DataObject atm, int value) {
        // Compute the amount of bills for a given value.
        int nbills;
        int[] bills = new int[atm.bills[0].length];

        // Exceptions.
        if ((value % 10 == 1) || (value % 10 == 3)) { // Subtract a $5 bill.
            bills[1]++;
            value -= atm.bills[0][1];
        }
        if ((value % 10 == 6) || (value % 10 == 8)) { // Subtract $2 bills.
            bills[0] += (value % 10) / 2;
            value -= (value % 10);
        }

        for (int i = (bills.length - 1); i >= 0; i--) { // Loop through each bill.
            nbills = value / atm.bills[0][i];

            if (nbills <= atm.bills[1][i]) {
                bills[i] += nbills;
                value -= atm.bills[0][i] * nbills;
            } else { // Use all available bills.
                bills[i] += atm.bills[1][i];
                value -= atm.bills[0][i] * atm.bills[1][i];
            }
        }

        return bills;
    }

    public static void displayStatistics(DataObject atm) {
        double[] stats = new double[5];

        if ((atm.withdrawamount == 0) && (atm.withdrawqtd == 0)) {
            System.out.println("\tNo operation performed.");
            return;
        }

        stats[0] = atm.atmamount;
        stats[1] = atm.withdrawamount / atm.withdrawqtd;
        stats[2] = atm.withdrawamount;
        stats[3] = atm.withdrawqtd;
        stats[4] = atm.atmamount - atm.withdrawamount;

        System.out.println("\tInitial Amount: " + stats[0]
                + "\n\tAverage Withdrawals: " + stats[1]
                + "\n\tTotal Withdrawals: " + stats[2]
                + "\n\tNumber of Withdrawals: " + stats[3]
                + "\n\tRemaining Amount: " + stats[4]);

        saveData(stats); // Export data to a text file.
    }

    public static void saveData(double[] stats) {
        // Store data in ".txt" file.
        String filename = System.getProperty("user.home") + "/Downloads/Output.txt";
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

            printWriter.print("ATM Statistics\n");
            printWriter.printf("%1$21s\t\t%2$7.2f\n", "Initial Amount", stats[0]);
            printWriter.printf("%1$21s\t\t%2$7.2f\n", "Average Withdrawals", stats[1]);
            printWriter.printf("%1$21s\t\t%2$7.2f\n", "Total Withdrawals", stats[2]);
            printWriter.printf("%1$21s\t\t%2$7.2f\n", "Number of Withdrawals", stats[3]);
            printWriter.printf("%1$21s\t\t%2$7.2f\n", "Remaining Amount", stats[4]);

            printWriter.close();

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println("\tData Saved");
    }

}
