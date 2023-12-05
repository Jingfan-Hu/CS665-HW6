package edu.bu.met.cs665.platform;

import edu.bu.met.cs665.operating.OperatingSystem;

// Tablet platform class
public class Tablet extends Platform {
    public Tablet(OperatingSystem os) {
        super(os);
    }

    @Override
    public void run() {
        System.out.println("Tablet is loading...");
        os.load();
        os.execute();
    }
}