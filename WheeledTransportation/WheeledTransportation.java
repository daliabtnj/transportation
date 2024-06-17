// -----------------------------------------------------
// Assignment (1)
// Part: (1)
// Written by: (Dalia Betinjaneh 40200966)
// -----------------------------------------------------


/**
 * The `WheeledTransportation` class represents a type of transportation with wheels.
 * It is a subclass of the `Transportation` class.
 */
package WheeledTransportation;

/**
 * 
 */
public class WheeledTransportation extends Transportation {
    protected int nbWheels;
    protected double maxSpeed;
    protected long serialNumber;
    private static long SNcount = 0;

    /**
     * Default constructor for WheeledTransportation.
     * Initializes the number of wheels to 4, maximum speed to 0, and assigns a serial number.
     */
    public WheeledTransportation() {
        nbWheels = 4;
        maxSpeed = 0;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Parameterized constructor for WheeledTransportation.
     * Initializes the number of wheels and maximum speed based on the provided values
     * and assigns a serial number.
     *
     * @param wheels   The number of wheels.
     * @param mSpeed   The maximum speed in kilometers per hour.
     */
    public WheeledTransportation(int wheels, double mSpeed) {
        nbWheels = wheels;
        maxSpeed = mSpeed;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Copy constructor for WheeledTransportation.
     * Creates a copy of the given WheeledTransportation object.
     *
     * @param a The WheeledTransportation object to be copied.
     */
    public WheeledTransportation(WheeledTransportation a) {
        this.nbWheels = a.nbWheels;
        this.maxSpeed = a.maxSpeed;
        this.serialNumber = a.serialNumber;
    }

    /**
     * Get the number of wheels of this WheeledTransportation.
     *
     * @return The number of wheels.
     */
    public int getNbWheels() {
        return nbWheels;
    }

    /**
     * Get the maximum speed of this WheeledTransportation in kilometers per hour.
     *
     * @return The maximum speed.
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Set the number of wheels of this WheeledTransportation.
     *
     * @param wheels The number of wheels to set.
     */
    public void setNbWheels(int wheels) {
        nbWheels = wheels;
    }

    /**
     * Set the maximum speed of this WheeledTransportation.
     *
     * @param speed The maximum speed in kilometers per hour to set.
     */
    public void setMaxSpeed(double speed) {
        maxSpeed = speed;
    }

    /**
     * Get a string representation of this WheeledTransportation.
     *
     * @return A string describing this WheeledTransportation.
     */
    public String toString() {
        return "This WheeledTransportation - serial #" + serialNumber + " - has " + nbWheels + " wheels, has a maximum speed of " + maxSpeed + " km/hr.";
    }

    /**
     * Check if this WheeledTransportation is equal to another object.
     *
     * @param a The object to compare with.
     * @return `true` if the objects are equal, `false` otherwise.
     */
    public boolean equals(Object a) {
        if (a == null)
            return false;
        if (getClass() != a.getClass())
            return false;

        WheeledTransportation b = (WheeledTransportation) a;

        return nbWheels == b.nbWheels && maxSpeed == b.maxSpeed;
    }
}
