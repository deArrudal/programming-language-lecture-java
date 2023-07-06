/*
 * Objective: Transaction object.
 * Implemented by Lucas deArruda
 * Created in 31/05/2023
 * v1.0
 */

// Package.
package banksystem;

public class DataTransaction {
    // Class attributes.
    int code;
    double value;
    int type;
    int status;

    // Constructor.
    DataTransaction(int code, double value, int type, int status) {
        this.code = code;
        this.value = value;
        this.type = type;
        this.status = status;
    }
}
