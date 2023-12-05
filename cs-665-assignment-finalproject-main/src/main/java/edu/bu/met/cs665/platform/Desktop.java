package edu.bu.met.cs665.platform;

import edu.bu.met.cs665.operating.OperatingSystem;

// Desktop platform class
public class Desktop extends Platform {
    public Desktop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void run() {
        System.out.println("Desktop is loading...");
        os.load();
        os.execute();
    }
}

