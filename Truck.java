package assignment3;

public class Truck extends Vehicle {
    // Instance variables
    protected int seats;
    public double trunkSpace;

    // Constructors

    // a) Default constructor
    public Truck() {
        super();
    }

    // b) Constructors mirroring the constructors of the Vehicle class
    public Truck(String color, int numberOfDoors, boolean gasPowered) {
        super(color, numberOfDoors, gasPowered);
    }

    public Truck(String color, boolean gasPowered) {
        super(color, gasPowered);
    }

    public Truck(int numberOfDoors, boolean gasPowered) {
        super(numberOfDoors, gasPowered);
    }

    public Truck(String color) {
        super(color);
    }

    // c) Constructor with 3 instance variables of Vehicle & seats instance variable of Truck
    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
    }

    // d) Constructor with 3 instance variables of Vehicle & trunk space instance variable of Truck
    public Truck(String color, int numberOfDoors, boolean gasPowered, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.trunkSpace = trunkSpace;
    }

    // e) Constructor with 3 instance variables of Vehicle & both instance variables of Truck
    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        Truck truck = (Truck) obj;
        return seats == truck.seats &&
                Double.compare(truck.trunkSpace, trunkSpace) == 0;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", numberOfDoors=" + getNumberOfDoors() +
                ", gasPowered=" + isGasPowered() +
                ", seats=" + seats +
                ", trunkSpace=" + trunkSpace +
                '}';
    }

    // Override isEcoFriendly method
    @Override
    public boolean isEcoFriendly() {
        return (getNumberOfDoors() == 2 && !isGasPowered()) || (seats <= 2 && trunkSpace == 0);
    }
}
