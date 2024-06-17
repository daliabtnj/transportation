// -----------------------------------------------------
// Assignment (1)
// Part: (1)
// Written by: (Dalia Betinjaneh 40200966)
// -----------------------------------------------------


/**
 * The `Tram` class represents a type of metro transportation with additional properties.
 * It inherits from the `Metro` class and extends it with the year of creation information.
 */
package TrainTram;
import Metro.Metro;

public class Tram extends Metro {
    // Variables initialization
    private int yearOfCreation;
    private static long SNcount = 30000;

    /**
     * Default constructor for creating a `Tram` object.
     * Initializes the object with default values and a specified year of creation.
     */
    public Tram() {
        super();
        yearOfCreation = 2023;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Parameterized constructor for creating a `Tram` object with specific attributes.
     *
     * @param wheels               The number of wheels on the tram.
     * @param speed                The maximum speed of the tram in km/hr.
     * @param vehicle              The number of vehicles.
     * @param starting             The name of the starting station.
     * @param destination          The name of the destination station.
     * @param totalNumberOfStops   The total number of stops.
     * @param year                 The year of creation of the tram.
     */
    public Tram(int wheels, double speed, int vehicle, String starting, String destination, int totalNumberOfStops, int year) {
        super(wheels, speed, 0, starting, destination, totalNumberOfStops);
        this.yearOfCreation = year;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Copy constructor for creating a new `Tram` object that is a copy of an existing `Tram` object.
     *
     * @param a The `Tram` object to be copied.
     */
    public Tram(Tram a) {
        super(a);
        this.yearOfCreation = a.yearOfCreation;
        this.serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Get the next serial number that will be given to the next `Tram` object created.
     *
     * @return The next serial number.
     */
    public static long getNextSerialNumber() {
        return SNcount;
    }

    /**
     * Get the year of creation of the tram.
     *
     * @return The year of creation.
     */
    public int getYearOfCreation() {
        return yearOfCreation;
    }

    /**
     * Set the year of creation of the tram.
     *
     * @param a The year of creation to be set.
     */
    public void setYearOfCreation(int a) {
        this.yearOfCreation = a;
    }

    /**
     * Convert the `Tram` object to a string representation.
     *
     * @return A string describing the `Tram` object's attributes.
     */
    public String toString() {
        return "This Tram - serial #" + serialNumber + " - has " + nbWheels + " wheels, has a maximum speed of " + maxSpeed + " km/hr. It has " +
                nbOfVehicles + " and its starting and destination stations are " + nameOfStartingStation + " and " + nameOfDestinationStation + "." +
                " It has a total of " + totalNumberOfStops + " stops." +
                " The Tram was created in " + yearOfCreation + ".";
    }

    /**
     * Check if this `Tram` object is equal to another object.
     *
     * @param a The object to compare.
     * @return `true` if the objects are equal, `false` otherwise.
     */
    public boolean equals(Object a) {
        if (a == null || this.getClass() != a.getClass())
            return false;
        else {
            Tram b = (Tram) a;
            return super.equals(b) && yearOfCreation == b.yearOfCreation;
        }
    }
}
