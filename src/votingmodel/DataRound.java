/*
 * Objective: Data object - vote round (1st round, 2 round and count).
 * Implemented by Lucas deArruda
 * Created in 11/05/2023
 * v1.0
 */

// Package.
package votingmodel;

public class DataRound {
    // Class attributes.
    int id;
    int section;
    int vote;

    // Constructor.
    DataRound(int id, int section, int vote) {
        this.id = id;
        this.section = section;
        this.vote = vote;
    }

}
