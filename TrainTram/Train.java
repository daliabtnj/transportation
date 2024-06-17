// -----------------------------------------------------
// Assignment (1)
// Part: (1)
// Written by: (Dalia Betinjaneh 40200966)
// -----------------------------------------------------


package TrainTram;
import WheeledTransportation.WheeledTransportation;

/**
 * The `Train` class represents a type of wheeled transportation with additional properties.
 * It inherits from the `WheeledTransportation` class and extends it with details about the train's stations and number of vehicles.
 */
public class Train extends WheeledTransportation {
    protected int nbOfVehicles;
    protected String nameOfStartingStation;
    protected String nameOfDestinationStation;
    private static long SNcount = 10000;

    /**
     * Default constructor for creating a `Train` object.
     * Initializes the object with default values.
     */
    public Train() {
        super();
        serialNumber = SNcount;
        SNcount++;
        nbOfVehicles = 0;
        nameOfStartingStation = "";
        nameOfDestinationStation = "";
    }

    /**
     * Parameterized constructor for creating a `Train` object with specific attributes.
     *
     * @param wheels              The number of wheels on the train.
     * @param speed               The maximum speed of the train in km/hr.
     * @param vehicle             The number of vehicles.
     * @param starting            The name of the starting station.
     * @param destination         The name of the destination station.
     */
    public Train(int wheels, double speed, int vehicle, String starting, String destination) {
        super(wheels, speed);
        this.nbOfVehicles = vehicle;
        this.nameOfStartingStation = starting;
        this.nameOfDestinationStation = destination;
        serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Copy constructor for creating a new `Train` object that is a copy of an existing `Train` object.
     *
     * @param a The `Train` object to be copied.
     */
    public Train(Train a) {
        super(a);
        this.nbOfVehicles = a.nbOfVehicles;
        this.nameOfStartingStation = a.nameOfStartingStation;
        this.nameOfDestinationStation = a.nameOfDestinationStation;
        this.serialNumber = SNcount;
        SNcount++;
    }

    /**
     * Get the next serial number that will be given to the next `Train` object created.
     *
     * @return The next serial number.
     */
    public static long getNextSerialNumber() {
        return SNcount;
    }

    /**
     * Get the number of vehicles of the train.
     *
     * @return The number of vehicles.
     */
    public int getNbOfVehicles() {
        return nbOfVehicles;
    }

    /**
     * Get the name of the starting station of the train.
     *
     * @return The name of the starting station.
     */
    public String getNameOfStartingStation() {
        return nameOfStartingStation;
    }

    /**
     * Get the name of the destination station of the train.
     *
     * @return The name of the destination station.
     */
    public String getNameOfDestinationStation() {
        return nameOfDestinationStation;
    }

    /**
     * Set the number of vehicles of the train.
     *
     * @param a The number of vehicles to be set.
     */
    public void setNbOfVehicles(int a) {
        nbOfVehicles = a;
    }

    /**
     * Set the name of the starting station of the train.
     *
     * @param a The name of the starting station to be set.
     */
    public void setNameOfStartingStation(String a) {
        nameOfStartingStation = a;
    }

    /**
     * Set the name of the destination station of the train.
     *
     * @param a The name of the destination station to be set.
     */
    public void setNameOfDestinationStation(String a) {
        nameOfDestinationStation = a;
    }

    /**
     * Convert the `Train` object to a string representation.
     *
     * @return A string describing the `Train` object's attributes.
     */
    public String toString() {
        return "This Train - serial #" + serialNumber + " - has " + nbWheels + " wheels, has a maximum speed of " + maxSpeed + " km/hr. It has " +
                nbOfVehicles + " and its starting and destination stations are " + nameOfStartingStation + " and " + nameOfDestinationStation + ".";
    }

    /**
     * Check if this `Train` object is equal to another object.
     *
     * @param a The object to compare.
     * @return `true` if the objects are equal, `false` otherwise.
     */
    public boolean equals(Object a) {
        if (a == null || this.getClass() != a.getClass())
            return false;
        else {
            Train b = (Train) a;
            return super.equals(b) && nbOfVehicles == b.nbOfVehicles && nameOfStartingStation.equals(b.nameOfStartingStation) && nameOfDestinationStation.equals(b.nameOfDestinationStation);
        }
    }
}
