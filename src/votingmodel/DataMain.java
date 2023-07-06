/*
 * Objective: Entry point and principal menu.
 * Implemented by Lucas deArruda
 * Created in 11/05/2023
 * v1.0
 */

// Package.
package votingmodel;

// Libraries.
import java.util.Scanner;

public class DataMain {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Election 2021");
        int option;
        String prompt;
        int[] sections = { 1, 3, 4, 5, 9, 10 };
        String[][] candidates = { { "jose", "maria", "branco", "nulo" },
                { "1", "2", "3", "4" } };
        DataVoter[] voters = new DataVoter[10]; // Ten voters.
        DataRound[][] rounds = new DataRound[2][5]; // Five voters per round.
        DataRound[] count = new DataRound[10];

        prompt = "Menu"
                + "\n1.Register voter"
                + "\n2.Voting process"
                + "\n3.Consolidate data"
                + "\n4.Display statistics"
                + "\n9.Quit"
                + "\nEnter the desired option: ";

        do {
            System.out.print(prompt);
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\t1.Register voter");
                    voters = DataMethods.registerVoter(voters);
                    break;
                case 2:
                    System.out.println("\t2.Voting process");
                    rounds = DataMethods.menuVoting(sections, candidates, voters,
                            rounds);
                    break;
                case 3:
                    System.out.println("\t3.Consolidate data");
                    count = DataMethods.compileVote(sections, rounds, count);
                    break;
                case 4:
                    System.out.println("\t4.Display statistics");
                    DataMethods.menuStatistics(candidates, voters, count);
                    break;
                case 9:
                    System.out.println("\t9.Quit");
                    break;
                default:
                    System.out.println("\tError - Invalid option.");
            }

        } while (option != 9);

        scan.close();
    }
}
