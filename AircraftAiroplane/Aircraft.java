// -----------------------------------------------------
// Assignment (1)
// Part: (1)
// Written by: (Dalia Betinjaneh 40200966)
// -----------------------------------------------------


package AircraftAiroplane;
import WheeledTransportation.Transportation;

/**
 * The `Aircraft` class represents a type of transportation that can fly.
 * It includes attributes like price, maximum elevation, and inherits attributes from the `Transportation` class.
 */
public class Aircraft extends Transportation {
    // variables initialization
    protected double price;
    protected double maxElevation;
    private static long SNcount = 0;

    /**
     * Default constructor for creating an `Aircraft` object.
     * Initializes the object with default values.
     */
    public Aircraft() {
        price = 0;
        maxElevation = 0;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Parameterized constructor for creating an `Aircraft` object with specific attributes.
     *
     * @param pr       The price of the aircraft.
     * @param elevation The maximum elevation the aircraft can reach.
     */
    public Aircraft(double pr, double elevation) {
        price = pr;
        maxElevation = elevation;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Copy constructor for creating a new `Aircraft` object that is a copy of an existing `Aircraft` object.
     *
     * @param a The `Aircraft` object to be copied.
     */
    public Aircraft(Aircraft a) {
        this.price = a.price;
        this.maxElevation = a.maxElevation;
        this.serialNumber = a.serialNumber;
    }

    /**
     * Get the price of the aircraft.
     *
     * @return The price of the aircraft.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the maximum elevation the aircraft can reach.
     *
     * @return The maximum elevation of the aircraft.
     */
    public double getMaxElevation() {
        return maxElevation;
    }

    /**
     * Get the serial number of the aircraft.
     *
     * @return The serial number of the aircraft.
     */
    public long getSerialNumber() {
        return serialNumber;
    }

    /**
     * Set the price of the aircraft.
     *
     * @param a The price of the aircraft.
     */
    public void setPrice(double a) {
        price = a;
    }

    /**
     * Set the maximum elevation of the aircraft.
     *
     * @param a The maximum elevation of the aircraft.
     */
    public void setMaxElevation(double a) {
        maxElevation = a;
    }

    /**
     * Convert the `Aircraft` object to a string representation.
     *
     * @return A string describing the `Aircraft` object's attributes.
     */
    public String toString() {
        return "This Aircraft - serial #" + serialNumber + " - has a price of " + price +
                " and a maximum elevation of " + maxElevation + ".";
    }

    /**
     * Check if this `Aircraft` object is equal to another object.
     *
     * @param a The object to compare.
     * @return `true` if the objects are equal, `false` otherwise.
     */
    public boolean equals(Object a) {
        if (this.getClass() != a.getClass() || a == null)
            return false;
        else {
            Aircraft b = (Aircraft) a;
            return b.price == this.price && b.maxElevation == this.maxElevation;
        }
    }
}
