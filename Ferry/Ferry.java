

package Ferry;
import WheeledTransportation.Transportation;

/**
 * The `Ferry` class represents a type of transportation for carrying passengers or cargo over water,
 * characterized by its maximum speed and load capacity.
 */
public class Ferry extends Transportation {
    // Variables
    private double maxSpeed;
    private double maxLoad;
    private static long SNcount = 70000;

    /**
     * Default constructor for creating a `Ferry` object.
     * Initializes the object with default values.
     */
    public Ferry() {
        maxSpeed = 0;
        maxLoad = 0;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Parameterized constructor for creating a `Ferry` object with specific attributes.
     *
     * @param speed The maximum speed of the ferry in km/hr.
     * @param load  The maximum load capacity of the ferry.
     */
    public Ferry(double speed, double load) {
        this.maxSpeed = speed;
        this.maxLoad = load;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Copy constructor for creating a new `Ferry` object that is a copy of an existing `Ferry` object.
     *
     * @param a The `Ferry` object to be copied.
     */
    public Ferry(Ferry a) {
        this.maxSpeed = a.maxSpeed;
        this.maxLoad = a.maxLoad;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Get the next serial number that will be given to the next `Ferry` object created.
     *
     * @return The next serial number.
     */
    public static long getNextSerialNumber() {
        return SNcount;
    }

    /**
     * Get the maximum speed of the ferry.
     *
     * @return The maximum speed of the ferry in km/hr.
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Get the maximum load capacity of the ferry.
     *
     * @return The maximum load capacity of the ferry.
     */
    public double getMaxLoad() {
        return maxLoad;
    }

    /**
     * Get the serial number of the ferry.
     *
     * @return The serial number of the ferry.
     */
    public long getSerialNumber() {
        return serialNumber;
    }

    /**
     * Set the maximum speed of the ferry.
     *
     * @param a The maximum speed of the ferry in km/hr.
     */
    public void setMaxSpeed(double a) {
        maxSpeed = a;
    }

    /**
     * Set the maximum load capacity of the ferry.
     *
     * @param a The maximum load capacity of the ferry.
     */
    public void setMaxLoad(double a) {
        maxLoad = a;
    }

    /**
     * Set the serial number of the ferry.
     *
     * @param a The serial number of the ferry.
     */
    public void setSerialNumber(long a) {
        this.serialNumber = a;
    }

    /**
     * Convert the `Ferry` object to a string representation.
     *
     * @return A string describing the `Ferry` object's attributes.
     */
    public String toString() {
        return "This Ferry - serial #" + serialNumber + " - has a max speed of " + maxSpeed +
                "km/hr. It has a maximum load of " + maxLoad + ".";
    }

    /**
     * Check if this `Ferry` object is equal to another object.
     *
     * @param a The object to compare.
     * @return `true` if the objects are equal, `false` otherwise.
     */
    public boolean equals(Object a) {
        if (a == null || this.getClass() != a.getClass())
            return false;
        else {
            Ferry b = (Ferry) a;
            return maxSpeed == b.maxSpeed && maxLoad == b.maxLoad;
        }
    }
}
