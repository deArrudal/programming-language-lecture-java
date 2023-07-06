/*
 * Objective: Data object.
 * Implemented by Lucas deArruda
 * Created in 27/04/2023
 * v1.1
 */

// Package.
package studentfile;

public class DataObject {
    // Class attributes.
    String firstname;
    String lastname;
    int score;

    // Constructor.
    DataObject(String firstname, String lastname, int score) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.score = score;
    }
}