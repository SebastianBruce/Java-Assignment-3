package assignment3;

import java.util.Scanner;

public abstract class Keyboard {
    // Instance variables
    protected String text;
    protected boolean backlit;

    // Concrete methods
    public void pressKey() {
        System.out.println("Key pressed.");
        backlit = true;
    }

    public void typeText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typing: ");
        text = scanner.nextLine();
        System.out.println(text);
    }

    // Abstract methods
    public abstract void connect(); // Method to connect the keyboard to a device
    public abstract void disconnect(); // Method to disconnect the keyboard from a device

    // Constructors
    public Keyboard() {
        // Default constructor
    }
    public Keyboard(String text, boolean backlit) {
        this.text = text;
        this.backlit = backlit;
    }
}

