/*
 * Objective: CRUD methods.
 * Implemented by Lucas deArruda
 * Created in 24/04/2023
 * v1.1
 */
// Package.
package studentfile;

public class DataMethods {
    public static DataObject[] createData(DataObject[] students) {
        // Read student's score.
        String firstname;
        String lastname;
        int score;

        for (int i = 0; i < students.length; i++) {
            System.out.printf("\tStudent %d\n", i);

            System.out.print("\tLast name: ");
            firstname = DataMain.scan.nextLine();

            System.out.print("\tFirst name: ");
            lastname = DataMain.scan.nextLine();

            System.out.print("\tScore: ");
            score = DataMain.scan.nextInt();
            DataMain.scan.nextLine();

            students[i] = new DataObject(firstname, lastname, score);
        }

        return students;
    }

    public static void displayData(DataObject[] students) {
        // Display student's scores.
        System.out.println("\tStudents' scores:");

        for (int i = 0; i < students.length; i++) {
            System.out.printf("\t%s, %s: %d\n",
                    students[i].lastname, students[i].firstname, students[i].score);
        }
    }
}
