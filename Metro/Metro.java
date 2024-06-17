// -----------------------------------------------------
// Assignment (1)
// Part: (1)
// Written by: (Dalia Betinjaneh 40200966)
// -----------------------------------------------------


package Metro;
import TrainTram.Train;

/**
 * The `Metro` class represents a type of train-based transportation with information about the number of stops.
 * It inherits from the `Train` class and extends it with details about the total number of stops.
 */
public class Metro extends Train {
    protected int totalNumberOfStops;
    private static long SNcount = 25000;

    /**
     * Default constructor for creating a `Metro` object.
     * Initializes the object with default values.
     */
    public Metro() {
        super();
        totalNumberOfStops = 0;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Parameterized constructor for creating a `Metro` object with specific attributes.
     *
     * @param wheels        The number of wheels on the metro train.
     * @param speed         The maximum speed of the metro in km/hr.
     * @param vehicle       The number of metro vehicles.
     * @param starting      The name of the starting station.
     * @param destination   The name of the destination station.
     * @param numberOfStops The total number of stops along the metro route.
     */
    public Metro(int wheels, double speed, int vehicle, String starting, String destination, int numberOfStops) {
        super(wheels, speed, 0, starting, destination);
        this.totalNumberOfStops = numberOfStops;
        this.serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Copy constructor for creating a new `Metro` object that is a copy of an existing `Metro` object.
     *
     * @param a The `Metro` object to be copied.
     */
    public Metro(Metro a) {
        super(a);
        this.totalNumberOfStops = a.totalNumberOfStops;
        this.serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Get the next serial number that will be given to the next `Metro` object created.
     *
     * @return The next serial number.
     */
    public static long getNextSerialNumber() {
        return SNcount;
    }

    /**
     * Get the total number of stops along the metro route.
     *
     * @return The total number of stops.
     */
    public int getTotalNumberOfStops() {
        return totalNumberOfStops;
    }

    /**
     * Set the total number of stops along the metro route.
     *
     * @param a The total number of stops to be set.
     */
    public void setTotalNumberOfStops(int a) {
        totalNumberOfStops = a;
    }

    /**
     * Convert the `Metro` object to a string representation.
     *
     * @return A string describing the `Metro` object's attributes.
     */
    public String toString() {
        return "This Metro - serial #" + serialNumber + " - has " + nbWheels + " wheels, has a maximum speed of " + maxSpeed + " km/hr. It has " +
                nbOfVehicles + " and its starting and destination stations are " + nameOfStartingStation + " and " + nameOfDestinationStation + "." +
                " It has a total of " + totalNumberOfStops + " stops.";
    }

    /**
     * Check if this `Metro` object is equal to another object.
     *
     * @param a The object to compare.
     * @return `true` if the objects are equal, `false` otherwise.
     */
    public boolean equals(Object a) {
        if (a == null || this.getClass() != a.getClass())
            return false;
        else {
            Metro b = (Metro) a;
            return super.equals(b) && totalNumberOfStops == b.totalNumberOfStops;
        }
    }
}
