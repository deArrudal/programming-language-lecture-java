/*
 * Objective: Read and Write methods.
 * Implemented by Lucas deArruda
 * Created in 11/05/2023
 * v1.0
 */
// Package.
package votingmodel;

public class DataMethods {

    public static DataVoter[] registerVoter(DataVoter[] voters) {
        // Read voter's data.
        String name;
        int id;
        int section;

        for (int i = 0; i < voters.length; i++) {
            System.out.printf("\tVoter %d\n", i);

            System.out.print("\tName: ");
            name = DataMain.scan.nextLine();

            System.out.print("\tVoter's id: ");
            id = DataMain.scan.nextInt();
            DataMain.scan.nextLine();

            System.out.print("\tSection: ");
            section = DataMain.scan.nextInt();
            DataMain.scan.nextLine();

            voters[i] = new DataVoter(name, id, section);
        }

        System.out.println("\tVoters registered");
        return voters;
    }

    public static DataRound[][] menuVoting(int[] sections, String[][] candidates,
            DataVoter[] voters, DataRound[][] rounds) {
        // Display the menu for each vote round.
        int option;
        String prompt;

        // Sort valid sections for each round.
        int[][] roundsections = {
                { sections[0], sections[1], sections[2] },
                { sections[3], sections[4], sections[5] }
        };

        prompt = "\tMenu"
                + "\n\t1.First round"
                + "\n\t2.Second round"
                + "\n\t9.Return"
                + "\n\tEnter the desired option: ";

        do {
            System.out.print(prompt);
            option = DataMain.scan.nextInt();
            DataMain.scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\t\t1.First round");
                    rounds[0] = runVoting(roundsections[0], candidates, voters);
                    break;
                case 2:
                    System.out.println("\t\t2.Second round");
                    rounds[1] = runVoting(roundsections[1], candidates, voters);
                    break;
                case 9:
                    System.out.println("\t\t9.Return");
                    break;
                default:
                    System.out.println("\t\tError - Invalid option.");
            }

        } while (option != 9);

