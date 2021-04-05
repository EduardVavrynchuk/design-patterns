package com.evavrynchuk.structural.bridge;

import com.evavrynchuk.structural.bridge.devices.Device;
import com.evavrynchuk.structural.bridge.devices.RadioDeviceImpl;
import com.evavrynchuk.structural.bridge.devices.TVDeviceImpl;
import com.evavrynchuk.structural.bridge.remotes.AdvancedRemoteImpl;
import com.evavrynchuk.structural.bridge.remotes.BasicRemoteImpl;

public class Demo {

    public static void main(String[] args) {
        testDevice(new TVDeviceImpl());
        testDevice(new RadioDeviceImpl());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemoteImpl basicRemote = new BasicRemoteImpl(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemoteImpl advancedRemote = new AdvancedRemoteImpl(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
