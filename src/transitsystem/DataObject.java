/*
 * Objective: Data object.
 * Implemented by Lucas deArruda
 * Created in 24/04/2023
 * v1.1
 */

// Package.
package transitsystem;

public class DataObject {
    // Class attributes.
    String name;
    int code;
    int accidents;

    // Constructor.
    DataObject(String name, int code, int accidents) {
        this.name = name;
        this.code = code;
        this.accidents = accidents;
    }
}
