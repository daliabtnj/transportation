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

## Classes and Their Responsibilities

### AircraftAiroplane Package

#### Aircraft

Represents a type of transportation that can fly. It includes attributes like price, maximum elevation, and inherits attributes from the `Transportation` class.

#### WorldWarIIAirplane

Represents a World War II-era airplane. It is characterized by its twin-engine capability and inherits attributes from the `Aircraft` class.

### Ferry Package

#### Ferry

Represents a type of transportation for carrying passengers or cargo over water. It includes attributes like maximum speed and load capacity and inherits from the `Transportation` class.

### Metro Package

#### Metro

Represents a type of urban public transport with a fixed track. Inherits attributes from the `Train` class and adds the number of stations.

### Monowheel Package

#### Monowheel

Represents a single-wheeled transportation mode. Inherits attributes from the `WheeledTransportation` class.

### TrainTram Package

#### Train

Represents a mode of transport that runs on tracks. Includes attributes like number of cars, maximum speed, start location, and end location.

#### Tram

Similar to `Train`, but includes additional attributes such as the year it was built.

### WheeledTransportation Package

#### Transportation

The base class for all types of transportation in this project. Includes a serial number and methods for equality checking and string representation.

#### WheeledTransportation

Inherits from `Transportation` and adds attributes specific to wheeled vehicles like the number of wheels and maximum speed.

## Driver Classes

### Driver

Demonstrates the use of various transportation objects and includes a method to find and display the least and most expensive `Aircraft` objects from an array of `Transportation` objects.

### Driver2

Includes a method to copy an array of `Transportation` objects and demonstrates the use of various transportation objects similar to the `Driver` class.

## How to Run

To run the project, you can compile and execute the `Driver` and `Driver2` classes which contain the main methods. The main methods create instances of different transportation objects, demonstrate their usage, and test various methods such as equality checks and copy constructors.

```java
// Example command to compile and run the Driver class
javac Driver.java
java Driver

// Example command to compile and run the Driver2 class
javac Driver2.java
java Driver2
