/*
 * Objective: CRUD methods.
 * Implemented by Lucas deArruda
 * Created in 24/04/2023
 * v1.1
 */

// Package.
package transitsystem;

public class DataMethods {
    public static DataObject[] createData(DataObject[] cities) {
        // Read city's data.
        String name;
        int code;
        int accidents;

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("\tCity %d\n", i);

            System.out.print("\tName: ");
            name = DataMain.scan.nextLine();

            System.out.print("\tCode: ");
            code = DataMain.scan.nextInt();
            DataMain.scan.nextLine();

            System.out.print("\tAccidents: ");
            accidents = DataMain.scan.nextInt();
            DataMain.scan.nextLine();

            cities[i] = new DataObject(name, code, accidents);
        }

        return cities;
    }

    public static void displayByInterval(DataObject[] cities) {
        // Given an interval, display cities inside it.
        int min = 100;
        int max = 150;

        System.out.printf("\tRange: %d, %d\n", min, max);

        System.out.println("\tCities with traffic accidents inside the range:");
        for (int i = 0; i < cities.length; i++) {
            if ((cities[i].accidents > min) && (cities[i].accidents < max)) {
                System.out.printf("\t%s, %d\n", cities[i].name, cities[i].accidents);
            }
        }
    }

    public static void displayByMaxMin(DataObject[] cities) {
        // Display cities with most and least accidents.
        DataObject max = cities[0];
        DataObject min = max;

        for (int i = 1; i < cities.length; i++) {
            if (cities[i].accidents > max.accidents) {
                max = cities[i];
            } else if (cities[i].accidents < min.accidents) {
                min = cities[i];
            }
        }

        System.out.println("\tNumber of traffic accidents:");

        System.out.printf("\tMaximum: %s, %d\n\tMinimum: %s, %d\n",
                max.name, max.accidents, min.name, min.accidents);
    }

    public static void displayByAverage(DataObject[] cities) {
        // Display cities with numbers above the average.
        double average = 0;

        for (int i = 0; i < cities.length; i++) {
            average += ((double) cities[i].accidents) / cities.length;
        }

        System.out.printf("\tAverage: %.2f\n", average);

        System.out.println("\tCities with accidents above the Average:");
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].accidents > average) {
                System.out.printf("\t%s, %d\n", cities[i].name, cities[i].accidents);
            }
        }
    }
}
