package edu.bu.met.cs665.operating;


// ChromeOS operating system class
public class ChromeOS implements OperatingSystem {
    @Override
    public void load() {
        System.out.println("ChromeOS is loading...");
    }

    @Override
    public void execute() {
        System.out.println("ChromeOS is executing...");
    }
}
