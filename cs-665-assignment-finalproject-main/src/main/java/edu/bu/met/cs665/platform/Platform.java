package edu.bu.met.cs665.platform;

import edu.bu.met.cs665.operating.OperatingSystem;

// Platform abstract class
public abstract class Platform {
    protected OperatingSystem os;

    public Platform(OperatingSystem os) {
        this.os = os;
    }

    public abstract void run();
}
