package edu.bu.met.cs665.operating;

// Linux operating system class
public class Linux implements OperatingSystem {
    @Override
    public void load() {
        System.out.println("Linux is loading...");
    }

    @Override
    public void execute() {
        System.out.println("Linux is executing...");
    }
}
