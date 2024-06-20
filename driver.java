
import WheeledTransportation.WheeledTransportation;
import TrainTram.Train;
import TrainTram.Tram;
import Monowheel.Monowheel;
import Metro.Metro;
import Ferry.Ferry;
import AircraftAiroplane.Aircraft;
import AircraftAiroplane.WorldWarIIAirplane;
import WheeledTransportation.Transportation;

/**
 * This is a driver class that demonstrates the use of various transportation objects and related methods.
 */
public class driver {

    /**
     * Finds and displays the least and most expensive Aircraft objects from an array of Transportation objects.
     *
     * @param array An array of Transportation objects to search for Aircraft objects.
     */
    public static void findLeastAndMostExpensiveAircraft(Transportation[] array) {
        Aircraft leastExpensive = null;
        Aircraft mostExpensive = null;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Aircraft) {
                Aircraft aircraft = (Aircraft) array[i];
                if (leastExpensive == null || aircraft.getPrice() < leastExpensive.getPrice())
                    leastExpensive = aircraft;
                if (mostExpensive == null || aircraft.getPrice() > mostExpensive.getPrice())
                    mostExpensive = aircraft;
            }
        }

        if (leastExpensive != null && mostExpensive != null) {
            System.out.println("Least expensive aircraft: " + leastExpensive);
            System.out.println("Most expensive aircraft: " + mostExpensive);
        }

        if (leastExpensive == mostExpensive && leastExpensive != null) {
            System.out.println("The most expensive and least expensive aircrafts are " + leastExpensive);
        }
        if (leastExpensive == null)
            System.out.println("There are no aircrafts in the list.");
    }

    /**
     * The main method that demonstrates the use of various transportation objects.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        WheeledTransportation wh1 = new WheeledTransportation(4, 10);
        WheeledTransportation wh2 = new WheeledTransportation(8, 9);
        WheeledTransportation wh3 = new WheeledTransportation(wh1); // test copy constructor
        WheeledTransportation wh4 = new WheeledTransportation(8, 9); // test equals

        Train train1 = new Train(3, 55, 6, "New York", "Montreal");
        Train train2 = new Train(4, 10, 9, "Madrid", "Barcelona");
        Train train3 = new Train(4, 10, 9, "Madrid", "Barcelona"); // test equals
        Train train4 = new Train(train1); // test copy constructor

        Metro metro1 = new Metro(4, 10, 9, "Madrid", "Barcelona", 7);
        Metro metro2 = new Metro(9, 6, 50, "Paris", "Nice", 9);

        Tram tram1 = new Tram(4, 10, 9, "Madrid", "Barcelona", 7, 2022);
        Tram tram2 = new Tram(9, 6, 50, "Paris", "Nice", 9, 2001);

        Monowheel mw1 = new Monowheel(1, 10, 100);
        Monowheel mw2 = new Monowheel(1, 40, 150);

        Ferry ferry1 = new Ferry(50.5, 700.8);
        Ferry ferry2 = new Ferry(70.9, 600);

        Aircraft aircraft1 = new Aircraft(80000, 700);
        Aircraft aircraft2 = new Aircraft(50000, 500);
        Aircraft aircraft3 = new Aircraft(aircraft1); // test copy constructor

        WorldWarIIAirplane ww20 = new WorldWarIIAirplane(90000, 700, false);
        WorldWarIIAirplane ww21 = new WorldWarIIAirplane(40000, 500, true);

        // Display info using toString
        System.out.println(wh1.toString());
        System.out.println(wh2.toString());
        System.out.println(wh3.toString());
        System.out.println(wh4.toString() + "\n");

        System.out.println(train1.toString());
        System.out.println(train2.toString());
        System.out.println(train3.toString());
        System.out.println(train4.toString() + "\n");

        System.out.println(metro1.toString());
        System.out.println(metro2.toString() + "\n");

        System.out.println(tram1.toString());
        System.out.println(tram2.toString() + "\n");

        System.out.println(mw1.toString());
        System.out.println(mw2.toString() + "\n");

        System.out.println(ferry1.toString());
        System.out.println(ferry2.toString() + "\n");

        System.out.println(aircraft1.toString());
        System.out.println(aircraft2.toString());
        System.out.println(aircraft3.toString() + "\n");

        System.out.println(ww20.toString());
        System.out.println(ww21.toString() + "\n");

        // Test the equality of objects
        // 2 objects from different classes
        System.out.println(ferry1.equals(mw2));
        System.out.println(train1.equals(metro1));
        System.out.println();

        // Two objects from the same class with different values
        System.out.println(aircraft1.equals(aircraft2));
        System.out.println(tram1.equals(tram2));
        System.out.println();

        // Two objects with similar values
        System.out.println(train2.equals(train3));
        System.out.println(wh2.equals(wh4));
        System.out.println();

        // Test copy constructor
        System.out.println(wh1.equals(wh3));
        System.out.println(train1.equals(train4));
        System.out.println(aircraft1.equals(aircraft3));
        System.out.println();

        // Create arrays of 20 objects
        Transportation[] mixedArray1 = {wh1, wh2, wh3, wh4, train1, train2, train3, metro1, metro2, tram1, tram2, mw1, mw2, ferry1, ferry2, aircraft1, aircraft2, ww20, ww21};
        Transportation[] mixedArray2 = {wh1, wh2, wh3, wh4, train1, train2, train3, train4, metro1, metro2, tram1, tram2, mw1, mw2, ferry1, ferry2};

        // Test the findLeastAndMostExpensiveAircraft method on arrays
        findLeastAndMostExpensiveAircraft(mixedArray1);
        System.out.println();
        findLeastAndMostExpensiveAircraft(mixedArray2);
        
        System.out.println("\nProgram will terminate.");
    }
}
