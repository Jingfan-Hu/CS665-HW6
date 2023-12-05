package edu.bu.met.cs665;

import edu.bu.met.cs665.operating.*;
import edu.bu.met.cs665.platform.*;

public class Main {
    public static void main(String[] args) {
        // Create different combinations of operating systems and platforms
        OperatingSystem windows = new Windows();
        OperatingSystem linux = new Linux();
        OperatingSystem unix = new Unix();
        OperatingSystem iOS = new Ios();
        OperatingSystem chromeOS = new ChromeOS();

        Platform desktop = new Desktop(windows);
        Platform mobile = new Mobile(linux);
        Platform unixTablet = new Tablet(unix); // Unix + Tablet
        Platform iOSMobile = new Mobile(iOS);   // iOS + Mobile
        Platform chromebook = new Chromebook(chromeOS); // ChromeOS + Chromebook

        // Run different combinations of platforms and operating systems
        desktop.run();
        mobile.run();
        unixTablet.run();
        iOSMobile.run();
        chromebook.run();
    }
}