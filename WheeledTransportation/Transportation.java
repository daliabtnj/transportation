
/**
 * The `Transportation` class represents a generic transportation object.
 * It contains a serial number that uniquely identifies each transportation object.
 */
package WheeledTransportation;

public class Transportation {
    protected long serialNumber;

    /**
     * Default constructor for creating a `Transportation` object.
     */
    public Transportation() {
    }

    /**
     * Copy constructor for creating a new `Transportation` object that is a copy of an existing object.
     *
     * @param a The `Transportation` object to be copied.
     */
    public Transportation(Transportation a) {
        this.serialNumber = a.serialNumber;
    }
}
