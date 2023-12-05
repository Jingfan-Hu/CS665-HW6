package edu.bu.met.cs665.operating;

// iOS operating system class
public class Ios implements OperatingSystem {
    @Override
    public void load() {
        System.out.println("iOS is loading...");
    }

    @Override
    public void execute() {
        System.out.println("iOS is executing...");
    }
}
