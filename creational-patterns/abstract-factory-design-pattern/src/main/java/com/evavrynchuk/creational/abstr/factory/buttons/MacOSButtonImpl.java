package com.evavrynchuk.creational.abstr.factory.buttons;

public class MacOSButtonImpl implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
