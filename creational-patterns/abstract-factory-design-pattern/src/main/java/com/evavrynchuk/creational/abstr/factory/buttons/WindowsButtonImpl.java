package com.evavrynchuk.creational.abstr.factory.buttons;

public class WindowsButtonImpl implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
