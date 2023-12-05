package edu.bu.met.cs665.operating;

// Unix operating system class
public class Unix implements OperatingSystem {
    @Override
    public void load() {
        System.out.println("Unix is loading...");
    }

    @Override
    public void execute() {
        System.out.println("Unix is executing...");
    }
}
