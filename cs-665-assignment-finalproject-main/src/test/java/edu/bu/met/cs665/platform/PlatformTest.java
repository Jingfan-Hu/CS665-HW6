package edu.bu.met.cs665.platform;

import edu.bu.met.cs665.operating.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PlatformTest {
    @Test
    public void testDesktopRun() {
        OperatingSystem windows = new Windows();
        Platform desktop = new Desktop(windows);
        desktop.run();
        assertEquals("Desktop is loading...\nWindows is loading...\nWindows is executing...\n", getOutput(desktop));
    }

    @Test
    public void testMobileRun() {
        OperatingSystem linux = new Linux();
        Platform mobile = new Mobile(linux);
        mobile.run();
        assertEquals("Mobile is loading...\nLinux is loading...\nLinux is executing...\n", getOutput(mobile));
    }

    @Test
    public void testUnixTabletRun() {
        OperatingSystem unix = new Unix();
        Platform unixTablet = new Tablet(unix);
        unixTablet.run();
        assertEquals("Tablet is loading...\nUnix is loading...\nUnix is executing...\n", getOutput(unixTablet));
    }

    @Test
    public void testIOSMobileRun() {
        OperatingSystem ios = new Ios();
        Platform iOSMobile = new Mobile(ios);
        iOSMobile.run();
        assertEquals("Mobile is loading...\niOS is loading...\niOS is executing...\n", getOutput(iOSMobile));
    }

    @Test
    public void testChromebookRun() {
        OperatingSystem chromeOS = new ChromeOS();
        Platform chromebook = new Chromebook(chromeOS);
        chromebook.run();
        assertEquals("Chromebook is loading...\nChromeOS is loading...\nChromeOS is executing...\n", getOutput(chromebook));
    }

    // Helper method to capture output
    private String getOutput(Platform platform) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        platform.run();
        String output = outputStream.toString();

        System.setOut(originalOut);
        return output;
    }
}