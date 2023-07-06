/*
 * Objective: Main menu.
 * Implemented by Lucas deArruda
 * Created in 31/05/2023
 * v1.0
 */

// Package.
package banksystem;

// Libraries.
import java.util.Scanner;

public class DataMain {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bank System");
        int option;
        String prompt;
        DataAccount[] accounts = new DataAccount[5];
        DataTransaction[] transactions = new DataTransaction[10];
        DataAccount[] updatedaccounts = new DataAccount[5];

        prompt = "Menu:"
                + "\n1.Register accounts"
                + "\n2.Register transactions"
                + "\n3.Update balance"
                + "\n4.Menu data"
                + "\n9.Quit"
                + "\nEnter option: ";

        do {
            System.out.print(prompt);
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\tRegister accounts");
                    DataMethods.registerAccount(accounts);
                    break;
                case 2:
                    System.out.println("\tRegister transactions");
                    DataMethods.registerTransaction(transactions);
                    break;
                case 3:
                    System.out.println("\tUpdate balance");
                    DataMethods.updateBalance(accounts, transactions, updatedaccounts);
                    break;
                case 4:
                    System.out.println("\tMenu data");
                    displayMenuData();
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

    public static void displayMenuData() {
        int option;
        String prompt;

        prompt = "\t1.Accounts"
                + "\n\t2.Transactions"
                + "\n\t3.Updated balance"
                + "\n\t9.Return"
                + "\n\tEnter option: ";

        do {
            System.out.print(prompt);
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\t\tAccounts");
                    break;
                case 2:
                    System.out.println("\t\tTransactions");
                    break;
                case 3:
                    System.out.println("\t\tUpdated balance");
                    break;
                case 9:
                    System.out.println("\t\tReturn");
                    break;
                default:
                    System.out.println("\t\tInvalid option");
            }
        } while (option != 9);
    }
}
