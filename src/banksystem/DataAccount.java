/*
 * Objective: Client's account object.
 * Implemented by Lucas deArruda
 * Created in 31/05/2023
 * v1.0
 */

// Package.
package banksystem;

public class DataAccount {
    // Class attributes.
    String name;
    int code;
    double balance;
    double limit;
    int type;

    // Constructor.
    DataAccount(String name, int code, double balance, double limit, int type) {
        this.name = name;
        this.code = code;
        this.balance = balance;
        this.limit = limit;
        this.type = type;
    }
}
