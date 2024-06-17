// -----------------------------------------------------
// Assignment (1)
// Part: (1)
// Written by: (Dalia Betinjaneh 40200966)
// -----------------------------------------------------


package AircraftAiroplane;

/**
 * The `WorldWarIIAirplane` class represents a type of aircraft, specifically a World War II-era airplane.
 * It is characterized by its twin-engine capability and inherits attributes from the `Aircraft` class.
 */
public class WorldWarIIAirplane extends Aircraft {
    private boolean twinEngine;
    private static long SNcount = 80000;

    /**
     * Default constructor for creating a `WorldWarIIAirplane` object.
     * Initializes the object with default values.
     */
    public WorldWarIIAirplane() {
        super();
        twinEngine = true;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Parameterized constructor for creating a `WorldWarIIAirplane` object with specific attributes.
     *
     * @param speed   The maximum speed of the World War II airplane.
     * @param load    The maximum load capacity of the airplane.
     * @param engine  Indicates whether the airplane has twin engines (true) or not (false).
     */
    public WorldWarIIAirplane(double speed, double load, boolean engine) {
        super(speed, load);
        twinEngine = engine;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Copy constructor for creating a new `WorldWarIIAirplane` object that is a copy of an existing `WorldWarIIAirplane` object.
     *
     * @param a The `WorldWarIIAirplane` object to be copied.
     */
    public WorldWarIIAirplane(WorldWarIIAirplane a) {
        this.twinEngine = a.twinEngine;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Get the next serial number that will be given to the next `WorldWarIIAirplane` object created.
     *
     * @return The next serial number.
     */
    public static long getNextSerialNumber() {
        return SNcount;
    }

    /**
     * Get the twin-engine status of the airplane.
     *
     * @return `true` if the airplane has twin engines, `false` otherwise.
     */
    public boolean getTwinEngine() {
        return twinEngine;
    }

    /**
     * Set the twin-engine status of the airplane.
     *
     * @param a Indicates whether the airplane has twin engines (true) or not (false).
     */
    public void setTwinEngine(boolean a) {
        this.twinEngine = a;
    }

    /**
     * Convert the `WorldWarIIAirplane` object to a string representation.
     *
     * @return A string describing the `WorldWarIIAirplane` object's attributes.
     */
    public String toString() {
        String bool = "no";
        if (twinEngine) {
            bool = "a";
        }
        return "This World War II aircraft - serial #" + serialNumber + " - has a price of " + price +
                " and a maximum elevation of " + maxElevation + ". It has " + bool + " twin engine.";
    }

    /**
     * Check if this `WorldWarIIAirplane` object is equal to another object.
     *
     * @param a The object to compare.
     * @return `true` if the objects are equal, `false` otherwise.
     */
    public boolean equals(Object a) {
        if (a == null || a.getClass() != this.getClass())
            return false;
        else {
            WorldWarIIAirplane b = (WorldWarIIAirplane) a;
            return this.twinEngine == b.twinEngine;
        }
    }
}
