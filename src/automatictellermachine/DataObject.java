/*
 * Objective: ATM object.
 * Implemented by Lucas deArruda
 * Created in 24/05/2023
 * v1.0
 */

// Package.
package automatictellermachine;

public class DataObject {
    // Class attributes.
    int[][] bills;
    int atmamount;
    int atmqtd;
    int withdrawamount;
    int withdrawqtd;

    // Constructor.
    DataObject(int[][] bills, int atmamount, int atmqtd, int withdrawamount,
            int withdrawqtd) {
        this.bills = bills;
        this.atmamount = atmamount;
        this.atmqtd = atmqtd;
        this.withdrawamount = withdrawamount;
        this.withdrawqtd = withdrawqtd;
    }
}