        return rounds;
    }

    public static DataRound[] runVoting(int[] roundsections, String[][] candidates,
            DataVoter[] voters) {
        // Simulate a voting round.
        String prompt;
        int id;
        boolean flag = false;
        int vote;
        int count = 0;

        DataRound[] round = new DataRound[5]; // Five voters per round.

        // Display valid sections.
        System.out.printf("\t\tSections: %d, %d, %d\n",
                roundsections[0], roundsections[1], roundsections[2]);

        prompt = "\t\t\tCandidates"
                + "\n\t\t\t" + candidates[1][0] + "." + candidates[0][0]
                + "\n\t\t\t" + candidates[1][1] + "." + candidates[0][1]
                + "\n\t\t\t" + candidates[1][2] + "." + candidates[0][2]
                + "\n\t\t\t" + candidates[1][3] + "." + candidates[0][3]
                + "\n\t\t\tCandidate's id: ";

        while (count < round.length) {
            // Read voter's id.
            System.out.print("\t\t\tVoter's id: ");
            id = DataMain.scan.nextInt();
            DataMain.scan.nextLine();

            flag = false;

            // Check if the voter's id is valid.
            for (int i = 0; i < voters.length && !flag; i++) {
                if ((id == voters[i].id) && (voters[i].voted == false)) {
                    for (int j = 0; j < roundsections.length && !flag; j++) {
                        if (voters[i].section == roundsections[j]) {
                            System.out.printf("\t\t\tVoter %d: %s\n",
                                    (count + 1), voters[i].name);

                            System.out.print(prompt);
                            vote = DataMain.scan.nextInt();
                            DataMain.scan.nextLine();

                            // Need to check if vote is valid.

                            round[count] = new DataRound(id, roundsections[j], vote);
                            voters[i].voted = true;

                            count++;
                            flag = true;
                        }
                    }
                }
            }

            if (flag == false) {
                System.out.println("\t\t\tInvalid entry");
            }
        }

        return round;
    }

    public static DataRound[] compileVote(int[] sections, DataRound[][] rounds,
            DataRound[] count) {
        // Consolidate voter's data in a single array.
        int id = 0;

        // Perform a balance line between the two rounds.
        for (int i = 0; i < sections.length; i++) {
            for (int j = 0; j < rounds.length; j++) { // Loop through each round.
                for (int k = 0; k < rounds[j].length; k++) {
                    if (rounds[j][k].section == sections[i]) {
                        count[id] = rounds[j][k];
                        id++;
                    }
                }
            }
        }

        System.out.println("\tData consolidated");
        return count;
    }

    public static void menuStatistics(String[][] candidates, DataVoter[] voters,
            DataRound[] count) {
        // Display voting's statistics.
        int option;
        String prompt;

        DataVoter[] candidatevotes = new DataVoter[candidates[0].length];
        candidatevotes = countVote(candidates, count, candidatevotes);

        prompt = "\tMenu"
                + "\n\t1.Show winner"
                + "\n\t2.Show second place"
                + "\n\t3.Compute blank votes"
                + "\n\t4.Compute null votes"
                + "\n\t5.Show voters"
                + "\n\t6.Show counting"
                + "\n\t9.Return"
                + "\n\tEnter the desired option: ";

        do {
            System.out.print(prompt);
            option = DataMain.scan.nextInt();
            DataMain.scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\t\t1.Show winner");
                    displayResult(candidatevotes, true, 1, 0);
                    break;
                case 2:
                    System.out.println("\t\t2.Show second place");
                    displayResult(candidatevotes, true, 2, 0);
                    break;
                case 3:
                    System.out.println("\t\t3.Compute blank votes");
                    displayResult(candidatevotes, false, 0, 3);
                    break;
                case 4:
                    System.out.println("\t\t4.Compute null votes");
                    displayResult(candidatevotes, false, 0, 4);
                    break;
                case 5:
                    System.out.println("\t\t5.Show voters");
                    displayVoters(voters);
                    break;
                case 6:
                    System.out.println("\t\t6.Show counting");
                    displayCount(candidatevotes);
                    break;
                case 9:
                    System.out.println("\t\t9.Return");
                    break;
                default:
                    System.out.println("\t\tError - Invalid option.");
            }

        } while (option != 9);
    }

    public static DataVoter[] countVote(String[][] candidates, DataRound[] count,
            DataVoter[] candidatevotes) {
        // Count votes by candidates.
        int id;

        for (int i = 0; i < candidates[0].length; i++) {
            id = Integer.parseInt(candidates[1][i]); // Get candidate's id.

            candidatevotes[i] = new DataVoter(candidates[0][i], id, 0);

            for (int j = 0; j < count.length; j++) { // Count candidate's votes.
                if (count[j].vote == id) {
                    candidatevotes[i].section++;
                }
            }
        }

        DataSort.sortCandidate(candidatevotes, 0, (candidatevotes.length - 1));

        return candidatevotes;
    }

    public static void displayResult(DataVoter[] candidatevotes, boolean flag,
            int position, int candidateid) {
        int index = 0;
        // Display the result name, given a parameter.
        if (flag) { // by position.
            index = candidatevotes.length - position;

            do {// ignore "nulo" or "branco".
                flag = true;

                if ((candidatevotes[index].name == "branco") ||
                        (candidatevotes[index].name == "nulo")) {
                    index--;
                    flag = false;
                }
            } while (flag == false);

        } else { // by candidate id.
            // Find candidate index.
            for (int i = 0; i < candidatevotes.length; i++) {
                if (candidatevotes[i].id == candidateid) {
                    index = i;
                    break;
                }
            }
        }

        System.out.printf("\t\t\tCandidate: %s\n\t\t\tNumber of votes: %d\n",
                candidatevotes[index].name, candidatevotes[index].section);
    }

    public static void displayVoters(DataVoter[] voters) {
        // Display voters list.
        System.out.println("\t\t\tVoters:");

        for (int i = 0; i < voters.length; i++) {
            if (voters[i].voted == true) {
                System.out.printf("\t\t\t%d\n", voters[i].id);
            }
        }
    }

    public static void displayCount(DataVoter[] candidatevotes) {
        // Display votes per candidate.
        System.out.println("\t\t\tName: Number of Votes");

        for (int i = 0; i < candidatevotes.length; i++) {
            System.out.printf("\t\t\t%s: %d\n",
                    candidatevotes[i].name, candidatevotes[i].section);
        }
    }
}
