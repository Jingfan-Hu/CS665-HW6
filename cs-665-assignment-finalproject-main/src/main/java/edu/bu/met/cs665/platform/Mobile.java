package edu.bu.met.cs665.platform;

import edu.bu.met.cs665.operating.OperatingSystem;

// Mobile platform class
public class Mobile extends Platform {
    public Mobile(OperatingSystem os) {
        super(os);
    }

    @Override
    public void run() {
        System.out.println("Mobile is loading...");
        os.load();
        os.execute();
    }
}
