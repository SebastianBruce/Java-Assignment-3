package assignment3;

public class Vehicle {
    // Instance variables
    private String color;
    private int numberOfDoors;
    private boolean gasPowered;

    // Constructors
    public Vehicle() {
        // Default constructor
    }

    public Vehicle(String color, int numberOfDoors, boolean gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    public Vehicle(String color, boolean gasPowered) {
        this.color = color;
        this.gasPowered = gasPowered;
    }

    public Vehicle(int numberOfDoors, boolean gasPowered) {
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    public Vehicle(String color) {
        this.color = color;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isGasPowered() {
        return gasPowered;
    }

    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Vehicle vehicle = (Vehicle) obj;
        return numberOfDoors == vehicle.numberOfDoors &&
                gasPowered == vehicle.gasPowered &&
                color.equals(vehicle.color);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", gasPowered=" + gasPowered +
                '}';
    }

    // Method to check if the vehicle is eco-friendly
    public boolean isEcoFriendly() {
        return numberOfDoors == 2 && !gasPowered;
    }
}

