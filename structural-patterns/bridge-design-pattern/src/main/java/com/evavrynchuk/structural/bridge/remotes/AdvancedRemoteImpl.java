package com.evavrynchuk.structural.bridge.remotes;

import com.evavrynchuk.structural.bridge.devices.Device;

public class AdvancedRemoteImpl extends BasicRemoteImpl {

    public AdvancedRemoteImpl(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
