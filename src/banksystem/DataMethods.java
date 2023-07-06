/*
 * Objective: Transaction and Register methods.
 * Implemented by Lucas deArruda
 * Created in 31/05/2023
 * v1.0
 */

// Package.
package banksystem;

public class DataMethods {
    public static void registerAccount(DataAccount[] accounts) {
        // Register Clients' account.
        /*
         * String name;
         * int code;
         * double balance;
         * double limit;
         * int type;
         * 
         * for (int i = 0; i < accounts.length; i++) {
         * System.out.printf("\tAccount %d\n", i + 1);
         * 
         * System.out.print("\tName: ");
         * name = DataMain.scan.nextLine();
         * 
         * System.out.print("\tAccount code: ");
         * code = DataMain.scan.nextInt();
         * DataMain.scan.nextLine();
         * 
         * System.out.print("\tBalance [$]: ");
         * balance = DataMain.scan.nextDouble();
         * DataMain.scan.nextLine();
         * 
         * System.out.print("\tLimit [$]: ");
         * limit = DataMain.scan.nextDouble();
         * DataMain.scan.nextLine();
         * 
         * System.out.print("\tAccount type: ");
         * type = DataMain.scan.nextInt();
         * DataMain.scan.nextLine();
         * 
         * accounts[i] = new DataAccount(name, code, balance, limit, type);
         * }
         */

        accounts[0] = new DataAccount("jose silva", 10, 800.00, 0.00, 1);
        accounts[1] = new DataAccount("maria souza", 13, 1200.00, 300.00, 4);
        accounts[2] = new DataAccount("mauro souza", 14, 900.00, 100.00, 2);
        accounts[3] = new DataAccount("carlos lima", 20, 3000.00, 2000.00, 3);
        accounts[4] = new DataAccount("caroline gomes", 23, 1750.00, 650.00, 2);

    }

    public static void registerTransaction(DataTransaction[] transactions) {
        // Register daily transaction.
        /*
         * int code;
         * double value;
         * int type;
         * int status;
         * 
         * for (int i = 0; i < transactions.length; i++) {
         * System.out.printf("\tTransaction %d\n", i + 1);
         * 
         * System.out.print("\tAccount code: ");
         * code = DataMain.scan.nextInt();
         * DataMain.scan.nextLine();
         * 
         * System.out.print("\tValue [$]: ");
         * balance = DataMain.scan.nextDouble();
         * DataMain.scan.nextLine();
         * 
         * System.out.print("\tTransaction type: ");
         * type = DataMain.scan.nextInt();
         * DataMain.scan.nextLine();
         * 
         * System.out.print("\tTransaction status: ");
         * status = DataMain.scan.nextInt();
         * DataMain.scan.nextLine();
         * 
         * transactions[i] = new DataTransaction(code, value, type, status);
         * }
         */

        transactions[0] = new DataTransaction(13, 300.00, 1, 1);
        transactions[1] = new DataTransaction(13, 50.00, 2, 1);
        transactions[2] = new DataTransaction(13, 100.00, 1, 1);
        transactions[3] = new DataTransaction(20, 2000.00, 2, 2);
        transactions[4] = new DataTransaction(20, 4000.00, 2, 2);
        transactions[5] = new DataTransaction(14, 300.00, 1, 1);
        transactions[6] = new DataTransaction(14, 450.00, 2, 1);
        transactions[7] = new DataTransaction(14, 50.00, 1, 1);
        transactions[8] = new DataTransaction(24, 2000.00, 2, 2);
        transactions[9] = new DataTransaction(24, 1000.00, 1, 1);
    }

    public static void updateBalance(DataAccount[] accounts, DataTransaction[] transactions,
            DataAccount[] updatedaccounts) {
                
    }
}
