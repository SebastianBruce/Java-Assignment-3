package assignment3;

public class Computer extends Keyboard implements Button {
    // Interface method implementations
    @Override
    public void onClick() {
        boolean isClicked = true;
        System.out.println("Button clicked.");
    }

    @Override
    public void display() {
        if (isClicked) {
            System.out.println("Displaying information on screen.");
        } else {
            System.out.println("Button not clicked. Nothing to display.");
        }
    }

    // Abstract method implementations
    @Override
    public void connect() {
        System.out.println("Keyboard connected to computer.");
    }

    @Override
    public void disconnect() {
        System.out.println("Keyboard disconnected from computer.");
    }
}
