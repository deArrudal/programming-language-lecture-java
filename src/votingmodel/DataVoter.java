/*
 * Objective: Data object - voter.
 * Implemented by Lucas deArruda
 * Created in 11/05/2023
 * v1.0
 */

// Package.
package votingmodel;

public class DataVoter {
    // Class attributes.
    String name;
    int id;
    int section;
    boolean voted = false;

    // Constructor.
    DataVoter(String name, int id, int section) {
        this.name = name;
        this.id = id;
        this.section = section;
    }
}
