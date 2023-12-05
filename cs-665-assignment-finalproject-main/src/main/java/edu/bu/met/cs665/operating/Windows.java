package edu.bu.met.cs665.operating;

// Windows operating system class
public class Windows implements OperatingSystem {
    @Override
    public void load() {
        System.out.println("Windows is loading...");
    }

    @Override
    public void execute() {
        System.out.println("Windows is executing...");
    }
}
