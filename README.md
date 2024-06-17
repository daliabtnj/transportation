# Transportation System Simulation

This project is a simulation of various transportation modes, implemented in Java. The simulation includes different types of transportation objects such as wheeled transportation, trains, trams, monowheels, metros, ferries, and aircraft. The project demonstrates the use of these objects and provides methods for comparing and copying them.

## Project Structure

The project is organized into the following packages:

- **AircraftAiroplane**
  - `Aircraft`
  - `WorldWarIIAirplane`
- **Ferry**
  - `Ferry`
- **Metro**
  - `Metro`
- **Monowheel**
  - `Monowheel`
- **TrainTram**
  - `Train`
  - `Tram`
- **WheeledTransportation**
  - `Transportation`
  - `WheeledTransportation`

## Features
- Object-Oriented Design
- Inheritance and Encapsulation
- Unique Serial Number Generation for each Transportation Type
- Detailed Class Descriptions and Methods

## Classes and Their Responsibilities

### AircraftAiroplane Package

#### Aircraft

Represents a type of transportation that can fly. It includes attributes like price, maximum elevation, and inherits attributes from the `Transportation` class.

#### Attributes:
- `price`: The price of the aircraft.
- `maxElevation`: Maximum elevation the aircraft can reach.
- `serialNumber`: Unique serial number for each Aircraft object.

#### Methods:
- Constructors (default, parameterized, copy)
- `getNextSerialNumber()`
- `getPrice()`
- `getMaxElevation()`
- `setPrice(double price)`
- `setMaxElevation(double elevation)`
- `toString()`
- `equals(Object obj)`

#### WorldWarIIAirplane

Represents a World War II-era airplane. It is characterized by its twin-engine capability and inherits attributes from the `Aircraft` class.

#### Attributes:
- Inherits all attributes from the `Aircraft` class.

#### Methods:
- Inherits all methods from the `Aircraft` class.

### Ferry Package

#### Ferry

Represents a type of transportation for carrying passengers or cargo over water. It includes attributes like maximum speed and load capacity and inherits from the `Transportation` class.

#### Attributes:
- `maxSpeed`: Maximum speed of the ferry.
- `loadCapacity`: Maximum load capacity of the ferry.
- `serialNumber`: Unique serial number for each Ferry object.

#### Methods:
- Constructors (default, parameterized, copy)
- `getNextSerialNumber()`
- `getMaxSpeed()`
- `getLoadCapacity()`
- `setMaxSpeed(double speed)`
- `setLoadCapacity(double capacity)`
- `toString()`
- `equals(Object obj)`

### Metro Package

#### Metro

Represents a type of urban public transport with a fixed track. Inherits attributes from the `Train` class and adds the number of stations.

#### Attributes:
- Inherits all attributes from the `Train` class.
- `totalNumberOfStations`: Total number of stations along the metro route.

#### Methods:
- Inherits all methods from the `Train` class.
- `getTotalNumberOfStations()`
- `setTotalNumberOfStations(int stations)`

### Monowheel Package

#### Monowheel

Represents a single-wheeled transportation mode. Inherits attributes from the `WheeledTransportation` class.

#### Attributes:
- Inherits all attributes from the `WheeledTransportation` class.

#### Methods:
- Inherits all methods from the `WheeledTransportation` class.

### TrainTram Package

#### Train

Represents a mode of transport that runs on tracks. Includes attributes like number of cars, maximum speed, start location, and end location.

#### Attributes:
- `nbOfCars`: Number of cars in the train.
- `startLocation`: Starting location of the train.
- `endLocation`: Ending location of the train.
- `serialNumber`: Unique serial number for each Train object.

#### Methods:
- Constructors (default, parameterized, copy)
- `getNextSerialNumber()`
- `getNbOfCars()`
- `getStartLocation()`
- `getEndLocation()`
- `setNbOfCars(int cars)`
- `setStartLocation(String location)`
- `setEndLocation(String location)`
- `toString()`
- `equals(Object obj)`

#### Tram

Similar to `Train`, but includes additional attributes such as the year it was built.

#### Attributes:
- Inherits all attributes from the `Metro` class.
- `yearBuilt`: Year the tram was built.

#### Methods:
- Inherits all methods from the `Metro` class.
- `getYearBuilt()`
- `setYearBuilt(int year)`

### WheeledTransportation Package

#### Transportation

The base class for all types of transportation in this project. Includes a serial number and methods for equality checking and string representation.

#### Attributes:
- `serialNumber`: Unique serial number for each Transportation object.

#### Methods:
- Constructors (default, parameterized, copy)
- `getNextSerialNumber()`
- `toString()`
- `equals(Object obj)`

#### WheeledTransportation

Inherits from `Transportation` and adds attributes specific to wheeled vehicles like the number of wheels and maximum speed.

#### Attributes:
- `nbWheels`: Number of wheels.
- `maxSpeed`: Maximum speed.
- `serialNumber`: Unique serial number for each WheeledTransportation object.

#### Methods:
- Constructors (default, parameterized, copy)
- `getNextSerialNumber()`
- `getNbWheels()`
- `getMaxSpeed()`
- `setNbWheels(int wheels)`
- `setMaxSpeed(double speed)`
- `toString()`
- `equals(Object obj)`


## Driver Classes

### Driver

Demonstrates the use of various transportation objects and includes a method to find and display the least and most expensive `Aircraft` objects from an array of `Transportation` objects.

### Driver2

Includes a method to copy an array of `Transportation` objects and demonstrates the use of various transportation objects similar to the `Driver` class.

## How to Run

To run the project, you can compile and execute the `Driver` and `Driver2` classes which contain the main methods. The main methods create instances of different transportation objects, demonstrate their usage, and test various methods such as equality checks and copy constructors.

// Example command to compile and run the Driver class
javac Driver.java
java Driver

// Example command to compile and run the Driver2 class
javac Driver2.java
java Driver2
