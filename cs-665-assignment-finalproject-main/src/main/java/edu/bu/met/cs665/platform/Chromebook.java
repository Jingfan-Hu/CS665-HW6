package edu.bu.met.cs665.platform;

import edu.bu.met.cs665.operating.OperatingSystem;

// Chromebook platform class
public class Chromebook extends Platform {
    public Chromebook(OperatingSystem os) {
        super(os);
    }

    @Override
    public void run() {
        System.out.println("Chromebook is loading...");
        os.load();
        os.execute();
    }
}
